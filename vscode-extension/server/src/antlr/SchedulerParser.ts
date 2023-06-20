// Generated from ./src/antlr/Scheduler.g4 by ANTLR 4.9.0-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { SchedulerListener } from "./SchedulerListener";
import { SchedulerVisitor } from "./SchedulerVisitor";


export class SchedulerParser extends Parser {
	public static readonly T__0 = 1;
	public static readonly T__1 = 2;
	public static readonly T__2 = 3;
	public static readonly CLASS_ATTRIBUTE = 4;
	public static readonly TYPENAME = 5;
	public static readonly CLASSNAME = 6;
	public static readonly DAYNAME = 7;
	public static readonly CLASSESTOKEN = 8;
	public static readonly DAYSTOKEN = 9;
	public static readonly MULTIPLY = 10;
	public static readonly DIVIDE = 11;
	public static readonly ADD = 12;
	public static readonly SUBTRACT = 13;
	public static readonly EQUAL = 14;
	public static readonly NOT_EQUAL = 15;
	public static readonly LESS_THAN = 16;
	public static readonly GREATER_THAN = 17;
	public static readonly LESS_THAN_OR_EQUAL = 18;
	public static readonly GREATER_THAN_OR_EQUAL = 19;
	public static readonly AND = 20;
	public static readonly OR = 21;
	public static readonly NOT = 22;
	public static readonly IN = 23;
	public static readonly OVERLAP = 24;
	public static readonly OPEN_PAREN = 25;
	public static readonly CLOSE_PAREN = 26;
	public static readonly OPEN_BRACKET = 27;
	public static readonly CLOSE_BRACKET = 28;
	public static readonly DOT = 29;
	public static readonly COMMA = 30;
	public static readonly COLON = 31;
	public static readonly SINGLEEQUAL = 32;
	public static readonly COLLECTION_OF = 33;
	public static readonly ADD_CANVA = 34;
	public static readonly UPDATE_CANVA = 35;
	public static readonly DELETE_CANVA = 36;
	public static readonly GET_CANVA = 37;
	public static readonly WHERE = 38;
	public static readonly SATISFYING = 39;
	public static readonly AT = 40;
	public static readonly ON = 41;
	public static readonly DEF = 42;
	public static readonly IF = 43;
	public static readonly ELIF = 44;
	public static readonly ELSE = 45;
	public static readonly FOR = 46;
	public static readonly WHILE = 47;
	public static readonly RETURN = 48;
	public static readonly BREAK = 49;
	public static readonly OPEN_CURLY = 50;
	public static readonly CLOSE_CURLY = 51;
	public static readonly DISTINCT = 52;
	public static readonly PRINT = 53;
	public static readonly DATESTOKEN = 54;
	public static readonly LOADTOKEN = 55;
	public static readonly DUMPTOKEN = 56;
	public static readonly INT = 57;
	public static readonly BOOL = 58;
	public static readonly STRING = 59;
	public static readonly DATE = 60;
	public static readonly TIME = 61;
	public static readonly WS = 62;
	public static readonly VARNAME = 63;
	public static readonly COMMENT_LINE = 64;
	public static readonly COMMENT = 65;
	public static readonly RULE_prog = 0;
	public static readonly RULE_code = 1;
	public static readonly RULE_instruction = 2;
	public static readonly RULE_instruction_without_semicolon = 3;
	public static readonly RULE_canvas_instruction = 4;
	public static readonly RULE_block = 5;
	public static readonly RULE_print = 6;
	public static readonly RULE_load = 7;
	public static readonly RULE_dump = 8;
	public static readonly RULE_file_path = 9;
	public static readonly RULE_add = 10;
	public static readonly RULE_update = 11;
	public static readonly RULE_delete = 12;
	public static readonly RULE_get = 13;
	public static readonly RULE_start_date = 14;
	public static readonly RULE_end_date = 15;
	public static readonly RULE_transfer_statement = 16;
	public static readonly RULE_loop = 17;
	public static readonly RULE_for_loop = 18;
	public static readonly RULE_while_loop = 19;
	public static readonly RULE_if_statement = 20;
	public static readonly RULE_condition = 21;
	public static readonly RULE_function = 22;
	public static readonly RULE_args = 23;
	public static readonly RULE_arg = 24;
	public static readonly RULE_func_call = 25;
	public static readonly RULE_def = 26;
	public static readonly RULE_classDef = 27;
	public static readonly RULE_dayDef = 28;
	public static readonly RULE_assign = 29;
	public static readonly RULE_attribute = 30;
	public static readonly RULE_attribute_call = 31;
	public static readonly RULE_day_attribute = 32;
	public static readonly RULE_collection = 33;
	public static readonly RULE_collection_elements = 34;
	public static readonly RULE_collection_element = 35;
	public static readonly RULE_collection_subscription = 36;
	public static readonly RULE_expr = 37;
	public static readonly RULE_type = 38;
	public static readonly RULE_structure = 39;
	public static readonly RULE_value = 40;
	public static readonly RULE_comments = 41;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"prog", "code", "instruction", "instruction_without_semicolon", "canvas_instruction", 
		"block", "print", "load", "dump", "file_path", "add", "update", "delete", 
		"get", "start_date", "end_date", "transfer_statement", "loop", "for_loop", 
		"while_loop", "if_statement", "condition", "function", "args", "arg", 
		"func_call", "def", "classDef", "dayDef", "assign", "attribute", "attribute_call", 
		"day_attribute", "collection", "collection_elements", "collection_element", 
		"collection_subscription", "expr", "type", "structure", "value", "comments",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, "';'", "'START DATE'", "'END DATE'", undefined, undefined, 
		"'CLASS'", "'DAY'", "'CLASSES'", "'DAYS'", "'*'", "'/'", "'+'", "'-'", 
		"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'AND'", "'OR'", "'NOT'", 
		"'IN'", "'@'", "'('", "')'", "'['", "']'", "'.'", "','", "':'", "'='", 
		"'COLLECTION OF'", "'ADD'", "'UPDATE'", "'DELETE'", "'GET'", "'WHERE'", 
		"'SATISFYING'", "'AT'", "'ON'", "'DEF'", "'IF'", "'ELIF'", "'ELSE'", "'FOR'", 
		"'WHILE'", "'RETURN'", "'BREAK'", "'{'", "'}'", "'DISTINCT'", "'PRINT'", 
		"'DATES'", "'LOAD'", "'DUMP'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, "CLASS_ATTRIBUTE", "TYPENAME", 
		"CLASSNAME", "DAYNAME", "CLASSESTOKEN", "DAYSTOKEN", "MULTIPLY", "DIVIDE", 
		"ADD", "SUBTRACT", "EQUAL", "NOT_EQUAL", "LESS_THAN", "GREATER_THAN", 
		"LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", "AND", "OR", "NOT", "IN", 
		"OVERLAP", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"DOT", "COMMA", "COLON", "SINGLEEQUAL", "COLLECTION_OF", "ADD_CANVA", 
		"UPDATE_CANVA", "DELETE_CANVA", "GET_CANVA", "WHERE", "SATISFYING", "AT", 
		"ON", "DEF", "IF", "ELIF", "ELSE", "FOR", "WHILE", "RETURN", "BREAK", 
		"OPEN_CURLY", "CLOSE_CURLY", "DISTINCT", "PRINT", "DATESTOKEN", "LOADTOKEN", 
		"DUMPTOKEN", "INT", "BOOL", "STRING", "DATE", "TIME", "WS", "VARNAME", 
		"COMMENT_LINE", "COMMENT",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(SchedulerParser._LITERAL_NAMES, SchedulerParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return SchedulerParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "Scheduler.g4"; }

	// @Override
	public get ruleNames(): string[] { return SchedulerParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return SchedulerParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(SchedulerParser._ATN, this);
	}
	// @RuleVersion(0)
	public prog(): ProgContext {
		let _localctx: ProgContext = new ProgContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, SchedulerParser.RULE_prog);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 85;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (((((_la - 2)) & ~0x1F) === 0 && ((1 << (_la - 2)) & ((1 << (SchedulerParser.T__1 - 2)) | (1 << (SchedulerParser.T__2 - 2)) | (1 << (SchedulerParser.TYPENAME - 2)) | (1 << (SchedulerParser.CLASSNAME - 2)) | (1 << (SchedulerParser.DAYNAME - 2)) | (1 << (SchedulerParser.NOT - 2)) | (1 << (SchedulerParser.OPEN_PAREN - 2)) | (1 << (SchedulerParser.OPEN_BRACKET - 2)) | (1 << (SchedulerParser.COLLECTION_OF - 2)))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.IF - 34)) | (1 << (SchedulerParser.FOR - 34)) | (1 << (SchedulerParser.WHILE - 34)) | (1 << (SchedulerParser.RETURN - 34)) | (1 << (SchedulerParser.BREAK - 34)) | (1 << (SchedulerParser.PRINT - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)) | (1 << (SchedulerParser.COMMENT_LINE - 34)) | (1 << (SchedulerParser.COMMENT - 34)))) !== 0)) {
				{
				this.state = 84;
				this.code();
				}
			}

			this.state = 87;
			this.match(SchedulerParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public code(): CodeContext {
		let _localctx: CodeContext = new CodeContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, SchedulerParser.RULE_code);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 97;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				this.state = 97;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 2, this._ctx) ) {
				case 1:
					{
					this.state = 91;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 1, this._ctx) ) {
					case 1:
						{
						this.state = 89;
						this.instruction();
						}
						break;

					case 2:
						{
						this.state = 90;
						this.canvas_instruction();
						}
						break;
					}
					this.state = 93;
					this.match(SchedulerParser.T__0);
					}
					break;

				case 2:
					{
					this.state = 95;
					this.instruction_without_semicolon();
					}
					break;

				case 3:
					{
					this.state = 96;
					this.comments();
					}
					break;
				}
				}
				this.state = 99;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while (((((_la - 2)) & ~0x1F) === 0 && ((1 << (_la - 2)) & ((1 << (SchedulerParser.T__1 - 2)) | (1 << (SchedulerParser.T__2 - 2)) | (1 << (SchedulerParser.TYPENAME - 2)) | (1 << (SchedulerParser.CLASSNAME - 2)) | (1 << (SchedulerParser.DAYNAME - 2)) | (1 << (SchedulerParser.NOT - 2)) | (1 << (SchedulerParser.OPEN_PAREN - 2)) | (1 << (SchedulerParser.OPEN_BRACKET - 2)) | (1 << (SchedulerParser.COLLECTION_OF - 2)))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.IF - 34)) | (1 << (SchedulerParser.FOR - 34)) | (1 << (SchedulerParser.WHILE - 34)) | (1 << (SchedulerParser.RETURN - 34)) | (1 << (SchedulerParser.BREAK - 34)) | (1 << (SchedulerParser.PRINT - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)) | (1 << (SchedulerParser.COMMENT_LINE - 34)) | (1 << (SchedulerParser.COMMENT - 34)))) !== 0));
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public instruction(): InstructionContext {
		let _localctx: InstructionContext = new InstructionContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, SchedulerParser.RULE_instruction);
		try {
			this.state = 106;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 4, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 101;
				this.def();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 102;
				this.assign();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 103;
				this.expr(0);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 104;
				this.transfer_statement();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 105;
				this.print();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public instruction_without_semicolon(): Instruction_without_semicolonContext {
		let _localctx: Instruction_without_semicolonContext = new Instruction_without_semicolonContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, SchedulerParser.RULE_instruction_without_semicolon);
		try {
			this.state = 111;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.IF:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 108;
				this.if_statement();
				}
				break;
			case SchedulerParser.TYPENAME:
			case SchedulerParser.CLASSNAME:
			case SchedulerParser.DAYNAME:
			case SchedulerParser.COLLECTION_OF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 109;
				this.function();
				}
				break;
			case SchedulerParser.FOR:
			case SchedulerParser.WHILE:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 110;
				this.loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public canvas_instruction(): Canvas_instructionContext {
		let _localctx: Canvas_instructionContext = new Canvas_instructionContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, SchedulerParser.RULE_canvas_instruction);
		try {
			this.state = 121;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.ADD_CANVA:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 113;
				this.add();
				}
				break;
			case SchedulerParser.UPDATE_CANVA:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 114;
				this.update();
				}
				break;
			case SchedulerParser.DELETE_CANVA:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 115;
				this.delete();
				}
				break;
			case SchedulerParser.GET_CANVA:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 116;
				this.get();
				}
				break;
			case SchedulerParser.T__1:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 117;
				this.start_date();
				}
				break;
			case SchedulerParser.T__2:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 118;
				this.end_date();
				}
				break;
			case SchedulerParser.LOADTOKEN:
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 119;
				this.load();
				}
				break;
			case SchedulerParser.DUMPTOKEN:
				this.enterOuterAlt(_localctx, 8);
				{
				this.state = 120;
				this.dump();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public block(): BlockContext {
		let _localctx: BlockContext = new BlockContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, SchedulerParser.RULE_block);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 123;
			this.match(SchedulerParser.OPEN_CURLY);
			this.state = 124;
			this.code();
			this.state = 125;
			this.match(SchedulerParser.CLOSE_CURLY);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public print(): PrintContext {
		let _localctx: PrintContext = new PrintContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, SchedulerParser.RULE_print);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 127;
			this.match(SchedulerParser.PRINT);
			this.state = 128;
			this.expr(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public load(): LoadContext {
		let _localctx: LoadContext = new LoadContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, SchedulerParser.RULE_load);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 130;
			this.match(SchedulerParser.LOADTOKEN);
			this.state = 131;
			this.file_path();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dump(): DumpContext {
		let _localctx: DumpContext = new DumpContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, SchedulerParser.RULE_dump);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 133;
			this.match(SchedulerParser.DUMPTOKEN);
			this.state = 134;
			this.file_path();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public file_path(): File_pathContext {
		let _localctx: File_pathContext = new File_pathContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, SchedulerParser.RULE_file_path);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 136;
			this.expr(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public add(): AddContext {
		let _localctx: AddContext = new AddContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, SchedulerParser.RULE_add);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 138;
			this.match(SchedulerParser.ADD_CANVA);
			this.state = 152;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 11, this._ctx) ) {
			case 1:
				{
				this.state = 139;
				this.structure();
				this.state = 150;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
				case 1:
					{
					this.state = 140;
					this.expr(0);
					this.state = 148;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 9, this._ctx) ) {
					case 1:
						{
						this.state = 141;
						this.match(SchedulerParser.ON);
						this.state = 146;
						this._errHandler.sync(this);
						switch ( this.interpreter.adaptivePredict(this._input, 8, this._ctx) ) {
						case 1:
							{
							this.state = 142;
							_la = this._input.LA(1);
							if (!(_la === SchedulerParser.TYPENAME || _la === SchedulerParser.DATESTOKEN)) {
							this._errHandler.recoverInline(this);
							} else {
								if (this._input.LA(1) === Token.EOF) {
									this.matchedEOF = true;
								}

								this._errHandler.reportMatch(this);
								this.consume();
							}
							this.state = 144;
							this._errHandler.sync(this);
							switch ( this.interpreter.adaptivePredict(this._input, 7, this._ctx) ) {
							case 1:
								{
								this.state = 143;
								this.expr(0);
								}
								break;
							}
							}
							break;
						}
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public update(): UpdateContext {
		let _localctx: UpdateContext = new UpdateContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, SchedulerParser.RULE_update);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 154;
			this.match(SchedulerParser.UPDATE_CANVA);
			this.state = 163;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 14, this._ctx) ) {
			case 1:
				{
				this.state = 155;
				this.match(SchedulerParser.DATE);
				this.state = 157;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 12, this._ctx) ) {
				case 1:
					{
					this.state = 156;
					this.expr(0);
					}
					break;
				}
				}
				break;

			case 2:
				{
				this.state = 159;
				this.match(SchedulerParser.DATESTOKEN);
				this.state = 161;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 13, this._ctx) ) {
				case 1:
					{
					this.state = 160;
					this.collection();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public delete(): DeleteContext {
		let _localctx: DeleteContext = new DeleteContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, SchedulerParser.RULE_delete);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 165;
			this.match(SchedulerParser.DELETE_CANVA);
			this.state = 174;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 17, this._ctx) ) {
			case 1:
				{
				this.state = 166;
				_la = this._input.LA(1);
				if (!(_la === SchedulerParser.CLASSESTOKEN || _la === SchedulerParser.DAYSTOKEN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 168;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 15, this._ctx) ) {
				case 1:
					{
					this.state = 167;
					this.match(SchedulerParser.VARNAME);
					}
					break;
				}
				this.state = 172;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 16, this._ctx) ) {
				case 1:
					{
					this.state = 170;
					this.match(SchedulerParser.SATISFYING);
					this.state = 171;
					this.condition();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public get(): GetContext {
		let _localctx: GetContext = new GetContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, SchedulerParser.RULE_get);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 176;
			this.match(SchedulerParser.GET_CANVA);
			this.state = 178;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 18, this._ctx) ) {
			case 1:
				{
				this.state = 177;
				this.match(SchedulerParser.DISTINCT);
				}
				break;
			}
			this.state = 188;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 21, this._ctx) ) {
			case 1:
				{
				this.state = 180;
				_la = this._input.LA(1);
				if (!(_la === SchedulerParser.CLASSESTOKEN || _la === SchedulerParser.DAYSTOKEN)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 182;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 19, this._ctx) ) {
				case 1:
					{
					this.state = 181;
					this.match(SchedulerParser.VARNAME);
					}
					break;
				}
				this.state = 186;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
				case 1:
					{
					this.state = 184;
					this.match(SchedulerParser.SATISFYING);
					this.state = 185;
					this.condition();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public start_date(): Start_dateContext {
		let _localctx: Start_dateContext = new Start_dateContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, SchedulerParser.RULE_start_date);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 190;
			this.match(SchedulerParser.T__1);
			this.state = 191;
			this.match(SchedulerParser.DATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public end_date(): End_dateContext {
		let _localctx: End_dateContext = new End_dateContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, SchedulerParser.RULE_end_date);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 193;
			this.match(SchedulerParser.T__2);
			this.state = 194;
			this.match(SchedulerParser.DATE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public transfer_statement(): Transfer_statementContext {
		let _localctx: Transfer_statementContext = new Transfer_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, SchedulerParser.RULE_transfer_statement);
		let _la: number;
		try {
			this.state = 201;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.RETURN:
				_localctx = new ReturnContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 196;
				this.match(SchedulerParser.RETURN);
				this.state = 198;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
					{
					this.state = 197;
					this.expr(0);
					}
				}

				}
				break;
			case SchedulerParser.BREAK:
				_localctx = new BreakContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 200;
				this.match(SchedulerParser.BREAK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public loop(): LoopContext {
		let _localctx: LoopContext = new LoopContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, SchedulerParser.RULE_loop);
		try {
			this.state = 205;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.FOR:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 203;
				this.for_loop();
				}
				break;
			case SchedulerParser.WHILE:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 204;
				this.while_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public for_loop(): For_loopContext {
		let _localctx: For_loopContext = new For_loopContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, SchedulerParser.RULE_for_loop);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 207;
			this.match(SchedulerParser.FOR);
			this.state = 208;
			this.type();
			this.state = 209;
			this.match(SchedulerParser.VARNAME);
			this.state = 210;
			this.match(SchedulerParser.IN);
			this.state = 211;
			this.expr(0);
			this.state = 212;
			this.block();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public while_loop(): While_loopContext {
		let _localctx: While_loopContext = new While_loopContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, SchedulerParser.RULE_while_loop);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 214;
			this.match(SchedulerParser.WHILE);
			this.state = 215;
			this.condition();
			this.state = 216;
			this.block();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public if_statement(): If_statementContext {
		let _localctx: If_statementContext = new If_statementContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, SchedulerParser.RULE_if_statement);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 218;
			this.match(SchedulerParser.IF);
			this.state = 219;
			this.condition();
			this.state = 220;
			this.block();
			this.state = 227;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === SchedulerParser.ELIF) {
				{
				{
				this.state = 221;
				this.match(SchedulerParser.ELIF);
				this.state = 222;
				this.condition();
				this.state = 223;
				this.block();
				}
				}
				this.state = 229;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 232;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === SchedulerParser.ELSE) {
				{
				this.state = 230;
				this.match(SchedulerParser.ELSE);
				this.state = 231;
				this.block();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public condition(): ConditionContext {
		let _localctx: ConditionContext = new ConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, SchedulerParser.RULE_condition);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 234;
			this.expr(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public function(): FunctionContext {
		let _localctx: FunctionContext = new FunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, SchedulerParser.RULE_function);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 236;
			this.type();
			this.state = 237;
			this.match(SchedulerParser.VARNAME);
			this.state = 238;
			this.match(SchedulerParser.OPEN_PAREN);
			this.state = 240;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 27, this._ctx) ) {
			case 1:
				{
				this.state = 239;
				this.args();
				}
				break;
			}
			this.state = 246;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === SchedulerParser.CLOSE_PAREN || _la === SchedulerParser.OPEN_CURLY) {
				{
				this.state = 243;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === SchedulerParser.CLOSE_PAREN) {
					{
					this.state = 242;
					this.match(SchedulerParser.CLOSE_PAREN);
					}
				}

				this.state = 245;
				this.block();
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public args(): ArgsContext {
		let _localctx: ArgsContext = new ArgsContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, SchedulerParser.RULE_args);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 248;
			this.arg();
			this.state = 253;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === SchedulerParser.COMMA) {
				{
				{
				this.state = 249;
				this.match(SchedulerParser.COMMA);
				this.state = 250;
				this.arg();
				}
				}
				this.state = 255;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public arg(): ArgContext {
		let _localctx: ArgContext = new ArgContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, SchedulerParser.RULE_arg);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 256;
			this.type();
			this.state = 257;
			this.match(SchedulerParser.VARNAME);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public func_call(): Func_callContext {
		let _localctx: Func_callContext = new Func_callContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, SchedulerParser.RULE_func_call);
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 259;
			this.match(SchedulerParser.VARNAME);
			this.state = 260;
			this.match(SchedulerParser.OPEN_PAREN);
			this.state = 262;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 31, this._ctx) ) {
			case 1:
				{
				this.state = 261;
				this.expr(0);
				}
				break;
			}
			this.state = 268;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 32, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 264;
					this.match(SchedulerParser.COMMA);
					this.state = 265;
					this.expr(0);
					}
					}
				}
				this.state = 270;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 32, this._ctx);
			}
			this.state = 272;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 33, this._ctx) ) {
			case 1:
				{
				this.state = 271;
				this.match(SchedulerParser.CLOSE_PAREN);
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public def(): DefContext {
		let _localctx: DefContext = new DefContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, SchedulerParser.RULE_def);
		let _la: number;
		try {
			this.state = 297;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.TYPENAME:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 274;
				this.match(SchedulerParser.TYPENAME);
				this.state = 275;
				this.match(SchedulerParser.VARNAME);
				this.state = 280;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === SchedulerParser.SINGLEEQUAL) {
					{
					this.state = 276;
					this.match(SchedulerParser.SINGLEEQUAL);
					this.state = 278;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
						{
						this.state = 277;
						this.expr(0);
						}
					}

					}
				}

				}
				break;
			case SchedulerParser.COLLECTION_OF:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 282;
				this.match(SchedulerParser.COLLECTION_OF);
				this.state = 293;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (((((_la - 5)) & ~0x1F) === 0 && ((1 << (_la - 5)) & ((1 << (SchedulerParser.TYPENAME - 5)) | (1 << (SchedulerParser.CLASSNAME - 5)) | (1 << (SchedulerParser.DAYNAME - 5)) | (1 << (SchedulerParser.COLLECTION_OF - 5)))) !== 0)) {
					{
					this.state = 283;
					this.type();
					this.state = 291;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === SchedulerParser.VARNAME) {
						{
						this.state = 284;
						this.match(SchedulerParser.VARNAME);
						this.state = 289;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if (_la === SchedulerParser.SINGLEEQUAL) {
							{
							this.state = 285;
							this.match(SchedulerParser.SINGLEEQUAL);
							this.state = 287;
							this._errHandler.sync(this);
							_la = this._input.LA(1);
							if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
								{
								this.state = 286;
								this.expr(0);
								}
							}

							}
						}

						}
					}

					}
				}

				}
				break;
			case SchedulerParser.DAYNAME:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 295;
				this.dayDef();
				}
				break;
			case SchedulerParser.CLASSNAME:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 296;
				this.classDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public classDef(): ClassDefContext {
		let _localctx: ClassDefContext = new ClassDefContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, SchedulerParser.RULE_classDef);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 299;
			this.match(SchedulerParser.CLASSNAME);
			this.state = 308;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === SchedulerParser.VARNAME) {
				{
				this.state = 300;
				this.match(SchedulerParser.VARNAME);
				this.state = 305;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === SchedulerParser.CLASS_ATTRIBUTE) {
					{
					{
					this.state = 301;
					this.match(SchedulerParser.CLASS_ATTRIBUTE);
					this.state = 302;
					this.expr(0);
					}
					}
					this.state = 307;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public dayDef(): DayDefContext {
		let _localctx: DayDefContext = new DayDefContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, SchedulerParser.RULE_dayDef);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 310;
			this.match(SchedulerParser.DAYNAME);
			this.state = 317;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if (_la === SchedulerParser.VARNAME) {
				{
				this.state = 311;
				this.match(SchedulerParser.VARNAME);
				this.state = 315;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === SchedulerParser.CLASSESTOKEN) {
					{
					this.state = 312;
					this.day_attribute();
					this.state = 313;
					this.expr(0);
					}
				}

				}
			}

			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assign(): AssignContext {
		let _localctx: AssignContext = new AssignContext(this._ctx, this.state);
		this.enterRule(_localctx, 58, SchedulerParser.RULE_assign);
		let _la: number;
		try {
			this.state = 335;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 49, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 319;
				this.match(SchedulerParser.VARNAME);
				this.state = 320;
				this.match(SchedulerParser.SINGLEEQUAL);
				this.state = 322;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
					{
					this.state = 321;
					this.expr(0);
					}
				}

				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 324;
				this.match(SchedulerParser.VARNAME);
				this.state = 325;
				this.match(SchedulerParser.DOT);
				this.state = 333;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				if (_la === SchedulerParser.CLASS_ATTRIBUTE || _la === SchedulerParser.CLASSESTOKEN) {
					{
					this.state = 326;
					this.attribute();
					this.state = 331;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
					if (_la === SchedulerParser.SINGLEEQUAL) {
						{
						this.state = 327;
						this.match(SchedulerParser.SINGLEEQUAL);
						this.state = 329;
						this._errHandler.sync(this);
						_la = this._input.LA(1);
						if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
							{
							this.state = 328;
							this.expr(0);
							}
						}

						}
					}

					}
				}

				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public attribute(): AttributeContext {
		let _localctx: AttributeContext = new AttributeContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, SchedulerParser.RULE_attribute);
		try {
			this.state = 339;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case SchedulerParser.CLASS_ATTRIBUTE:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 337;
				this.match(SchedulerParser.CLASS_ATTRIBUTE);
				}
				break;
			case SchedulerParser.CLASSESTOKEN:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 338;
				this.day_attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public attribute_call(): Attribute_callContext {
		let _localctx: Attribute_callContext = new Attribute_callContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, SchedulerParser.RULE_attribute_call);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 341;
			this.match(SchedulerParser.VARNAME);
			this.state = 342;
			this.match(SchedulerParser.DOT);
			this.state = 344;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 51, this._ctx) ) {
			case 1:
				{
				this.state = 343;
				this.attribute();
				}
				break;
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public day_attribute(): Day_attributeContext {
		let _localctx: Day_attributeContext = new Day_attributeContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, SchedulerParser.RULE_day_attribute);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 346;
			this.match(SchedulerParser.CLASSESTOKEN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public collection(): CollectionContext {
		let _localctx: CollectionContext = new CollectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, SchedulerParser.RULE_collection);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 348;
			this.match(SchedulerParser.OPEN_BRACKET);
			this.state = 350;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.T__1) | (1 << SchedulerParser.T__2) | (1 << SchedulerParser.NOT) | (1 << SchedulerParser.OPEN_PAREN) | (1 << SchedulerParser.OPEN_BRACKET))) !== 0) || ((((_la - 34)) & ~0x1F) === 0 && ((1 << (_la - 34)) & ((1 << (SchedulerParser.ADD_CANVA - 34)) | (1 << (SchedulerParser.UPDATE_CANVA - 34)) | (1 << (SchedulerParser.DELETE_CANVA - 34)) | (1 << (SchedulerParser.GET_CANVA - 34)) | (1 << (SchedulerParser.LOADTOKEN - 34)) | (1 << (SchedulerParser.DUMPTOKEN - 34)) | (1 << (SchedulerParser.INT - 34)) | (1 << (SchedulerParser.BOOL - 34)) | (1 << (SchedulerParser.STRING - 34)) | (1 << (SchedulerParser.DATE - 34)) | (1 << (SchedulerParser.TIME - 34)) | (1 << (SchedulerParser.VARNAME - 34)))) !== 0)) {
				{
				this.state = 349;
				this.collection_elements();
				}
			}

			this.state = 352;
			this.match(SchedulerParser.CLOSE_BRACKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public collection_elements(): Collection_elementsContext {
		let _localctx: Collection_elementsContext = new Collection_elementsContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, SchedulerParser.RULE_collection_elements);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 354;
			this.collection_element();
			this.state = 359;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === SchedulerParser.COMMA) {
				{
				{
				this.state = 355;
				this.match(SchedulerParser.COMMA);
				this.state = 356;
				this.collection_element();
				}
				}
				this.state = 361;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public collection_element(): Collection_elementContext {
		let _localctx: Collection_elementContext = new Collection_elementContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, SchedulerParser.RULE_collection_element);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 362;
			this.expr(0);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public collection_subscription(): Collection_subscriptionContext {
		let _localctx: Collection_subscriptionContext = new Collection_subscriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, SchedulerParser.RULE_collection_subscription);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 364;
			this.match(SchedulerParser.VARNAME);
			this.state = 365;
			this.match(SchedulerParser.OPEN_BRACKET);
			this.state = 366;
			this.expr(0);
			this.state = 367;
			this.match(SchedulerParser.CLOSE_BRACKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public expr(): ExprContext;
	public expr(_p: number): ExprContext;
	// @RuleVersion(0)
	public expr(_p?: number): ExprContext {
		if (_p === undefined) {
			_p = 0;
		}

		let _parentctx: ParserRuleContext = this._ctx;
		let _parentState: number = this.state;
		let _localctx: ExprContext = new ExprContext(this._ctx, _parentState);
		let _prevctx: ExprContext = _localctx;
		let _startState: number = 74;
		this.enterRecursionRule(_localctx, 74, SchedulerParser.RULE_expr, _p);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 387;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 56, this._ctx) ) {
			case 1:
				{
				_localctx = new CallsContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;

				this.state = 374;
				this._errHandler.sync(this);
				switch ( this.interpreter.adaptivePredict(this._input, 54, this._ctx) ) {
				case 1:
					{
					this.state = 370;
					this.func_call();
					}
					break;

				case 2:
					{
					this.state = 371;
					this.attribute_call();
					}
					break;

				case 3:
					{
					this.state = 372;
					this.canvas_instruction();
					}
					break;

				case 4:
					{
					this.state = 373;
					this.collection_subscription();
					}
					break;
				}
				}
				break;

			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 376;
				this.match(SchedulerParser.NOT);
				this.state = 377;
				this.expr(11);
				}
				break;

			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 378;
				this.match(SchedulerParser.OPEN_PAREN);
				this.state = 379;
				this.expr(0);
				this.state = 380;
				this.match(SchedulerParser.CLOSE_PAREN);
				}
				break;

			case 4:
				{
				_localctx = new ValueExprContext(_localctx);
				this._ctx = _localctx;
				_prevctx = _localctx;
				this.state = 385;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case SchedulerParser.OPEN_BRACKET:
					{
					this.state = 382;
					this.collection();
					}
					break;
				case SchedulerParser.INT:
				case SchedulerParser.BOOL:
				case SchedulerParser.STRING:
				case SchedulerParser.DATE:
				case SchedulerParser.TIME:
					{
					this.state = 383;
					this.value();
					}
					break;
				case SchedulerParser.VARNAME:
					{
					this.state = 384;
					this.match(SchedulerParser.VARNAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			this._ctx._stop = this._input.tryLT(-1);
			this.state = 415;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 58, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					if (this._parseListeners != null) {
						this.triggerExitRuleEvent();
					}
					_prevctx = _localctx;
					{
					this.state = 413;
					this._errHandler.sync(this);
					switch ( this.interpreter.adaptivePredict(this._input, 57, this._ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 389;
						if (!(this.precpred(this._ctx, 10))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 10)");
						}
						this.state = 390;
						(_localctx as MultDivContext)._op = this._input.LT(1);
						_la = this._input.LA(1);
						if (!(_la === SchedulerParser.MULTIPLY || _la === SchedulerParser.DIVIDE)) {
							(_localctx as MultDivContext)._op = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 391;
						this.expr(11);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 392;
						if (!(this.precpred(this._ctx, 9))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 9)");
						}
						this.state = 393;
						(_localctx as AddSubContext)._op = this._input.LT(1);
						_la = this._input.LA(1);
						if (!(_la === SchedulerParser.ADD || _la === SchedulerParser.SUBTRACT)) {
							(_localctx as AddSubContext)._op = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 394;
						this.expr(10);
						}
						break;

					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 395;
						if (!(this.precpred(this._ctx, 8))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 8)");
						}
						this.state = 396;
						(_localctx as CompareContext)._op = this._input.LT(1);
						_la = this._input.LA(1);
						if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << SchedulerParser.LESS_THAN) | (1 << SchedulerParser.GREATER_THAN) | (1 << SchedulerParser.LESS_THAN_OR_EQUAL) | (1 << SchedulerParser.GREATER_THAN_OR_EQUAL))) !== 0))) {
							(_localctx as CompareContext)._op = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 397;
						this.expr(9);
						}
						break;

					case 4:
						{
						_localctx = new EqualExprContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 398;
						if (!(this.precpred(this._ctx, 7))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 7)");
						}
						this.state = 399;
						(_localctx as EqualExprContext)._op = this._input.LT(1);
						_la = this._input.LA(1);
						if (!(_la === SchedulerParser.EQUAL || _la === SchedulerParser.NOT_EQUAL)) {
							(_localctx as EqualExprContext)._op = this._errHandler.recoverInline(this);
						} else {
							if (this._input.LA(1) === Token.EOF) {
								this.matchedEOF = true;
							}

							this._errHandler.reportMatch(this);
							this.consume();
						}
						this.state = 400;
						this.expr(8);
						}
						break;

					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 401;
						if (!(this.precpred(this._ctx, 6))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 6)");
						}
						this.state = 402;
						this.match(SchedulerParser.AND);
						this.state = 403;
						this.expr(7);
						}
						break;

					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 404;
						if (!(this.precpred(this._ctx, 5))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 5)");
						}
						this.state = 405;
						this.match(SchedulerParser.OR);
						this.state = 406;
						this.expr(6);
						}
						break;

					case 7:
						{
						_localctx = new OverlapExprContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 407;
						if (!(this.precpred(this._ctx, 4))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 4)");
						}
						this.state = 408;
						this.match(SchedulerParser.OVERLAP);
						this.state = 409;
						this.expr(5);
						}
						break;

					case 8:
						{
						_localctx = new InExprContext(new ExprContext(_parentctx, _parentState));
						this.pushNewRecursionContext(_localctx, _startState, SchedulerParser.RULE_expr);
						this.state = 410;
						if (!(this.precpred(this._ctx, 3))) {
							throw this.createFailedPredicateException("this.precpred(this._ctx, 3)");
						}
						this.state = 411;
						this.match(SchedulerParser.IN);
						this.state = 412;
						this.expr(4);
						}
						break;
					}
					}
				}
				this.state = 417;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 58, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public type(): TypeContext {
		let _localctx: TypeContext = new TypeContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, SchedulerParser.RULE_type);
		try {
			this.state = 424;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 59, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 418;
				this.match(SchedulerParser.TYPENAME);
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 419;
				this.structure();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 420;
				this.match(SchedulerParser.COLLECTION_OF);
				this.state = 421;
				this.match(SchedulerParser.TYPENAME);
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 422;
				this.match(SchedulerParser.COLLECTION_OF);
				this.state = 423;
				this.structure();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public structure(): StructureContext {
		let _localctx: StructureContext = new StructureContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, SchedulerParser.RULE_structure);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 426;
			_la = this._input.LA(1);
			if (!(_la === SchedulerParser.CLASSNAME || _la === SchedulerParser.DAYNAME)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public value(): ValueContext {
		let _localctx: ValueContext = new ValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 80, SchedulerParser.RULE_value);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 428;
			_la = this._input.LA(1);
			if (!(((((_la - 57)) & ~0x1F) === 0 && ((1 << (_la - 57)) & ((1 << (SchedulerParser.INT - 57)) | (1 << (SchedulerParser.BOOL - 57)) | (1 << (SchedulerParser.STRING - 57)) | (1 << (SchedulerParser.DATE - 57)) | (1 << (SchedulerParser.TIME - 57)))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public comments(): CommentsContext {
		let _localctx: CommentsContext = new CommentsContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, SchedulerParser.RULE_comments);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 430;
			_la = this._input.LA(1);
			if (!(_la === SchedulerParser.COMMENT_LINE || _la === SchedulerParser.COMMENT)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public sempred(_localctx: RuleContext, ruleIndex: number, predIndex: number): boolean {
		switch (ruleIndex) {
		case 37:
			return this.expr_sempred(_localctx as ExprContext, predIndex);
		}
		return true;
	}
	private expr_sempred(_localctx: ExprContext, predIndex: number): boolean {
		switch (predIndex) {
		case 0:
			return this.precpred(this._ctx, 10);

		case 1:
			return this.precpred(this._ctx, 9);

		case 2:
			return this.precpred(this._ctx, 8);

		case 3:
			return this.precpred(this._ctx, 7);

		case 4:
			return this.precpred(this._ctx, 6);

		case 5:
			return this.precpred(this._ctx, 5);

		case 6:
			return this.precpred(this._ctx, 4);

		case 7:
			return this.precpred(this._ctx, 3);
		}
		return true;
	}

	public static readonly _serializedATN: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03C\u01B3\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x03\x02\x05\x02X\n\x02\x03\x02\x03\x02\x03\x03\x03\x03\x05\x03^\n\x03" +
		"\x03\x03\x03\x03\x03\x03\x03\x03\x06\x03d\n\x03\r\x03\x0E\x03e\x03\x04" +
		"\x03\x04\x03\x04\x03\x04\x03\x04\x05\x04m\n\x04\x03\x05\x03\x05\x03\x05" +
		"\x05\x05r\n\x05\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x05\x06|\n\x06\x03\x07\x03\x07\x03\x07\x03\x07\x03\b\x03\b\x03" +
		"\b\x03\t\x03\t\x03\t\x03\n\x03\n\x03\n\x03\v\x03\v\x03\f\x03\f\x03\f\x03" +
		"\f\x03\f\x03\f\x05\f\x93\n\f\x05\f\x95\n\f\x05\f\x97\n\f\x05\f\x99\n\f" +
		"\x05\f\x9B\n\f\x03\r\x03\r\x03\r\x05\r\xA0\n\r\x03\r\x03\r\x05\r\xA4\n" +
		"\r\x05\r\xA6\n\r\x03\x0E\x03\x0E\x03\x0E\x05\x0E\xAB\n\x0E\x03\x0E\x03" +
		"\x0E\x05\x0E\xAF\n\x0E\x05\x0E\xB1\n\x0E\x03\x0F\x03\x0F\x05\x0F\xB5\n" +
		"\x0F\x03\x0F\x03\x0F\x05\x0F\xB9\n\x0F\x03\x0F\x03\x0F\x05\x0F\xBD\n\x0F" +
		"\x05\x0F\xBF\n\x0F\x03\x10\x03\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03" +
		"\x12\x03\x12\x05\x12\xC9\n\x12\x03\x12\x05\x12\xCC\n\x12\x03\x13\x03\x13" +
		"\x05\x13\xD0\n\x13\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03\x14\x03" +
		"\x14\x03\x15\x03\x15\x03\x15\x03\x15\x03\x16\x03\x16\x03\x16\x03\x16\x03" +
		"\x16\x03\x16\x03\x16\x07\x16\xE4\n\x16\f\x16\x0E\x16\xE7\v\x16\x03\x16" +
		"\x03\x16\x05\x16\xEB\n\x16\x03\x17\x03\x17\x03\x18\x03\x18\x03\x18\x03" +
		"\x18\x05\x18\xF3\n\x18\x03\x18\x05\x18\xF6\n\x18\x03\x18\x05\x18\xF9\n" +
		"\x18\x03\x19\x03\x19\x03\x19\x07\x19\xFE\n\x19\f\x19\x0E\x19\u0101\v\x19" +
		"\x03\x1A\x03\x1A\x03\x1A\x03\x1B\x03\x1B\x03\x1B\x05\x1B\u0109\n\x1B\x03" +
		"\x1B\x03\x1B\x07\x1B\u010D\n\x1B\f\x1B\x0E\x1B\u0110\v\x1B\x03\x1B\x05" +
		"\x1B\u0113\n\x1B\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u0119\n\x1C\x05" +
		"\x1C\u011B\n\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x03\x1C\x05\x1C\u0122" +
		"\n\x1C\x05\x1C\u0124\n\x1C\x05\x1C\u0126\n\x1C\x05\x1C\u0128\n\x1C\x03" +
		"\x1C\x03\x1C\x05\x1C\u012C\n\x1C\x03\x1D\x03\x1D\x03\x1D\x03\x1D\x07\x1D" +
		"\u0132\n\x1D\f\x1D\x0E\x1D\u0135\v\x1D\x05\x1D\u0137\n\x1D\x03\x1E\x03" +
		"\x1E\x03\x1E\x03\x1E\x03\x1E\x05\x1E\u013E\n\x1E\x05\x1E\u0140\n\x1E\x03" +
		"\x1F\x03\x1F\x03\x1F\x05\x1F\u0145\n\x1F\x03\x1F\x03\x1F\x03\x1F\x03\x1F" +
		"\x03\x1F\x05\x1F\u014C\n\x1F\x05\x1F\u014E\n\x1F\x05\x1F\u0150\n\x1F\x05" +
		"\x1F\u0152\n\x1F\x03 \x03 \x05 \u0156\n \x03!\x03!\x03!\x05!\u015B\n!" +
		"\x03\"\x03\"\x03#\x03#\x05#\u0161\n#\x03#\x03#\x03$\x03$\x03$\x07$\u0168" +
		"\n$\f$\x0E$\u016B\v$\x03%\x03%\x03&\x03&\x03&\x03&\x03&\x03\'\x03\'\x03" +
		"\'\x03\'\x03\'\x05\'\u0179\n\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03" +
		"\'\x03\'\x03\'\x05\'\u0184\n\'\x05\'\u0186\n\'\x03\'\x03\'\x03\'\x03\'" +
		"\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03" +
		"\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x03\'\x07\'\u01A0\n\'\f\'" +
		"\x0E\'\u01A3\v\'\x03(\x03(\x03(\x03(\x03(\x03(\x05(\u01AB\n(\x03)\x03" +
		")\x03*\x03*\x03+\x03+\x03+\x02\x02\x03L,\x02\x02\x04\x02\x06\x02\b\x02" +
		"\n\x02\f\x02\x0E\x02\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C" +
		"\x02\x1E\x02 \x02\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026" +
		"\x028\x02:\x02<\x02>\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02" +
		"R\x02T\x02\x02\v\x04\x02\x07\x0788\x03\x02\n\v\x03\x02\f\r\x03\x02\x0E" +
		"\x0F\x03\x02\x12\x15\x03\x02\x10\x11\x03\x02\b\t\x03\x02;?\x03\x02BC\x02" +
		"\u01DF\x02W\x03\x02\x02\x02\x04c\x03\x02\x02\x02\x06l\x03\x02\x02\x02" +
		"\bq\x03\x02\x02\x02\n{\x03\x02\x02\x02\f}\x03\x02\x02\x02\x0E\x81\x03" +
		"\x02\x02\x02\x10\x84\x03\x02\x02\x02\x12\x87\x03\x02\x02\x02\x14\x8A\x03" +
		"\x02\x02\x02\x16\x8C\x03\x02\x02\x02\x18\x9C\x03\x02\x02\x02\x1A\xA7\x03" +
		"\x02\x02\x02\x1C\xB2\x03\x02\x02\x02\x1E\xC0\x03\x02\x02\x02 \xC3\x03" +
		"\x02\x02\x02\"\xCB\x03\x02\x02\x02$\xCF\x03\x02\x02\x02&\xD1\x03\x02\x02" +
		"\x02(\xD8\x03\x02\x02\x02*\xDC\x03\x02\x02\x02,\xEC\x03\x02\x02\x02.\xEE" +
		"\x03\x02\x02\x020\xFA\x03\x02\x02\x022\u0102\x03\x02\x02\x024\u0105\x03" +
		"\x02\x02\x026\u012B\x03\x02\x02\x028\u012D\x03\x02\x02\x02:\u0138\x03" +
		"\x02\x02\x02<\u0151\x03\x02\x02\x02>\u0155\x03\x02\x02\x02@\u0157\x03" +
		"\x02\x02\x02B\u015C\x03\x02\x02\x02D\u015E\x03\x02\x02\x02F\u0164\x03" +
		"\x02\x02\x02H\u016C\x03\x02\x02\x02J\u016E\x03\x02\x02\x02L\u0185\x03" +
		"\x02\x02\x02N\u01AA\x03\x02\x02\x02P\u01AC\x03\x02\x02\x02R\u01AE\x03" +
		"\x02\x02\x02T\u01B0\x03\x02\x02\x02VX\x05\x04\x03\x02WV\x03\x02\x02\x02" +
		"WX\x03\x02\x02\x02XY\x03\x02\x02\x02YZ\x07\x02\x02\x03Z\x03\x03\x02\x02" +
		"\x02[^\x05\x06\x04\x02\\^\x05\n\x06\x02][\x03\x02\x02\x02]\\\x03\x02\x02" +
		"\x02^_\x03\x02\x02\x02_`\x07\x03\x02\x02`d\x03\x02\x02\x02ad\x05\b\x05" +
		"\x02bd\x05T+\x02c]\x03\x02\x02\x02ca\x03\x02\x02\x02cb\x03\x02\x02\x02" +
		"de\x03\x02\x02\x02ec\x03\x02\x02\x02ef\x03\x02\x02\x02f\x05\x03\x02\x02" +
		"\x02gm\x056\x1C\x02hm\x05<\x1F\x02im\x05L\'\x02jm\x05\"\x12\x02km\x05" +
		"\x0E\b\x02lg\x03\x02\x02\x02lh\x03\x02\x02\x02li\x03\x02\x02\x02lj\x03" +
		"\x02\x02\x02lk\x03\x02\x02\x02m\x07\x03\x02\x02\x02nr\x05*\x16\x02or\x05" +
		".\x18\x02pr\x05$\x13\x02qn\x03\x02\x02\x02qo\x03\x02\x02\x02qp\x03\x02" +
		"\x02\x02r\t\x03\x02\x02\x02s|\x05\x16\f\x02t|\x05\x18\r\x02u|\x05\x1A" +
		"\x0E\x02v|\x05\x1C\x0F\x02w|\x05\x1E\x10\x02x|\x05 \x11\x02y|\x05\x10" +
		"\t\x02z|\x05\x12\n\x02{s\x03\x02\x02\x02{t\x03\x02\x02\x02{u\x03\x02\x02" +
		"\x02{v\x03\x02\x02\x02{w\x03\x02\x02\x02{x\x03\x02\x02\x02{y\x03\x02\x02" +
		"\x02{z\x03\x02\x02\x02|\v\x03\x02\x02\x02}~\x074\x02\x02~\x7F\x05\x04" +
		"\x03\x02\x7F\x80\x075\x02\x02\x80\r\x03\x02\x02\x02\x81\x82\x077\x02\x02" +
		"\x82\x83\x05L\'\x02\x83\x0F\x03\x02\x02\x02\x84\x85\x079\x02\x02\x85\x86" +
		"\x05\x14\v\x02\x86\x11\x03\x02\x02\x02\x87\x88\x07:\x02\x02\x88\x89\x05" +
		"\x14\v\x02\x89\x13\x03\x02\x02\x02\x8A\x8B\x05L\'\x02\x8B\x15\x03\x02" +
		"\x02\x02\x8C\x9A\x07$\x02\x02\x8D\x98\x05P)\x02\x8E\x96\x05L\'\x02\x8F" +
		"\x94\x07+\x02\x02\x90\x92\t\x02\x02\x02\x91\x93\x05L\'\x02\x92\x91\x03" +
		"\x02\x02\x02\x92\x93\x03\x02\x02\x02\x93\x95\x03\x02\x02\x02\x94\x90\x03" +
		"\x02\x02\x02\x94\x95\x03\x02\x02\x02\x95\x97\x03\x02\x02\x02\x96\x8F\x03" +
		"\x02\x02\x02\x96\x97\x03\x02\x02\x02\x97\x99\x03\x02\x02\x02\x98\x8E\x03" +
		"\x02\x02\x02\x98\x99\x03\x02\x02\x02\x99\x9B\x03\x02\x02\x02\x9A\x8D\x03" +
		"\x02\x02\x02\x9A\x9B\x03\x02\x02\x02\x9B\x17\x03\x02\x02\x02\x9C\xA5\x07" +
		"%\x02\x02\x9D\x9F\x07>\x02\x02\x9E\xA0\x05L\'\x02\x9F\x9E\x03\x02\x02" +
		"\x02\x9F\xA0\x03\x02\x02\x02\xA0\xA6\x03\x02\x02\x02\xA1\xA3\x078\x02" +
		"\x02\xA2\xA4\x05D#\x02\xA3\xA2\x03\x02\x02\x02\xA3\xA4\x03\x02\x02\x02" +
		"\xA4\xA6\x03\x02\x02\x02\xA5\x9D\x03\x02\x02\x02\xA5\xA1\x03\x02\x02\x02" +
		"\xA5\xA6\x03\x02\x02\x02\xA6\x19\x03\x02\x02\x02\xA7\xB0\x07&\x02\x02" +
		"\xA8\xAA\t\x03\x02\x02\xA9\xAB\x07A\x02\x02\xAA\xA9\x03\x02\x02\x02\xAA" +
		"\xAB\x03\x02\x02\x02\xAB\xAE\x03\x02\x02\x02\xAC\xAD\x07)\x02\x02\xAD" +
		"\xAF\x05,\x17\x02\xAE\xAC\x03\x02\x02\x02\xAE\xAF\x03\x02\x02\x02\xAF" +
		"\xB1\x03\x02\x02\x02\xB0\xA8\x03\x02\x02\x02\xB0\xB1\x03\x02\x02\x02\xB1" +
		"\x1B\x03\x02\x02\x02\xB2\xB4\x07\'\x02\x02\xB3\xB5\x076\x02\x02\xB4\xB3" +
		"\x03\x02\x02\x02\xB4\xB5\x03\x02\x02\x02\xB5\xBE\x03\x02\x02\x02\xB6\xB8" +
		"\t\x03\x02\x02\xB7\xB9\x07A\x02\x02\xB8\xB7\x03\x02\x02\x02\xB8\xB9\x03" +
		"\x02\x02\x02\xB9\xBC\x03\x02\x02\x02\xBA\xBB\x07)\x02\x02\xBB\xBD\x05" +
		",\x17\x02\xBC\xBA\x03\x02\x02\x02\xBC\xBD\x03\x02\x02\x02\xBD\xBF\x03" +
		"\x02\x02\x02\xBE\xB6\x03\x02\x02\x02\xBE\xBF\x03\x02\x02\x02\xBF\x1D\x03" +
		"\x02\x02\x02\xC0\xC1\x07\x04\x02\x02\xC1\xC2\x07>\x02\x02\xC2\x1F\x03" +
		"\x02\x02\x02\xC3\xC4\x07\x05\x02\x02\xC4\xC5\x07>\x02\x02\xC5!\x03\x02" +
		"\x02\x02\xC6\xC8\x072\x02\x02\xC7\xC9\x05L\'\x02\xC8\xC7\x03\x02\x02\x02" +
		"\xC8\xC9\x03\x02\x02\x02\xC9\xCC\x03\x02\x02\x02\xCA\xCC\x073\x02\x02" +
		"\xCB\xC6\x03\x02\x02\x02\xCB\xCA\x03\x02\x02\x02\xCC#\x03\x02\x02\x02" +
		"\xCD\xD0\x05&\x14\x02\xCE\xD0\x05(\x15\x02\xCF\xCD\x03\x02\x02\x02\xCF" +
		"\xCE\x03\x02\x02\x02\xD0%\x03\x02\x02\x02\xD1\xD2\x070\x02\x02\xD2\xD3" +
		"\x05N(\x02\xD3\xD4\x07A\x02\x02\xD4\xD5\x07\x19\x02\x02\xD5\xD6\x05L\'" +
		"\x02\xD6\xD7\x05\f\x07\x02\xD7\'\x03\x02\x02\x02\xD8\xD9\x071\x02\x02" +
		"\xD9\xDA\x05,\x17\x02\xDA\xDB\x05\f\x07\x02\xDB)\x03\x02\x02\x02\xDC\xDD" +
		"\x07-\x02\x02\xDD\xDE\x05,\x17\x02\xDE\xE5\x05\f\x07\x02\xDF\xE0\x07." +
		"\x02\x02\xE0\xE1\x05,\x17\x02\xE1\xE2\x05\f\x07\x02\xE2\xE4\x03\x02\x02" +
		"\x02\xE3\xDF\x03\x02\x02\x02\xE4\xE7\x03\x02\x02\x02\xE5\xE3\x03\x02\x02" +
		"\x02\xE5\xE6\x03\x02\x02\x02\xE6\xEA\x03\x02\x02\x02\xE7\xE5\x03\x02\x02" +
		"\x02\xE8\xE9\x07/\x02\x02\xE9\xEB\x05\f\x07\x02\xEA\xE8\x03\x02\x02\x02" +
		"\xEA\xEB\x03\x02\x02\x02\xEB+\x03\x02\x02\x02\xEC\xED\x05L\'\x02\xED-" +
		"\x03\x02\x02\x02\xEE\xEF\x05N(\x02\xEF\xF0\x07A\x02\x02\xF0\xF2\x07\x1B" +
		"\x02\x02\xF1\xF3\x050\x19\x02\xF2\xF1\x03\x02\x02\x02\xF2\xF3\x03\x02" +
		"\x02\x02\xF3\xF8\x03\x02\x02\x02\xF4\xF6\x07\x1C\x02\x02\xF5\xF4\x03\x02" +
		"\x02\x02\xF5\xF6\x03\x02\x02\x02\xF6\xF7\x03\x02\x02\x02\xF7\xF9\x05\f" +
		"\x07\x02\xF8\xF5\x03\x02\x02\x02\xF8\xF9\x03\x02\x02\x02\xF9/\x03\x02" +
		"\x02\x02\xFA\xFF\x052\x1A\x02\xFB\xFC\x07 \x02\x02\xFC\xFE\x052\x1A\x02" +
		"\xFD\xFB\x03\x02\x02\x02\xFE\u0101\x03\x02\x02\x02\xFF\xFD\x03\x02\x02" +
		"\x02\xFF\u0100\x03\x02\x02\x02\u01001\x03\x02\x02\x02\u0101\xFF\x03\x02" +
		"\x02\x02\u0102\u0103\x05N(\x02\u0103\u0104\x07A\x02\x02\u01043\x03\x02" +
		"\x02\x02\u0105\u0106\x07A\x02\x02\u0106\u0108\x07\x1B\x02\x02\u0107\u0109" +
		"\x05L\'\x02\u0108\u0107\x03\x02\x02\x02\u0108\u0109\x03\x02\x02\x02\u0109" +
		"\u010E\x03\x02\x02\x02\u010A\u010B\x07 \x02\x02\u010B\u010D\x05L\'\x02" +
		"\u010C\u010A\x03\x02\x02\x02\u010D\u0110\x03\x02\x02\x02\u010E\u010C\x03" +
		"\x02\x02\x02\u010E\u010F\x03\x02\x02\x02\u010F\u0112\x03\x02\x02\x02\u0110" +
		"\u010E\x03\x02\x02\x02\u0111\u0113\x07\x1C\x02\x02\u0112\u0111\x03\x02" +
		"\x02\x02\u0112\u0113\x03\x02\x02\x02\u01135\x03\x02\x02\x02\u0114\u0115" +
		"\x07\x07\x02\x02\u0115\u011A\x07A\x02\x02\u0116\u0118\x07\"\x02\x02\u0117" +
		"\u0119\x05L\'\x02\u0118\u0117\x03\x02\x02\x02\u0118\u0119\x03\x02\x02" +
		"\x02\u0119\u011B\x03\x02\x02\x02\u011A\u0116\x03\x02\x02\x02\u011A\u011B" +
		"\x03\x02\x02\x02\u011B\u012C\x03\x02\x02\x02\u011C\u0127\x07#\x02\x02" +
		"\u011D\u0125\x05N(\x02\u011E\u0123\x07A\x02\x02\u011F\u0121\x07\"\x02" +
		"\x02\u0120\u0122\x05L\'\x02\u0121\u0120\x03\x02\x02\x02\u0121\u0122\x03" +
		"\x02\x02\x02\u0122\u0124\x03\x02\x02\x02\u0123\u011F\x03\x02\x02\x02\u0123" +
		"\u0124\x03\x02\x02\x02\u0124\u0126\x03\x02\x02\x02\u0125\u011E\x03\x02" +
		"\x02\x02\u0125\u0126\x03\x02\x02\x02\u0126\u0128\x03\x02\x02\x02\u0127" +
		"\u011D\x03\x02\x02\x02\u0127\u0128\x03\x02\x02\x02\u0128\u012C\x03\x02" +
		"\x02\x02\u0129\u012C\x05:\x1E\x02\u012A\u012C\x058\x1D\x02\u012B\u0114" +
		"\x03\x02\x02\x02\u012B\u011C\x03\x02\x02\x02\u012B\u0129\x03\x02\x02\x02" +
		"\u012B\u012A\x03\x02\x02\x02\u012C7\x03\x02\x02\x02\u012D\u0136\x07\b" +
		"\x02\x02\u012E\u0133\x07A\x02\x02\u012F\u0130\x07\x06\x02\x02\u0130\u0132" +
		"\x05L\'\x02\u0131\u012F\x03\x02\x02\x02\u0132\u0135\x03\x02\x02\x02\u0133" +
		"\u0131\x03\x02\x02\x02\u0133\u0134\x03\x02\x02\x02\u0134\u0137\x03\x02" +
		"\x02\x02\u0135\u0133\x03\x02\x02\x02\u0136\u012E\x03\x02\x02\x02\u0136" +
		"\u0137\x03\x02\x02\x02\u01379\x03\x02\x02\x02\u0138\u013F\x07\t\x02\x02" +
		"\u0139\u013D\x07A\x02\x02\u013A\u013B\x05B\"\x02\u013B\u013C\x05L\'\x02" +
		"\u013C\u013E\x03\x02\x02\x02\u013D\u013A\x03\x02\x02\x02\u013D\u013E\x03" +
		"\x02\x02\x02\u013E\u0140\x03\x02\x02\x02\u013F\u0139\x03\x02\x02\x02\u013F" +
		"\u0140\x03\x02\x02\x02\u0140;\x03\x02\x02\x02\u0141\u0142\x07A\x02\x02" +
		"\u0142\u0144\x07\"\x02\x02\u0143\u0145\x05L\'\x02\u0144\u0143\x03\x02" +
		"\x02\x02\u0144\u0145\x03\x02\x02\x02\u0145\u0152\x03\x02\x02\x02\u0146" +
		"\u0147\x07A\x02\x02\u0147\u014F\x07\x1F\x02\x02\u0148\u014D\x05> \x02" +
		"\u0149\u014B\x07\"\x02\x02\u014A\u014C\x05L\'\x02\u014B\u014A\x03\x02" +
		"\x02\x02\u014B\u014C\x03\x02\x02\x02\u014C\u014E\x03\x02\x02\x02\u014D" +
		"\u0149\x03\x02\x02\x02\u014D\u014E\x03\x02\x02\x02\u014E\u0150\x03\x02" +
		"\x02\x02\u014F\u0148\x03\x02\x02\x02\u014F\u0150\x03\x02\x02\x02\u0150" +
		"\u0152\x03\x02\x02\x02\u0151\u0141\x03\x02\x02\x02\u0151\u0146\x03\x02" +
		"\x02\x02\u0152=\x03\x02\x02\x02\u0153\u0156\x07\x06\x02\x02\u0154\u0156" +
		"\x05B\"\x02\u0155\u0153\x03\x02\x02\x02\u0155\u0154\x03\x02\x02\x02\u0156" +
		"?\x03\x02\x02\x02\u0157\u0158\x07A\x02\x02\u0158\u015A\x07\x1F\x02\x02" +
		"\u0159\u015B\x05> \x02\u015A\u0159\x03\x02\x02\x02\u015A\u015B\x03\x02" +
		"\x02\x02\u015BA\x03\x02\x02\x02\u015C\u015D\x07\n\x02\x02\u015DC\x03\x02" +
		"\x02\x02\u015E\u0160\x07\x1D\x02\x02\u015F\u0161\x05F$\x02\u0160\u015F" +
		"\x03\x02\x02\x02\u0160\u0161\x03\x02\x02\x02\u0161\u0162\x03\x02\x02\x02" +
		"\u0162\u0163\x07\x1E\x02\x02\u0163E\x03\x02\x02\x02\u0164\u0169\x05H%" +
		"\x02\u0165\u0166\x07 \x02\x02\u0166\u0168\x05H%\x02\u0167\u0165\x03\x02" +
		"\x02\x02\u0168\u016B\x03\x02\x02\x02\u0169\u0167\x03\x02\x02\x02\u0169" +
		"\u016A\x03\x02\x02\x02\u016AG\x03\x02\x02\x02\u016B\u0169\x03\x02\x02" +
		"\x02\u016C\u016D\x05L\'\x02\u016DI\x03\x02\x02\x02\u016E\u016F\x07A\x02" +
		"\x02\u016F\u0170\x07\x1D\x02\x02\u0170\u0171\x05L\'\x02\u0171\u0172\x07" +
		"\x1E\x02\x02\u0172K\x03\x02\x02\x02\u0173\u0178\b\'\x01\x02\u0174\u0179" +
		"\x054\x1B\x02\u0175\u0179\x05@!\x02\u0176\u0179\x05\n\x06\x02\u0177\u0179" +
		"\x05J&\x02\u0178\u0174\x03\x02\x02\x02\u0178\u0175\x03\x02\x02\x02\u0178" +
		"\u0176\x03\x02\x02\x02\u0178\u0177\x03\x02\x02\x02\u0179\u0186\x03\x02" +
		"\x02\x02\u017A\u017B\x07\x18\x02\x02\u017B\u0186\x05L\'\r\u017C\u017D" +
		"\x07\x1B\x02\x02\u017D\u017E\x05L\'\x02\u017E\u017F\x07\x1C\x02\x02\u017F" +
		"\u0186\x03\x02\x02\x02\u0180\u0184\x05D#\x02\u0181\u0184\x05R*\x02\u0182" +
		"\u0184\x07A\x02\x02\u0183\u0180\x03\x02\x02\x02\u0183\u0181\x03\x02\x02" +
		"\x02\u0183\u0182\x03\x02\x02\x02\u0184\u0186\x03\x02\x02\x02\u0185\u0173" +
		"\x03\x02\x02\x02\u0185\u017A\x03\x02\x02\x02\u0185\u017C\x03\x02\x02\x02" +
		"\u0185\u0183\x03\x02\x02\x02\u0186\u01A1\x03\x02\x02\x02\u0187\u0188\f" +
		"\f\x02\x02\u0188\u0189\t\x04\x02\x02\u0189\u01A0\x05L\'\r\u018A\u018B" +
		"\f\v\x02\x02\u018B\u018C\t\x05\x02\x02\u018C\u01A0\x05L\'\f\u018D\u018E" +
		"\f\n\x02\x02\u018E\u018F\t\x06\x02\x02\u018F\u01A0\x05L\'\v\u0190\u0191" +
		"\f\t\x02\x02\u0191\u0192\t\x07\x02\x02\u0192\u01A0\x05L\'\n\u0193\u0194" +
		"\f\b\x02\x02\u0194\u0195\x07\x16\x02\x02\u0195\u01A0\x05L\'\t\u0196\u0197" +
		"\f\x07\x02\x02\u0197\u0198\x07\x17\x02\x02\u0198\u01A0\x05L\'\b\u0199" +
		"\u019A\f\x06\x02\x02\u019A\u019B\x07\x1A\x02\x02\u019B\u01A0\x05L\'\x07" +
		"\u019C\u019D\f\x05\x02\x02\u019D\u019E\x07\x19\x02\x02\u019E\u01A0\x05" +
		"L\'\x06\u019F\u0187\x03\x02\x02\x02\u019F\u018A\x03\x02\x02\x02\u019F" +
		"\u018D\x03\x02\x02\x02\u019F\u0190\x03\x02\x02\x02\u019F\u0193\x03\x02" +
		"\x02\x02\u019F\u0196\x03\x02\x02\x02\u019F\u0199\x03\x02\x02\x02\u019F" +
		"\u019C\x03\x02\x02\x02\u01A0\u01A3\x03\x02\x02\x02\u01A1\u019F\x03\x02" +
		"\x02\x02\u01A1\u01A2\x03\x02\x02\x02\u01A2M\x03\x02\x02\x02\u01A3\u01A1" +
		"\x03\x02\x02\x02\u01A4\u01AB\x07\x07\x02\x02\u01A5\u01AB\x05P)\x02\u01A6" +
		"\u01A7\x07#\x02\x02\u01A7\u01AB\x07\x07\x02\x02\u01A8\u01A9\x07#\x02\x02" +
		"\u01A9\u01AB\x05P)\x02\u01AA\u01A4\x03\x02\x02\x02\u01AA\u01A5\x03\x02" +
		"\x02\x02\u01AA\u01A6\x03\x02\x02\x02\u01AA\u01A8\x03\x02\x02\x02\u01AB" +
		"O\x03\x02\x02\x02\u01AC\u01AD\t\b\x02\x02\u01ADQ\x03\x02\x02\x02\u01AE" +
		"\u01AF\t\t\x02\x02\u01AFS\x03\x02\x02\x02\u01B0\u01B1\t\n\x02\x02\u01B1" +
		"U\x03\x02\x02\x02>W]celq{\x92\x94\x96\x98\x9A\x9F\xA3\xA5\xAA\xAE\xB0" +
		"\xB4\xB8\xBC\xBE\xC8\xCB\xCF\xE5\xEA\xF2\xF5\xF8\xFF\u0108\u010E\u0112" +
		"\u0118\u011A\u0121\u0123\u0125\u0127\u012B\u0133\u0136\u013D\u013F\u0144" +
		"\u014B\u014D\u014F\u0151\u0155\u015A\u0160\u0169\u0178\u0183\u0185\u019F" +
		"\u01A1\u01AA";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!SchedulerParser.__ATN) {
			SchedulerParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(SchedulerParser._serializedATN));
		}

		return SchedulerParser.__ATN;
	}

}

export class ProgContext extends ParserRuleContext {
	public EOF(): TerminalNode { return this.getToken(SchedulerParser.EOF, 0); }
	public code(): CodeContext | undefined {
		return this.tryGetRuleContext(0, CodeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_prog; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterProg) {
			listener.enterProg(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitProg) {
			listener.exitProg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitProg) {
			return visitor.visitProg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CodeContext extends ParserRuleContext {
	public instruction_without_semicolon(): Instruction_without_semicolonContext[];
	public instruction_without_semicolon(i: number): Instruction_without_semicolonContext;
	public instruction_without_semicolon(i?: number): Instruction_without_semicolonContext | Instruction_without_semicolonContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Instruction_without_semicolonContext);
		} else {
			return this.getRuleContext(i, Instruction_without_semicolonContext);
		}
	}
	public comments(): CommentsContext[];
	public comments(i: number): CommentsContext;
	public comments(i?: number): CommentsContext | CommentsContext[] {
		if (i === undefined) {
			return this.getRuleContexts(CommentsContext);
		} else {
			return this.getRuleContext(i, CommentsContext);
		}
	}
	public instruction(): InstructionContext[];
	public instruction(i: number): InstructionContext;
	public instruction(i?: number): InstructionContext | InstructionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(InstructionContext);
		} else {
			return this.getRuleContext(i, InstructionContext);
		}
	}
	public canvas_instruction(): Canvas_instructionContext[];
	public canvas_instruction(i: number): Canvas_instructionContext;
	public canvas_instruction(i?: number): Canvas_instructionContext | Canvas_instructionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Canvas_instructionContext);
		} else {
			return this.getRuleContext(i, Canvas_instructionContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_code; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCode) {
			listener.enterCode(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCode) {
			listener.exitCode(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCode) {
			return visitor.visitCode(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class InstructionContext extends ParserRuleContext {
	public def(): DefContext | undefined {
		return this.tryGetRuleContext(0, DefContext);
	}
	public assign(): AssignContext | undefined {
		return this.tryGetRuleContext(0, AssignContext);
	}
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	public transfer_statement(): Transfer_statementContext | undefined {
		return this.tryGetRuleContext(0, Transfer_statementContext);
	}
	public print(): PrintContext | undefined {
		return this.tryGetRuleContext(0, PrintContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_instruction; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterInstruction) {
			listener.enterInstruction(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitInstruction) {
			listener.exitInstruction(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitInstruction) {
			return visitor.visitInstruction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Instruction_without_semicolonContext extends ParserRuleContext {
	public if_statement(): If_statementContext | undefined {
		return this.tryGetRuleContext(0, If_statementContext);
	}
	public function(): FunctionContext | undefined {
		return this.tryGetRuleContext(0, FunctionContext);
	}
	public loop(): LoopContext | undefined {
		return this.tryGetRuleContext(0, LoopContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_instruction_without_semicolon; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterInstruction_without_semicolon) {
			listener.enterInstruction_without_semicolon(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitInstruction_without_semicolon) {
			listener.exitInstruction_without_semicolon(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitInstruction_without_semicolon) {
			return visitor.visitInstruction_without_semicolon(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Canvas_instructionContext extends ParserRuleContext {
	public add(): AddContext | undefined {
		return this.tryGetRuleContext(0, AddContext);
	}
	public update(): UpdateContext | undefined {
		return this.tryGetRuleContext(0, UpdateContext);
	}
	public delete(): DeleteContext | undefined {
		return this.tryGetRuleContext(0, DeleteContext);
	}
	public get(): GetContext | undefined {
		return this.tryGetRuleContext(0, GetContext);
	}
	public start_date(): Start_dateContext | undefined {
		return this.tryGetRuleContext(0, Start_dateContext);
	}
	public end_date(): End_dateContext | undefined {
		return this.tryGetRuleContext(0, End_dateContext);
	}
	public load(): LoadContext | undefined {
		return this.tryGetRuleContext(0, LoadContext);
	}
	public dump(): DumpContext | undefined {
		return this.tryGetRuleContext(0, DumpContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_canvas_instruction; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCanvas_instruction) {
			listener.enterCanvas_instruction(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCanvas_instruction) {
			listener.exitCanvas_instruction(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCanvas_instruction) {
			return visitor.visitCanvas_instruction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class BlockContext extends ParserRuleContext {
	public OPEN_CURLY(): TerminalNode { return this.getToken(SchedulerParser.OPEN_CURLY, 0); }
	public code(): CodeContext {
		return this.getRuleContext(0, CodeContext);
	}
	public CLOSE_CURLY(): TerminalNode { return this.getToken(SchedulerParser.CLOSE_CURLY, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_block; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterBlock) {
			listener.enterBlock(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitBlock) {
			listener.exitBlock(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitBlock) {
			return visitor.visitBlock(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class PrintContext extends ParserRuleContext {
	public PRINT(): TerminalNode { return this.getToken(SchedulerParser.PRINT, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_print; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterPrint) {
			listener.enterPrint(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitPrint) {
			listener.exitPrint(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitPrint) {
			return visitor.visitPrint(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LoadContext extends ParserRuleContext {
	public LOADTOKEN(): TerminalNode { return this.getToken(SchedulerParser.LOADTOKEN, 0); }
	public file_path(): File_pathContext {
		return this.getRuleContext(0, File_pathContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_load; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterLoad) {
			listener.enterLoad(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitLoad) {
			listener.exitLoad(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitLoad) {
			return visitor.visitLoad(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DumpContext extends ParserRuleContext {
	public DUMPTOKEN(): TerminalNode { return this.getToken(SchedulerParser.DUMPTOKEN, 0); }
	public file_path(): File_pathContext {
		return this.getRuleContext(0, File_pathContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_dump; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterDump) {
			listener.enterDump(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitDump) {
			listener.exitDump(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitDump) {
			return visitor.visitDump(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class File_pathContext extends ParserRuleContext {
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_file_path; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterFile_path) {
			listener.enterFile_path(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitFile_path) {
			listener.exitFile_path(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitFile_path) {
			return visitor.visitFile_path(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AddContext extends ParserRuleContext {
	public ADD_CANVA(): TerminalNode { return this.getToken(SchedulerParser.ADD_CANVA, 0); }
	public structure(): StructureContext | undefined {
		return this.tryGetRuleContext(0, StructureContext);
	}
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public ON(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.ON, 0); }
	public TYPENAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.TYPENAME, 0); }
	public DATESTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DATESTOKEN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_add; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAdd) {
			listener.enterAdd(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAdd) {
			listener.exitAdd(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAdd) {
			return visitor.visitAdd(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class UpdateContext extends ParserRuleContext {
	public UPDATE_CANVA(): TerminalNode { return this.getToken(SchedulerParser.UPDATE_CANVA, 0); }
	public DATE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DATE, 0); }
	public DATESTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DATESTOKEN, 0); }
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	public collection(): CollectionContext | undefined {
		return this.tryGetRuleContext(0, CollectionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_update; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterUpdate) {
			listener.enterUpdate(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitUpdate) {
			listener.exitUpdate(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitUpdate) {
			return visitor.visitUpdate(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeleteContext extends ParserRuleContext {
	public DELETE_CANVA(): TerminalNode { return this.getToken(SchedulerParser.DELETE_CANVA, 0); }
	public CLASSESTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLASSESTOKEN, 0); }
	public DAYSTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DAYSTOKEN, 0); }
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	public SATISFYING(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.SATISFYING, 0); }
	public condition(): ConditionContext | undefined {
		return this.tryGetRuleContext(0, ConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_delete; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterDelete) {
			listener.enterDelete(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitDelete) {
			listener.exitDelete(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitDelete) {
			return visitor.visitDelete(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GetContext extends ParserRuleContext {
	public GET_CANVA(): TerminalNode { return this.getToken(SchedulerParser.GET_CANVA, 0); }
	public DISTINCT(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DISTINCT, 0); }
	public CLASSESTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLASSESTOKEN, 0); }
	public DAYSTOKEN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DAYSTOKEN, 0); }
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	public SATISFYING(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.SATISFYING, 0); }
	public condition(): ConditionContext | undefined {
		return this.tryGetRuleContext(0, ConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_get; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterGet) {
			listener.enterGet(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitGet) {
			listener.exitGet(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitGet) {
			return visitor.visitGet(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Start_dateContext extends ParserRuleContext {
	public DATE(): TerminalNode { return this.getToken(SchedulerParser.DATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_start_date; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterStart_date) {
			listener.enterStart_date(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitStart_date) {
			listener.exitStart_date(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitStart_date) {
			return visitor.visitStart_date(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class End_dateContext extends ParserRuleContext {
	public DATE(): TerminalNode { return this.getToken(SchedulerParser.DATE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_end_date; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterEnd_date) {
			listener.enterEnd_date(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitEnd_date) {
			listener.exitEnd_date(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitEnd_date) {
			return visitor.visitEnd_date(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Transfer_statementContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_transfer_statement; }
	public copyFrom(ctx: Transfer_statementContext): void {
		super.copyFrom(ctx);
	}
}
export class ReturnContext extends Transfer_statementContext {
	public RETURN(): TerminalNode { return this.getToken(SchedulerParser.RETURN, 0); }
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	constructor(ctx: Transfer_statementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterReturn) {
			listener.enterReturn(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitReturn) {
			listener.exitReturn(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitReturn) {
			return visitor.visitReturn(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class BreakContext extends Transfer_statementContext {
	public BREAK(): TerminalNode { return this.getToken(SchedulerParser.BREAK, 0); }
	constructor(ctx: Transfer_statementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterBreak) {
			listener.enterBreak(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitBreak) {
			listener.exitBreak(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitBreak) {
			return visitor.visitBreak(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class LoopContext extends ParserRuleContext {
	public for_loop(): For_loopContext | undefined {
		return this.tryGetRuleContext(0, For_loopContext);
	}
	public while_loop(): While_loopContext | undefined {
		return this.tryGetRuleContext(0, While_loopContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_loop; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterLoop) {
			listener.enterLoop(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitLoop) {
			listener.exitLoop(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitLoop) {
			return visitor.visitLoop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class For_loopContext extends ParserRuleContext {
	public FOR(): TerminalNode { return this.getToken(SchedulerParser.FOR, 0); }
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public IN(): TerminalNode { return this.getToken(SchedulerParser.IN, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	public block(): BlockContext {
		return this.getRuleContext(0, BlockContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_for_loop; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterFor_loop) {
			listener.enterFor_loop(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitFor_loop) {
			listener.exitFor_loop(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitFor_loop) {
			return visitor.visitFor_loop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class While_loopContext extends ParserRuleContext {
	public WHILE(): TerminalNode { return this.getToken(SchedulerParser.WHILE, 0); }
	public condition(): ConditionContext {
		return this.getRuleContext(0, ConditionContext);
	}
	public block(): BlockContext {
		return this.getRuleContext(0, BlockContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_while_loop; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterWhile_loop) {
			listener.enterWhile_loop(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitWhile_loop) {
			listener.exitWhile_loop(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitWhile_loop) {
			return visitor.visitWhile_loop(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class If_statementContext extends ParserRuleContext {
	public IF(): TerminalNode { return this.getToken(SchedulerParser.IF, 0); }
	public condition(): ConditionContext[];
	public condition(i: number): ConditionContext;
	public condition(i?: number): ConditionContext | ConditionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ConditionContext);
		} else {
			return this.getRuleContext(i, ConditionContext);
		}
	}
	public block(): BlockContext[];
	public block(i: number): BlockContext;
	public block(i?: number): BlockContext | BlockContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BlockContext);
		} else {
			return this.getRuleContext(i, BlockContext);
		}
	}
	public ELIF(): TerminalNode[];
	public ELIF(i: number): TerminalNode;
	public ELIF(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(SchedulerParser.ELIF);
		} else {
			return this.getToken(SchedulerParser.ELIF, i);
		}
	}
	public ELSE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.ELSE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_if_statement; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterIf_statement) {
			listener.enterIf_statement(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitIf_statement) {
			listener.exitIf_statement(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitIf_statement) {
			return visitor.visitIf_statement(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ConditionContext extends ParserRuleContext {
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_condition; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCondition) {
			listener.enterCondition(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCondition) {
			listener.exitCondition(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCondition) {
			return visitor.visitCondition(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionContext extends ParserRuleContext {
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public OPEN_PAREN(): TerminalNode { return this.getToken(SchedulerParser.OPEN_PAREN, 0); }
	public args(): ArgsContext | undefined {
		return this.tryGetRuleContext(0, ArgsContext);
	}
	public block(): BlockContext | undefined {
		return this.tryGetRuleContext(0, BlockContext);
	}
	public CLOSE_PAREN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLOSE_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_function; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterFunction) {
			listener.enterFunction(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitFunction) {
			listener.exitFunction(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitFunction) {
			return visitor.visitFunction(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArgsContext extends ParserRuleContext {
	public arg(): ArgContext[];
	public arg(i: number): ArgContext;
	public arg(i?: number): ArgContext | ArgContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ArgContext);
		} else {
			return this.getRuleContext(i, ArgContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(SchedulerParser.COMMA);
		} else {
			return this.getToken(SchedulerParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_args; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterArgs) {
			listener.enterArgs(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitArgs) {
			listener.exitArgs(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitArgs) {
			return visitor.visitArgs(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArgContext extends ParserRuleContext {
	public type(): TypeContext {
		return this.getRuleContext(0, TypeContext);
	}
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_arg; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterArg) {
			listener.enterArg(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitArg) {
			listener.exitArg(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitArg) {
			return visitor.visitArg(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Func_callContext extends ParserRuleContext {
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public OPEN_PAREN(): TerminalNode { return this.getToken(SchedulerParser.OPEN_PAREN, 0); }
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(SchedulerParser.COMMA);
		} else {
			return this.getToken(SchedulerParser.COMMA, i);
		}
	}
	public CLOSE_PAREN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLOSE_PAREN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_func_call; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterFunc_call) {
			listener.enterFunc_call(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitFunc_call) {
			listener.exitFunc_call(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitFunc_call) {
			return visitor.visitFunc_call(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DefContext extends ParserRuleContext {
	public TYPENAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.TYPENAME, 0); }
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	public SINGLEEQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.SINGLEEQUAL, 0); }
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	public COLLECTION_OF(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.COLLECTION_OF, 0); }
	public type(): TypeContext | undefined {
		return this.tryGetRuleContext(0, TypeContext);
	}
	public dayDef(): DayDefContext | undefined {
		return this.tryGetRuleContext(0, DayDefContext);
	}
	public classDef(): ClassDefContext | undefined {
		return this.tryGetRuleContext(0, ClassDefContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_def; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterDef) {
			listener.enterDef(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitDef) {
			listener.exitDef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitDef) {
			return visitor.visitDef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ClassDefContext extends ParserRuleContext {
	public CLASSNAME(): TerminalNode { return this.getToken(SchedulerParser.CLASSNAME, 0); }
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	public CLASS_ATTRIBUTE(): TerminalNode[];
	public CLASS_ATTRIBUTE(i: number): TerminalNode;
	public CLASS_ATTRIBUTE(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(SchedulerParser.CLASS_ATTRIBUTE);
		} else {
			return this.getToken(SchedulerParser.CLASS_ATTRIBUTE, i);
		}
	}
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_classDef; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterClassDef) {
			listener.enterClassDef(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitClassDef) {
			listener.exitClassDef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitClassDef) {
			return visitor.visitClassDef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DayDefContext extends ParserRuleContext {
	public DAYNAME(): TerminalNode { return this.getToken(SchedulerParser.DAYNAME, 0); }
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	public day_attribute(): Day_attributeContext | undefined {
		return this.tryGetRuleContext(0, Day_attributeContext);
	}
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_dayDef; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterDayDef) {
			listener.enterDayDef(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitDayDef) {
			listener.exitDayDef(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitDayDef) {
			return visitor.visitDayDef(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AssignContext extends ParserRuleContext {
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public SINGLEEQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.SINGLEEQUAL, 0); }
	public expr(): ExprContext | undefined {
		return this.tryGetRuleContext(0, ExprContext);
	}
	public DOT(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DOT, 0); }
	public attribute(): AttributeContext | undefined {
		return this.tryGetRuleContext(0, AttributeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_assign; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAssign) {
			listener.enterAssign(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAssign) {
			listener.exitAssign(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAssign) {
			return visitor.visitAssign(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AttributeContext extends ParserRuleContext {
	public CLASS_ATTRIBUTE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLASS_ATTRIBUTE, 0); }
	public day_attribute(): Day_attributeContext | undefined {
		return this.tryGetRuleContext(0, Day_attributeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_attribute; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAttribute) {
			listener.enterAttribute(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAttribute) {
			listener.exitAttribute(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAttribute) {
			return visitor.visitAttribute(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Attribute_callContext extends ParserRuleContext {
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public DOT(): TerminalNode { return this.getToken(SchedulerParser.DOT, 0); }
	public attribute(): AttributeContext | undefined {
		return this.tryGetRuleContext(0, AttributeContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_attribute_call; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAttribute_call) {
			listener.enterAttribute_call(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAttribute_call) {
			listener.exitAttribute_call(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAttribute_call) {
			return visitor.visitAttribute_call(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Day_attributeContext extends ParserRuleContext {
	public CLASSESTOKEN(): TerminalNode { return this.getToken(SchedulerParser.CLASSESTOKEN, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_day_attribute; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterDay_attribute) {
			listener.enterDay_attribute(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitDay_attribute) {
			listener.exitDay_attribute(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitDay_attribute) {
			return visitor.visitDay_attribute(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CollectionContext extends ParserRuleContext {
	public OPEN_BRACKET(): TerminalNode { return this.getToken(SchedulerParser.OPEN_BRACKET, 0); }
	public CLOSE_BRACKET(): TerminalNode { return this.getToken(SchedulerParser.CLOSE_BRACKET, 0); }
	public collection_elements(): Collection_elementsContext | undefined {
		return this.tryGetRuleContext(0, Collection_elementsContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_collection; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCollection) {
			listener.enterCollection(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCollection) {
			listener.exitCollection(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCollection) {
			return visitor.visitCollection(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Collection_elementsContext extends ParserRuleContext {
	public collection_element(): Collection_elementContext[];
	public collection_element(i: number): Collection_elementContext;
	public collection_element(i?: number): Collection_elementContext | Collection_elementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(Collection_elementContext);
		} else {
			return this.getRuleContext(i, Collection_elementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(SchedulerParser.COMMA);
		} else {
			return this.getToken(SchedulerParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_collection_elements; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCollection_elements) {
			listener.enterCollection_elements(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCollection_elements) {
			listener.exitCollection_elements(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCollection_elements) {
			return visitor.visitCollection_elements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Collection_elementContext extends ParserRuleContext {
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_collection_element; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCollection_element) {
			listener.enterCollection_element(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCollection_element) {
			listener.exitCollection_element(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCollection_element) {
			return visitor.visitCollection_element(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class Collection_subscriptionContext extends ParserRuleContext {
	public VARNAME(): TerminalNode { return this.getToken(SchedulerParser.VARNAME, 0); }
	public OPEN_BRACKET(): TerminalNode { return this.getToken(SchedulerParser.OPEN_BRACKET, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	public CLOSE_BRACKET(): TerminalNode { return this.getToken(SchedulerParser.CLOSE_BRACKET, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_collection_subscription; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCollection_subscription) {
			listener.enterCollection_subscription(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCollection_subscription) {
			listener.exitCollection_subscription(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCollection_subscription) {
			return visitor.visitCollection_subscription(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ExprContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_expr; }
	public copyFrom(ctx: ExprContext): void {
		super.copyFrom(ctx);
	}
}
export class CallsContext extends ExprContext {
	public func_call(): Func_callContext | undefined {
		return this.tryGetRuleContext(0, Func_callContext);
	}
	public attribute_call(): Attribute_callContext | undefined {
		return this.tryGetRuleContext(0, Attribute_callContext);
	}
	public canvas_instruction(): Canvas_instructionContext | undefined {
		return this.tryGetRuleContext(0, Canvas_instructionContext);
	}
	public collection_subscription(): Collection_subscriptionContext | undefined {
		return this.tryGetRuleContext(0, Collection_subscriptionContext);
	}
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCalls) {
			listener.enterCalls(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCalls) {
			listener.exitCalls(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCalls) {
			return visitor.visitCalls(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class NotExprContext extends ExprContext {
	public NOT(): TerminalNode { return this.getToken(SchedulerParser.NOT, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterNotExpr) {
			listener.enterNotExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitNotExpr) {
			listener.exitNotExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitNotExpr) {
			return visitor.visitNotExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class MultDivContext extends ExprContext {
	public _op!: Token;
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public MULTIPLY(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.MULTIPLY, 0); }
	public DIVIDE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DIVIDE, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterMultDiv) {
			listener.enterMultDiv(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitMultDiv) {
			listener.exitMultDiv(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitMultDiv) {
			return visitor.visitMultDiv(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class AddSubContext extends ExprContext {
	public _op!: Token;
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public ADD(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.ADD, 0); }
	public SUBTRACT(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.SUBTRACT, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAddSub) {
			listener.enterAddSub(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAddSub) {
			listener.exitAddSub(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAddSub) {
			return visitor.visitAddSub(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class CompareContext extends ExprContext {
	public _op!: Token;
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public LESS_THAN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.LESS_THAN, 0); }
	public LESS_THAN_OR_EQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.LESS_THAN_OR_EQUAL, 0); }
	public GREATER_THAN(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.GREATER_THAN, 0); }
	public GREATER_THAN_OR_EQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.GREATER_THAN_OR_EQUAL, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterCompare) {
			listener.enterCompare(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitCompare) {
			listener.exitCompare(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitCompare) {
			return visitor.visitCompare(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class EqualExprContext extends ExprContext {
	public _op!: Token;
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public EQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.EQUAL, 0); }
	public NOT_EQUAL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.NOT_EQUAL, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterEqualExpr) {
			listener.enterEqualExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitEqualExpr) {
			listener.exitEqualExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitEqualExpr) {
			return visitor.visitEqualExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class AndExprContext extends ExprContext {
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public AND(): TerminalNode { return this.getToken(SchedulerParser.AND, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterAndExpr) {
			listener.enterAndExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitAndExpr) {
			listener.exitAndExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitAndExpr) {
			return visitor.visitAndExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class OrExprContext extends ExprContext {
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public OR(): TerminalNode { return this.getToken(SchedulerParser.OR, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterOrExpr) {
			listener.enterOrExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitOrExpr) {
			listener.exitOrExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitOrExpr) {
			return visitor.visitOrExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class OverlapExprContext extends ExprContext {
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public OVERLAP(): TerminalNode { return this.getToken(SchedulerParser.OVERLAP, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterOverlapExpr) {
			listener.enterOverlapExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitOverlapExpr) {
			listener.exitOverlapExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitOverlapExpr) {
			return visitor.visitOverlapExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class InExprContext extends ExprContext {
	public expr(): ExprContext[];
	public expr(i: number): ExprContext;
	public expr(i?: number): ExprContext | ExprContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ExprContext);
		} else {
			return this.getRuleContext(i, ExprContext);
		}
	}
	public IN(): TerminalNode { return this.getToken(SchedulerParser.IN, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterInExpr) {
			listener.enterInExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitInExpr) {
			listener.exitInExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitInExpr) {
			return visitor.visitInExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ParenthesisContext extends ExprContext {
	public OPEN_PAREN(): TerminalNode { return this.getToken(SchedulerParser.OPEN_PAREN, 0); }
	public expr(): ExprContext {
		return this.getRuleContext(0, ExprContext);
	}
	public CLOSE_PAREN(): TerminalNode { return this.getToken(SchedulerParser.CLOSE_PAREN, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterParenthesis) {
			listener.enterParenthesis(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitParenthesis) {
			listener.exitParenthesis(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitParenthesis) {
			return visitor.visitParenthesis(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
export class ValueExprContext extends ExprContext {
	public collection(): CollectionContext | undefined {
		return this.tryGetRuleContext(0, CollectionContext);
	}
	public value(): ValueContext | undefined {
		return this.tryGetRuleContext(0, ValueContext);
	}
	public VARNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.VARNAME, 0); }
	constructor(ctx: ExprContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterValueExpr) {
			listener.enterValueExpr(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitValueExpr) {
			listener.exitValueExpr(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitValueExpr) {
			return visitor.visitValueExpr(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class TypeContext extends ParserRuleContext {
	public TYPENAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.TYPENAME, 0); }
	public structure(): StructureContext | undefined {
		return this.tryGetRuleContext(0, StructureContext);
	}
	public COLLECTION_OF(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.COLLECTION_OF, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_type; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterType) {
			listener.enterType(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitType) {
			listener.exitType(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitType) {
			return visitor.visitType(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StructureContext extends ParserRuleContext {
	public CLASSNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.CLASSNAME, 0); }
	public DAYNAME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DAYNAME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_structure; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterStructure) {
			listener.enterStructure(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitStructure) {
			listener.exitStructure(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitStructure) {
			return visitor.visitStructure(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ValueContext extends ParserRuleContext {
	public INT(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.INT, 0); }
	public BOOL(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.BOOL, 0); }
	public STRING(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.STRING, 0); }
	public DATE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.DATE, 0); }
	public TIME(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.TIME, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_value; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterValue) {
			listener.enterValue(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitValue) {
			listener.exitValue(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitValue) {
			return visitor.visitValue(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CommentsContext extends ParserRuleContext {
	public COMMENT_LINE(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.COMMENT_LINE, 0); }
	public COMMENT(): TerminalNode | undefined { return this.tryGetToken(SchedulerParser.COMMENT, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return SchedulerParser.RULE_comments; }
	// @Override
	public enterRule(listener: SchedulerListener): void {
		if (listener.enterComments) {
			listener.enterComments(this);
		}
	}
	// @Override
	public exitRule(listener: SchedulerListener): void {
		if (listener.exitComments) {
			listener.exitComments(this);
		}
	}
	// @Override
	public accept<Result>(visitor: SchedulerVisitor<Result>): Result {
		if (visitor.visitComments) {
			return visitor.visitComments(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


