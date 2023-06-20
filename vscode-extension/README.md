# Scheduler Language support for VS Code

A Visual Studio Code extension that enables support for the Scheduler Language implemented using the Language Server Protocol.

## Features
- syntax highlighting
- basic completion (works most of the time)
- snippets
- basic linting, including typechecking
- file outline
- go to definition
- hover tooltips showing types

## Usage

The extension can be installed by using the **Extensions: Install from VSIX** command from the Command Palette and selecting the `scheduler-language-extension-X.Y.Z.vsix` file found at the root of this directory. 

Alternatively, use the command line:
```
$ code --install-extension scheduler-language-extension-X.Y.Z.vsix
```

## Development
### Running the extension
To launch a new VS Code window running the extension, use the **Launch Extension Client** configuration available in `launch.json`.

### Packaging the `.vsix` file
```
npx vsce package
```
