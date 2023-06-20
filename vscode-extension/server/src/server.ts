import {
  DidChangeConfigurationNotification,
  InitializeParams,
  InitializeResult,
  ProposedFeatures,
  TextDocumentSyncKind,
  TextDocuments,
  createConnection,
} from "vscode-languageserver/node";

import { TextDocument } from "vscode-languageserver-textdocument";
import { DocumentHandler, createHandler } from "./handler";

// Create a connection for the server, using Node's IPC as a transport.
// Also include all preview / proposed LSP features.
export const connection = createConnection(ProposedFeatures.all);

// Create a simple text document manager.
export const documents: TextDocuments<TextDocument> = new TextDocuments(
  TextDocument
);
const documentHandlers: Map<string, DocumentHandler> = new Map();

let hasConfigurationCapability = false;
let hasWorkspaceFolderCapability = false;
let hasDiagnosticRelatedInformationCapability = false;

connection.onInitialize((params: InitializeParams) => {
  const capabilities = params.capabilities;

  // Does the client support the `workspace/configuration` request?
  // If not, we fall back using global settings.
  hasConfigurationCapability = !!(
    capabilities.workspace && !!capabilities.workspace.configuration
  );
  hasWorkspaceFolderCapability = !!(
    capabilities.workspace && !!capabilities.workspace.workspaceFolders
  );
  hasDiagnosticRelatedInformationCapability = !!(
    capabilities.textDocument &&
    capabilities.textDocument.publishDiagnostics &&
    capabilities.textDocument.publishDiagnostics.relatedInformation
  );

  const result: InitializeResult = {
    capabilities: {
      textDocumentSync: TextDocumentSyncKind.Incremental,
      // Tell the client that this server supports code completion.
      completionProvider: {
        resolveProvider: false,
        triggerCharacters: [".", ""],
      },
      hoverProvider: true,
      documentSymbolProvider: true,
      definitionProvider: true,
    },
  };
  if (hasWorkspaceFolderCapability) {
    result.capabilities.workspace = {
      workspaceFolders: {
        supported: true,
      },
    };
  }

  return result;
});

// The content of a text document has changed. This event is emitted
// when the text document first opened or when its content has changed.
documents.onDidChangeContent(async (event) => {
  documentHandlers.set(
    event.document.uri,
    await createHandler(
      event.document.uri,
      documents.get(event.document.uri)!.getText(),
      connection
    )
  );
});

documents.onDidOpen(async (event) => {
  documentHandlers.set(
    event.document.uri,
    await createHandler(
      event.document.uri,
      documents.get(event.document.uri)!.getText(),
      connection
    )
  );
});

documents.onDidClose((event) => {
  documentHandlers.delete(event.document.uri);
});

connection.onInitialized(() => {
  connection.console.log("onInitialized");

  if (hasConfigurationCapability) {
    // Register for all configuration changes.
    connection.client.register(
      DidChangeConfigurationNotification.type,
      undefined
    );
  }
  if (hasWorkspaceFolderCapability) {
    connection.workspace.onDidChangeWorkspaceFolders((event_) => {
      connection.console.log("Workspace folder change event received.");
    });
  }

  connection.console.log(documents.all().toString());
});

// This handler provides the initial list of the completion items.
connection.onCompletion((...params) =>
  documentHandlers.get(params[0].textDocument.uri)!.handleCompletion(...params)
);
connection.onHover((...params) =>
  documentHandlers.get(params[0].textDocument.uri)!.handleHover(...params)
);

connection.onDocumentSymbol((...params) =>
  documentHandlers
    .get(params[0].textDocument.uri)!
    .handleDocumentSymbol(...params)
);

connection.onDefinition((...params) =>
  documentHandlers.get(params[0].textDocument.uri)!.handleDefinition(...params)
);

// Make the text document manager listen on the connection
// for open, change and close text document events
documents.listen(connection);

// Listen on the connection
connection.listen();
