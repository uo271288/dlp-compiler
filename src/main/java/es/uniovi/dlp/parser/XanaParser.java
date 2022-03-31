// Generated from Xana.g4 by ANTLR 4.9.3

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.expressions.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, ID=43, 
		SIMPLE_COMMENT=44, MULTILINE_COMMENT=45, WS=46;
	public static final int
		RULE_program = 0, RULE_varDef = 1, RULE_varIDs = 2, RULE_type = 3, RULE_recordFields = 4, 
		RULE_simpleType = 5, RULE_funcDef = 6, RULE_paramList = 7, RULE_param = 8, 
		RULE_returnType = 9, RULE_mainFunc = 10, RULE_statement = 11, RULE_exprs = 12, 
		RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDef", "varIDs", "type", "recordFields", "simpleType", 
			"funcDef", "paramList", "param", "returnType", "mainFunc", "statement", 
			"exprs", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "','", "'['", "']'", "'defstruct do'", "'end'", "'int'", 
			"'double'", "'char'", "'def'", "'('", "')'", "'do'", "'void'", "'main'", 
			"'if'", "':'", "'else'", "'puts'", "'in'", "'while'", "'return'", "'='", 
			"'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"ID", "SIMPLE_COMMENT", "MULTILINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public VarDefContext varDef;
		public List<VarDefContext> vars = new ArrayList<VarDefContext>();
		public FuncDefContext funcDef;
		public List<FuncDefContext> functions = new ArrayList<FuncDefContext>();
		public MainFuncContext mainFunc;
		public MainFuncContext mainFunc() {
			return getRuleContext(MainFuncContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XanaParser.EOF, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28);
				((ProgramContext)_localctx).varDef = varDef();
				((ProgramContext)_localctx).vars.add(((ProgramContext)_localctx).varDef);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					((ProgramContext)_localctx).funcDef = funcDef();
					((ProgramContext)_localctx).functions.add(((ProgramContext)_localctx).funcDef);
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(40);
			((ProgramContext)_localctx).mainFunc = mainFunc();
			setState(41);
			match(EOF);

			            List<Definition> def = new ArrayList<Definition>();
			            for(var v : ((ProgramContext)_localctx).vars) {
			                def.addAll(v.astList);
			            }
			            for(var f : ((ProgramContext)_localctx).functions) {
			                def.add(f.ast);
			            }
			            def.add(((ProgramContext)_localctx).mainFunc.ast);
			            ((ProgramContext)_localctx).ast =  new Program(def, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public List<VariableDefinition> astList = new ArrayList<>();
		public VarIDsContext varIDs;
		public TypeContext type;
		public VarIDsContext varIDs() {
			return getRuleContext(VarIDsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((VarDefContext)_localctx).varIDs = varIDs();
			setState(45);
			match(T__0);
			setState(46);
			((VarDefContext)_localctx).type = type();

			            for(var id : ((VarDefContext)_localctx).varIDs.astList) {
			                _localctx.astList.add(new VariableDefinition(((VarDefContext)_localctx).type.ast, id.getName(), id.getLine(), id.getColumn()));
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIDsContext extends ParserRuleContext {
		public List<VariableDefinition> astList = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public VarIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIDs; }
	}

	public final VarIDsContext varIDs() throws RecognitionException {
		VarIDsContext _localctx = new VarIDsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((VarIDsContext)_localctx).ID = match(ID);
			((VarIDsContext)_localctx).ids.add(((VarIDsContext)_localctx).ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(50);
				match(T__1);
				setState(51);
				((VarIDsContext)_localctx).ID = match(ID);
				((VarIDsContext)_localctx).ids.add(((VarIDsContext)_localctx).ID);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            for(var id : ((VarIDsContext)_localctx).ids){
			                _localctx.astList.add(new VariableDefinition(null, id.getText(), id.getLine(), id.getCharPositionInLine() + 1));
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext simpleType;
		public Token INT_CONSTANT;
		public TypeContext type;
		public RecordFieldsContext recordFields;
		public List<RecordFieldsContext> rFields = new ArrayList<RecordFieldsContext>();
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RecordFieldsContext> recordFields() {
			return getRuleContexts(RecordFieldsContext.class);
		}
		public RecordFieldsContext recordFields(int i) {
			return getRuleContext(RecordFieldsContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((TypeContext)_localctx).simpleType = simpleType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simpleType.ast;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__2);
				setState(63);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(64);
				match(T__0);
				setState(65);
				((TypeContext)_localctx).type = type();
				setState(66);
				match(T__3);
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast, ((TypeContext)_localctx).INT_CONSTANT.getLine(), ((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__4);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(70);
					((TypeContext)_localctx).recordFields = recordFields();
					((TypeContext)_localctx).rFields.add(((TypeContext)_localctx).recordFields);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(T__5);

				            List<StructField> fields = new ArrayList<>();
				            for(var f : ((TypeContext)_localctx).rFields) {
				                fields.addAll(f.astList);
				            }
				            ((TypeContext)_localctx).ast =  new StructType(fields, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<StructField> astList = new ArrayList<>();
		public VarIDsContext varIDs;
		public TypeContext type;
		public VarIDsContext varIDs() {
			return getRuleContext(VarIDsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recordFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((RecordFieldsContext)_localctx).varIDs = varIDs();
			setState(81);
			match(T__0);
			setState(82);
			((RecordFieldsContext)_localctx).type = type();

			                for(var id : ((RecordFieldsContext)_localctx).varIDs.astList) {
			                    _localctx.astList.add(new StructField(id.getName(), ((RecordFieldsContext)_localctx).type.ast, id.getLine(), id.getColumn()));
			                }
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleType);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__6);
				((SimpleTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__7);
				((SimpleTypeContext)_localctx).ast =  new RealType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(T__8);
				((SimpleTypeContext)_localctx).ast =  new CharType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token ID;
		public ParamListContext paramList;
		public ReturnTypeContext returnType;
		public VarDefContext varDef;
		public List<VarDefContext> vars = new ArrayList<VarDefContext>();
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(94);
			((FuncDefContext)_localctx).ID = match(ID);
			setState(95);
			match(T__10);
			setState(96);
			((FuncDefContext)_localctx).paramList = paramList();
			setState(97);
			match(T__11);
			setState(98);
			match(T__0);
			setState(99);
			((FuncDefContext)_localctx).returnType = returnType();
			setState(100);
			match(T__12);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					((FuncDefContext)_localctx).varDef = varDef();
					((FuncDefContext)_localctx).vars.add(((FuncDefContext)_localctx).varDef);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(107);
				((FuncDefContext)_localctx).statement = statement();
				((FuncDefContext)_localctx).stmts.add(((FuncDefContext)_localctx).statement);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__5);

			            FunctionType type = new FunctionType(((FuncDefContext)_localctx).paramList.astList, ((FuncDefContext)_localctx).returnType.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			            List<VariableDefinition> defs = new ArrayList<VariableDefinition>();
			            for(var v : ((FuncDefContext)_localctx).vars) {
			                defs.addAll(v.astList);
			            }
			            List<Statement> sts = new ArrayList<Statement>();
			            for(var s : ((FuncDefContext)_localctx).stmts) {
			                sts.addAll(s.astList);
			            }
			            ((FuncDefContext)_localctx).ast =  new FunctionDefinition(sts, defs, type, (((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<VariableDefinition> astList = new ArrayList<>();
		public ParamContext param;
		public List<ParamContext> list = new ArrayList<ParamContext>();
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(116);
				((ParamListContext)_localctx).param = param();
				((ParamListContext)_localctx).list.add(((ParamListContext)_localctx).param);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(117);
					match(T__1);
					setState(118);
					((ParamListContext)_localctx).param = param();
					((ParamListContext)_localctx).list.add(((ParamListContext)_localctx).param);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			            for(var p : ((ParamListContext)_localctx).list) {
			                _localctx.astList.add(p.ast);
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public VariableDefinition ast;
		public Token ID;
		public SimpleTypeContext simpleType;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((ParamContext)_localctx).ID = match(ID);
			setState(129);
			match(T__0);
			setState(130);
			((ParamContext)_localctx).simpleType = simpleType();
			((ParamContext)_localctx).ast =  new VariableDefinition(((ParamContext)_localctx).simpleType.ast, (((ParamContext)_localctx).ID!=null?((ParamContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public SimpleTypeContext simpleType;
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__13);
				((ReturnTypeContext)_localctx).ast =  new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((ReturnTypeContext)_localctx).simpleType = simpleType();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simpleType.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFuncContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public VarDefContext varDef;
		public List<VarDefContext> vars = new ArrayList<VarDefContext>();
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunc; }
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__9);
			setState(141);
			match(T__14);
			setState(142);
			match(T__10);
			setState(143);
			match(T__11);
			setState(144);
			match(T__12);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(145);
					((MainFuncContext)_localctx).varDef = varDef();
					((MainFuncContext)_localctx).vars.add(((MainFuncContext)_localctx).varDef);
					}
					break;
				case 2:
					{
					setState(146);
					((MainFuncContext)_localctx).statement = statement();
					((MainFuncContext)_localctx).stmts.add(((MainFuncContext)_localctx).statement);
					}
					break;
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__5);

			                    FunctionType type = new FunctionType(new ArrayList<>(), new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1), _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			                    List<VariableDefinition> defs = new ArrayList<VariableDefinition>();
			                    for(var v : ((MainFuncContext)_localctx).vars) {
			                        defs.addAll(v.astList);
			                    }
			                    List<Statement> sts = new ArrayList<Statement>();
			                    for(var s : ((MainFuncContext)_localctx).stmts) {
			                        sts.addAll(s.astList);
			                    }
			                    ((MainFuncContext)_localctx).ast =  new FunctionDefinition(sts, defs, type, "main", _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> astList = new ArrayList<>();
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext cond;
		public StatementContext statement;
		public List<StatementContext> ifBody = new ArrayList<StatementContext>();
		public List<StatementContext> elseBody = new ArrayList<StatementContext>();
		public ExprsContext exprs;
		public ExprContext expr;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
		public ExprContext leftExpr;
		public ExprContext rightExpr;
		public Token ID;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__15);
				setState(156);
				((StatementContext)_localctx).cond = expr(0);
				setState(157);
				match(T__1);
				setState(158);
				match(T__12);
				setState(159);
				match(T__16);
				setState(160);
				((StatementContext)_localctx).statement = statement();
				((StatementContext)_localctx).ifBody.add(((StatementContext)_localctx).statement);
				setState(161);
				match(T__1);
				setState(162);
				match(T__17);
				setState(163);
				match(T__16);
				setState(164);
				((StatementContext)_localctx).statement = statement();
				((StatementContext)_localctx).elseBody.add(((StatementContext)_localctx).statement);

				            List<Statement> ifBodyAux = new ArrayList<Statement>();
				            for(var s : ((StatementContext)_localctx).ifBody) {
				                ifBodyAux.addAll(s.astList);
				            }
				            List<Statement> elseBodyAux = new ArrayList<Statement>();
				            for(var s : ((StatementContext)_localctx).elseBody) {
				                elseBodyAux.addAll(s.astList);
				            }
				            _localctx.astList.add(new Conditional(((StatementContext)_localctx).cond.ast, ifBodyAux, elseBodyAux, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__15);
				setState(168);
				((StatementContext)_localctx).cond = expr(0);
				setState(169);
				match(T__12);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(170);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).ifBody.add(((StatementContext)_localctx).statement);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(176);
					match(T__17);
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(177);
						((StatementContext)_localctx).statement = statement();
						((StatementContext)_localctx).elseBody.add(((StatementContext)_localctx).statement);
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(185);
				match(T__5);

				            List<Statement> ifBodyAux = new ArrayList<Statement>();
				            for(var s : ((StatementContext)_localctx).ifBody) {
				                ifBodyAux.addAll(s.astList);
				            }
				            List<Statement> elseBodyAux = new ArrayList<Statement>();
				            for(var s : ((StatementContext)_localctx).elseBody) {
				                elseBodyAux.addAll(s.astList);
				            }
				            _localctx.astList.add(new Conditional(((StatementContext)_localctx).cond.ast, ifBodyAux, elseBodyAux, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__18);
				setState(189);
				((StatementContext)_localctx).exprs = exprs();

				                _localctx.list.addAll(((StatementContext)_localctx).exprs.astList);
				                for(var e : _localctx.list){
				                    _localctx.astList.add(new Puts(e, e.getLine(), e.getColumn()));
				                }
				            
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(T__19);
				setState(193);
				((StatementContext)_localctx).exprs = exprs();

				                _localctx.list.addAll(((StatementContext)_localctx).exprs.astList);
				                for(var e : _localctx.list){
				                    _localctx.astList.add(new In(e, e.getLine(), e.getColumn()));
				                }
				            
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__20);
				setState(197);
				((StatementContext)_localctx).expr = expr(0);
				setState(198);
				match(T__12);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(199);
					((StatementContext)_localctx).statement = statement();
					((StatementContext)_localctx).stmts.add(((StatementContext)_localctx).statement);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__5);

				            List<Statement> stmtsAux = new ArrayList<Statement>();
				            for(var s : ((StatementContext)_localctx).stmts) {
				                stmtsAux.addAll(s.astList);
				            }
				            _localctx.astList.add(new While(((StatementContext)_localctx).expr.ast, stmtsAux, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				match(T__21);
				setState(209);
				((StatementContext)_localctx).expr = expr(0);
				_localctx.astList.add(new Return(((StatementContext)_localctx).expr.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				((StatementContext)_localctx).leftExpr = expr(0);
				setState(213);
				match(T__22);
				setState(214);
				((StatementContext)_localctx).rightExpr = expr(0);
				_localctx.astList.add(new Assignment(((StatementContext)_localctx).leftExpr.ast, ((StatementContext)_localctx).rightExpr.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				((StatementContext)_localctx).ID = match(ID);
				setState(218);
				match(T__10);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(219);
					((StatementContext)_localctx).exprs = exprs();
					_localctx.list.addAll(((StatementContext)_localctx).exprs.astList);
					}
				}

				setState(224);
				match(T__11);

				                      _localctx.astList.add(new FunctionInvocation(new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1), _localctx.list, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1));
				                      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<Expression> astList = new ArrayList<>();
		public ExprContext expr;
		public List<ExprContext> list = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((ExprsContext)_localctx).expr = expr(0);
			((ExprsContext)_localctx).list.add(((ExprsContext)_localctx).expr);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(229);
					match(T__1);
					setState(230);
					((ExprsContext)_localctx).expr = expr(0);
					((ExprsContext)_localctx).list.add(((ExprsContext)_localctx).expr);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}

			            for(var e : ((ExprsContext)_localctx).list) {
			                _localctx.astList.add(e.ast);
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> list = new ArrayList<Expression>();
		public ExprContext array;
		public ExprContext a;
		public ExprContext leftExpr;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public ExprsContext exprs;
		public ExprContext expr;
		public Token op;
		public ExprContext rightExpr;
		public ExprContext index;
		public SimpleTypeContext simpleType;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(239);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExprContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 2:
				{
				setState(241);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExprContext)_localctx).ast =  new RealLiteral(LexerHelper.lexemeToReal((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 3:
				{
				setState(243);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExprContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 4:
				{
				setState(245);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 5:
				{
				setState(247);
				((ExprContext)_localctx).ID = match(ID);
				setState(248);
				match(T__10);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(249);
					((ExprContext)_localctx).exprs = exprs();
					_localctx.list.addAll(((ExprContext)_localctx).exprs.astList);
					}
				}

				setState(254);
				match(T__11);
				((ExprContext)_localctx).ast =  new FunctionInvocation(new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1), _localctx.list, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 6:
				{
				setState(256);
				match(T__10);
				setState(257);
				((ExprContext)_localctx).expr = expr(0);
				setState(258);
				match(T__11);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 7:
				{
				setState(261);
				match(T__25);
				setState(262);
				((ExprContext)_localctx).expr = expr(7);
				((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).expr.ast, ((ExprContext)_localctx).expr.ast.getLine(), ((ExprContext)_localctx).expr.ast.getColumn());
				}
				break;
			case 8:
				{
				setState(265);
				match(T__26);
				setState(266);
				((ExprContext)_localctx).expr = expr(6);
				((ExprContext)_localctx).ast =  new Not(((ExprContext)_localctx).expr.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(272);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).ast =  new Arithmetic(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(277);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__30) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).ast =  new Arithmetic(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), ((ExprContext)_localctx).op.getLine(), ((ExprContext)_localctx).op.getCharPositionInLine()+1);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(282);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).ast =  new Comparison(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(287);
						((ExprContext)_localctx).op = match(T__37);
						setState(288);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).ast =  new Logical(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(292);
						((ExprContext)_localctx).op = match(T__38);
						setState(293);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(2);
						((ExprContext)_localctx).ast =  new Logical(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.array = _prevctx;
						_localctx.array = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(297);
						match(T__2);
						setState(298);
						((ExprContext)_localctx).index = ((ExprContext)_localctx).expr = expr(0);
						setState(299);
						match(T__3);
						((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).array.ast, ((ExprContext)_localctx).index.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(303);
						match(T__23);
						setState(304);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).ast =  new FieldAccess(((ExprContext)_localctx).a.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(307);
						match(T__24);
						setState(308);
						((ExprContext)_localctx).simpleType = simpleType();
						((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).a.ast, ((ExprContext)_localctx).simpleType.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u013f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\5\t\177\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ae\n\r\f\r\16"+
		"\r\u00b1\13\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\5\r\u00ba\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cb"+
		"\n\r\f\r\16\r\u00ce\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e1\n\r\3\r\3\r\5\r\u00e5\n\r\3\16\3\16\3"+
		"\16\7\16\u00ea\n\16\f\16\16\16\u00ed\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ff\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0110\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u013a\n\17\f\17\16\17\u013d\13\17\3\17\2\3\34\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\36 \4\2\34\34!!\3\2\"\'\2\u015c"+
		"\2!\3\2\2\2\4.\3\2\2\2\6\63\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\f]\3\2\2\2\16"+
		"_\3\2\2\2\20~\3\2\2\2\22\u0082\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2"+
		"\2\30\u00e4\3\2\2\2\32\u00e6\3\2\2\2\34\u010f\3\2\2\2\36 \5\4\3\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\16"+
		"\b\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+"+
		"\5\26\f\2+,\7\2\2\3,-\b\2\1\2-\3\3\2\2\2./\5\6\4\2/\60\7\3\2\2\60\61\5"+
		"\b\5\2\61\62\b\3\1\2\62\5\3\2\2\2\638\7-\2\2\64\65\7\4\2\2\65\67\7-\2"+
		"\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2"+
		";<\b\4\1\2<\7\3\2\2\2=>\5\f\7\2>?\b\5\1\2?Q\3\2\2\2@A\7\5\2\2AB\7*\2\2"+
		"BC\7\3\2\2CD\5\b\5\2DE\7\6\2\2EF\b\5\1\2FQ\3\2\2\2GK\7\7\2\2HJ\5\n\6\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\b\2\2"+
		"OQ\b\5\1\2P=\3\2\2\2P@\3\2\2\2PG\3\2\2\2Q\t\3\2\2\2RS\5\6\4\2ST\7\3\2"+
		"\2TU\5\b\5\2UV\b\6\1\2V\13\3\2\2\2WX\7\t\2\2X^\b\7\1\2YZ\7\n\2\2Z^\b\7"+
		"\1\2[\\\7\13\2\2\\^\b\7\1\2]W\3\2\2\2]Y\3\2\2\2][\3\2\2\2^\r\3\2\2\2_"+
		"`\7\f\2\2`a\7-\2\2ab\7\r\2\2bc\5\20\t\2cd\7\16\2\2de\7\3\2\2ef\5\24\13"+
		"\2fj\7\17\2\2gi\5\4\3\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2"+
		"\2\2lj\3\2\2\2mo\5\30\r\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3"+
		"\2\2\2rp\3\2\2\2st\7\b\2\2tu\b\b\1\2u\17\3\2\2\2v{\5\22\n\2wx\7\4\2\2"+
		"xz\5\22\n\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2~v\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\t\1\2\u0081"+
		"\21\3\2\2\2\u0082\u0083\7-\2\2\u0083\u0084\7\3\2\2\u0084\u0085\5\f\7\2"+
		"\u0085\u0086\b\n\1\2\u0086\23\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u008d"+
		"\b\13\1\2\u0089\u008a\5\f\7\2\u008a\u008b\b\13\1\2\u008b\u008d\3\2\2\2"+
		"\u008c\u0087\3\2\2\2\u008c\u0089\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f"+
		"\7\f\2\2\u008f\u0090\7\21\2\2\u0090\u0091\7\r\2\2\u0091\u0092\7\16\2\2"+
		"\u0092\u0097\7\17\2\2\u0093\u0096\5\4\3\2\u0094\u0096\5\30\r\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\b"+
		"\2\2\u009b\u009c\b\f\1\2\u009c\27\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f"+
		"\5\34\17\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\7\23\2"+
		"\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\7\24\2\2\u00a5"+
		"\u00a6\7\23\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\b\r\1\2\u00a8\u00e5\3"+
		"\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00af\7\17\2\2"+
		"\u00ac\u00ae\5\30\r\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b6\7\24\2\2\u00b3\u00b5\5\30\r\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\b\r\1\2\u00bd\u00e5\3\2\2\2\u00be"+
		"\u00bf\7\25\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\b\r\1\2\u00c1\u00e5"+
		"\3\2\2\2\u00c2\u00c3\7\26\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\b\r\1"+
		"\2\u00c5\u00e5\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\5\34\17\2\u00c8"+
		"\u00cc\7\17\2\2\u00c9\u00cb\5\30\r\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00d1\b\r\1\2\u00d1\u00e5\3\2"+
		"\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\5\34\17\2\u00d4\u00d5\b\r\1\2\u00d5"+
		"\u00e5\3\2\2\2\u00d6\u00d7\5\34\17\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9"+
		"\5\34\17\2\u00d9\u00da\b\r\1\2\u00da\u00e5\3\2\2\2\u00db\u00dc\7-\2\2"+
		"\u00dc\u00e0\7\r\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\b\r\1\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\16\2\2\u00e3\u00e5\b\r\1\2\u00e4\u009d\3\2\2\2\u00e4\u00a9\3"+
		"\2\2\2\u00e4\u00be\3\2\2\2\u00e4\u00c2\3\2\2\2\u00e4\u00c6\3\2\2\2\u00e4"+
		"\u00d2\3\2\2\2\u00e4\u00d6\3\2\2\2\u00e4\u00db\3\2\2\2\u00e5\31\3\2\2"+
		"\2\u00e6\u00eb\5\34\17\2\u00e7\u00e8\7\4\2\2\u00e8\u00ea\5\34\17\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b\16\1\2\u00ef"+
		"\33\3\2\2\2\u00f0\u00f1\b\17\1\2\u00f1\u00f2\7*\2\2\u00f2\u0110\b\17\1"+
		"\2\u00f3\u00f4\7+\2\2\u00f4\u0110\b\17\1\2\u00f5\u00f6\7,\2\2\u00f6\u0110"+
		"\b\17\1\2\u00f7\u00f8\7-\2\2\u00f8\u0110\b\17\1\2\u00f9\u00fa\7-\2\2\u00fa"+
		"\u00fe\7\r\2\2\u00fb\u00fc\5\32\16\2\u00fc\u00fd\b\17\1\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\7\16\2\2\u0101\u0110\b\17\1\2\u0102\u0103\7\r\2\2\u0103\u0104\5"+
		"\34\17\2\u0104\u0105\7\16\2\2\u0105\u0106\b\17\1\2\u0106\u0110\3\2\2\2"+
		"\u0107\u0108\7\34\2\2\u0108\u0109\5\34\17\t\u0109\u010a\b\17\1\2\u010a"+
		"\u0110\3\2\2\2\u010b\u010c\7\35\2\2\u010c\u010d\5\34\17\b\u010d\u010e"+
		"\b\17\1\2\u010e\u0110\3\2\2\2\u010f\u00f0\3\2\2\2\u010f\u00f3\3\2\2\2"+
		"\u010f\u00f5\3\2\2\2\u010f\u00f7\3\2\2\2\u010f\u00f9\3\2\2\2\u010f\u0102"+
		"\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110\u013b\3\2\2\2\u0111"+
		"\u0112\f\7\2\2\u0112\u0113\t\2\2\2\u0113\u0114\5\34\17\b\u0114\u0115\b"+
		"\17\1\2\u0115\u013a\3\2\2\2\u0116\u0117\f\6\2\2\u0117\u0118\t\3\2\2\u0118"+
		"\u0119\5\34\17\7\u0119\u011a\b\17\1\2\u011a\u013a\3\2\2\2\u011b\u011c"+
		"\f\5\2\2\u011c\u011d\t\4\2\2\u011d\u011e\5\34\17\6\u011e\u011f\b\17\1"+
		"\2\u011f\u013a\3\2\2\2\u0120\u0121\f\4\2\2\u0121\u0122\7(\2\2\u0122\u0123"+
		"\5\34\17\5\u0123\u0124\b\17\1\2\u0124\u013a\3\2\2\2\u0125\u0126\f\3\2"+
		"\2\u0126\u0127\7)\2\2\u0127\u0128\5\34\17\4\u0128\u0129\b\17\1\2\u0129"+
		"\u013a\3\2\2\2\u012a\u012b\f\f\2\2\u012b\u012c\7\5\2\2\u012c\u012d\5\34"+
		"\17\2\u012d\u012e\7\6\2\2\u012e\u012f\b\17\1\2\u012f\u013a\3\2\2\2\u0130"+
		"\u0131\f\13\2\2\u0131\u0132\7\32\2\2\u0132\u0133\7-\2\2\u0133\u013a\b"+
		"\17\1\2\u0134\u0135\f\n\2\2\u0135\u0136\7\33\2\2\u0136\u0137\5\f\7\2\u0137"+
		"\u0138\b\17\1\2\u0138\u013a\3\2\2\2\u0139\u0111\3\2\2\2\u0139\u0116\3"+
		"\2\2\2\u0139\u011b\3\2\2\2\u0139\u0120\3\2\2\2\u0139\u0125\3\2\2\2\u0139"+
		"\u012a\3\2\2\2\u0139\u0130\3\2\2\2\u0139\u0134\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\35\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\32!\'8KP]jp{~\u008c\u0095\u0097\u00af\u00b6\u00b9\u00cc\u00e0"+
		"\u00e4\u00eb\u00fe\u010f\u0139\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}