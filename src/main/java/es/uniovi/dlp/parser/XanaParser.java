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
				varDef();
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
					funcDef();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(40);
			mainFunc();
			setState(41);
			match(EOF);
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
			setState(43);
			varIDs();
			setState(44);
			match(T__0);
			setState(45);
			type();
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
			setState(47);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(48);
				match(T__1);
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				simpleType();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__2);
				setState(57);
				match(INT_CONSTANT);
				setState(58);
				match(T__0);
				setState(59);
				type();
				setState(60);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(63);
					recordFields();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(T__5);
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
			setState(72);
			varIDs();
			setState(73);
			match(T__0);
			setState(74);
			type();
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__6);
				((SimpleTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__7);
				((SimpleTypeContext)_localctx).ast =  new RealType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
			setState(84);
			match(T__9);
			setState(85);
			match(ID);
			setState(86);
			match(T__10);
			setState(87);
			paramList();
			setState(88);
			match(T__11);
			setState(89);
			match(T__0);
			setState(90);
			returnType();
			setState(91);
			match(T__12);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					varDef();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(98);
				statement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__5);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				param();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(107);
					match(T__1);
					setState(108);
					param();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
			setState(116);
			match(ID);
			setState(117);
			match(T__0);
			setState(118);
			simpleType();
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__13);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				simpleType();
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
			setState(124);
			match(T__9);
			setState(125);
			match(T__14);
			setState(126);
			match(T__10);
			setState(127);
			match(T__11);
			setState(128);
			match(T__12);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(129);
					varDef();
					}
					break;
				case 2:
					{
					setState(130);
					statement();
					}
					break;
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__5);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__15);
				setState(139);
				expr(0);
				setState(140);
				match(T__1);
				setState(141);
				match(T__12);
				setState(142);
				match(T__16);
				setState(143);
				statement();
				setState(144);
				match(T__1);
				setState(145);
				match(T__17);
				setState(146);
				match(T__16);
				setState(147);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__15);
				setState(150);
				expr(0);
				setState(151);
				match(T__12);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(152);
					statement();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(158);
					match(T__17);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(159);
						statement();
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(167);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__18);
				setState(170);
				exprs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				match(T__19);
				setState(172);
				exprs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(T__20);
				setState(174);
				expr(0);
				setState(175);
				match(T__12);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(176);
					statement();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(T__21);
				setState(185);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				expr(0);
				setState(187);
				match(T__22);
				setState(188);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(ID);
				setState(191);
				match(T__10);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(192);
					exprs();
					}
				}

				setState(195);
				match(T__11);
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
			setState(198);
			((ExprsContext)_localctx).expr = expr(0);
			((ExprsContext)_localctx).list.add(((ExprsContext)_localctx).expr);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(T__1);
					setState(200);
					((ExprsContext)_localctx).expr = expr(0);
					((ExprsContext)_localctx).list.add(((ExprsContext)_localctx).expr);
					}
					} 
				}
				setState(205);
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
		public ExprContext array;
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(209);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExprContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 2:
				{
				setState(211);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExprContext)_localctx).ast =  new RealLiteral(LexerHelper.lexemeToReal((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 3:
				{
				setState(213);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExprContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null)), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 4:
				{
				setState(215);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).ast =  new Variable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 5:
				{
				setState(217);
				((ExprContext)_localctx).ID = match(ID);
				setState(218);
				match(T__10);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__25) | (1L << T__26) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					setState(219);
					((ExprContext)_localctx).exprs = exprs();
					}
				}

				setState(222);
				match(T__11);
				((ExprContext)_localctx).ast =  new FunctionInvocation((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), ((ExprContext)_localctx).exprs.astList, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 6:
				{
				setState(224);
				match(T__10);
				setState(225);
				((ExprContext)_localctx).expr = expr(0);
				setState(226);
				match(T__11);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 7:
				{
				setState(229);
				match(T__25);
				setState(230);
				((ExprContext)_localctx).expr = expr(7);
				((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).expr.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			case 8:
				{
				setState(233);
				match(T__26);
				setState(234);
				((ExprContext)_localctx).expr = expr(6);
				((ExprContext)_localctx).ast =  new Not(((ExprContext)_localctx).expr.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
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
						setState(241);
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
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
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
						setState(246);
						((ExprContext)_localctx).rightExpr = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).ast =  new Arithmetic(((ExprContext)_localctx).leftExpr.ast, ((ExprContext)_localctx).rightExpr.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.leftExpr = _prevctx;
						_localctx.leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(250);
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
						setState(251);
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
						setState(254);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(255);
						((ExprContext)_localctx).op = match(T__37);
						setState(256);
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
						setState(259);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(260);
						((ExprContext)_localctx).op = match(T__38);
						setState(261);
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
						setState(264);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(265);
						match(T__2);
						setState(266);
						((ExprContext)_localctx).index = ((ExprContext)_localctx).expr = expr(0);
						setState(267);
						match(T__3);
						((ExprContext)_localctx).ast =  new ArrayAccess(((ExprContext)_localctx).array.ast, ((ExprContext)_localctx).index.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(271);
						match(T__23);
						setState(272);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).ast =  new FieldAccess(((ExprContext)_localctx).expr.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(275);
						match(T__24);
						setState(276);
						((ExprContext)_localctx).simpleType = simpleType();
						((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).expr.ast, ((ExprContext)_localctx).simpleType.ast, _localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1);
						}
						break;
					}
					} 
				}
				setState(283);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5"+
		"\f\5\16\5F\13\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7U\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3"+
		"\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t"+
		"\5\tu\n\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r"+
		"\3\r\3\r\7\r\u00a3\n\r\f\r\16\r\u00a6\13\r\5\r\u00a8\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r\16\r\u00b7\13\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c4\n\r\3\r\5\r\u00c7\n\r\3\16"+
		"\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00f0\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u011a\n\17\f\17\16\17\u011d\13\17\3\17\2\3\34\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\5\3\2\36 \4\2\34\34!!\3\2\"\'\2\u013c\2!"+
		"\3\2\2\2\4-\3\2\2\2\6\61\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fT\3\2\2\2\16V"+
		"\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24|\3\2\2\2\26~\3\2\2\2\30\u00c6\3\2"+
		"\2\2\32\u00c8\3\2\2\2\34\u00ef\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2"+
		"\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!\3\2\2\2$&\5\16\b\2%$\3\2\2\2"+
		"&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\26\f\2+,\7\2"+
		"\2\3,\3\3\2\2\2-.\5\6\4\2./\7\3\2\2/\60\5\b\5\2\60\5\3\2\2\2\61\66\7-"+
		"\2\2\62\63\7\4\2\2\63\65\7-\2\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2"+
		"\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2\29I\5\f\7\2:;\7\5\2\2;<\7*\2\2"+
		"<=\7\3\2\2=>\5\b\5\2>?\7\6\2\2?I\3\2\2\2@D\7\7\2\2AC\5\n\6\2BA\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GI\7\b\2\2H9\3\2\2\2"+
		"H:\3\2\2\2H@\3\2\2\2I\t\3\2\2\2JK\5\6\4\2KL\7\3\2\2LM\5\b\5\2M\13\3\2"+
		"\2\2NO\7\t\2\2OU\b\7\1\2PQ\7\n\2\2QU\b\7\1\2RS\7\13\2\2SU\b\7\1\2TN\3"+
		"\2\2\2TP\3\2\2\2TR\3\2\2\2U\r\3\2\2\2VW\7\f\2\2WX\7-\2\2XY\7\r\2\2YZ\5"+
		"\20\t\2Z[\7\16\2\2[\\\7\3\2\2\\]\5\24\13\2]a\7\17\2\2^`\5\4\3\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\5\30\r\2ed\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\b\2\2k\17"+
		"\3\2\2\2lq\5\22\n\2mn\7\4\2\2np\5\22\n\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vw\7-\2"+
		"\2wx\7\3\2\2xy\5\f\7\2y\23\3\2\2\2z}\7\20\2\2{}\5\f\7\2|z\3\2\2\2|{\3"+
		"\2\2\2}\25\3\2\2\2~\177\7\f\2\2\177\u0080\7\21\2\2\u0080\u0081\7\r\2\2"+
		"\u0081\u0082\7\16\2\2\u0082\u0087\7\17\2\2\u0083\u0086\5\4\3\2\u0084\u0086"+
		"\5\30\r\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\7\b\2\2\u008b\27\3\2\2\2\u008c\u008d\7\22\2\2\u008d"+
		"\u008e\5\34\17\2\u008e\u008f\7\4\2\2\u008f\u0090\7\17\2\2\u0090\u0091"+
		"\7\23\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7\4\2\2\u0093\u0094\7\24\2"+
		"\2\u0094\u0095\7\23\2\2\u0095\u0096\5\30\r\2\u0096\u00c7\3\2\2\2\u0097"+
		"\u0098\7\22\2\2\u0098\u0099\5\34\17\2\u0099\u009d\7\17\2\2\u009a\u009c"+
		"\5\30\r\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u00a7\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a4"+
		"\7\24\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\7\b\2\2\u00aa\u00c7\3\2\2\2\u00ab\u00ac\7\25\2\2\u00ac\u00c7\5"+
		"\32\16\2\u00ad\u00ae\7\26\2\2\u00ae\u00c7\5\32\16\2\u00af\u00b0\7\27\2"+
		"\2\u00b0\u00b1\5\34\17\2\u00b1\u00b5\7\17\2\2\u00b2\u00b4\5\30\r\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\u00c7\3\2\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00c7\5\34\17\2\u00bc\u00bd"+
		"\5\34\17\2\u00bd\u00be\7\31\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c7\3\2"+
		"\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c3\7\r\2\2\u00c2\u00c4\5\32\16\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\16"+
		"\2\2\u00c6\u008c\3\2\2\2\u00c6\u0097\3\2\2\2\u00c6\u00ab\3\2\2\2\u00c6"+
		"\u00ad\3\2\2\2\u00c6\u00af\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c7\31\3\2\2\2\u00c8\u00cd\5\34\17\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\u00cc\5\34\17\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\b\16\1\2\u00d1\33\3\2\2\2\u00d2\u00d3\b\17"+
		"\1\2\u00d3\u00d4\7*\2\2\u00d4\u00f0\b\17\1\2\u00d5\u00d6\7+\2\2\u00d6"+
		"\u00f0\b\17\1\2\u00d7\u00d8\7,\2\2\u00d8\u00f0\b\17\1\2\u00d9\u00da\7"+
		"-\2\2\u00da\u00f0\b\17\1\2\u00db\u00dc\7-\2\2\u00dc\u00de\7\r\2\2\u00dd"+
		"\u00df\5\32\16\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00f0\b\17\1\2\u00e2\u00e3\7\r\2\2\u00e3"+
		"\u00e4\5\34\17\2\u00e4\u00e5\7\16\2\2\u00e5\u00e6\b\17\1\2\u00e6\u00f0"+
		"\3\2\2\2\u00e7\u00e8\7\34\2\2\u00e8\u00e9\5\34\17\t\u00e9\u00ea\b\17\1"+
		"\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\5\34\17\b\u00ed"+
		"\u00ee\b\17\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00d2\3\2\2\2\u00ef\u00d5\3"+
		"\2\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00d9\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef"+
		"\u00e2\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u011b\3\2"+
		"\2\2\u00f1\u00f2\f\7\2\2\u00f2\u00f3\t\2\2\2\u00f3\u00f4\5\34\17\b\u00f4"+
		"\u00f5\b\17\1\2\u00f5\u011a\3\2\2\2\u00f6\u00f7\f\6\2\2\u00f7\u00f8\t"+
		"\3\2\2\u00f8\u00f9\5\34\17\7\u00f9\u00fa\b\17\1\2\u00fa\u011a\3\2\2\2"+
		"\u00fb\u00fc\f\5\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe\5\34\17\6\u00fe\u00ff"+
		"\b\17\1\2\u00ff\u011a\3\2\2\2\u0100\u0101\f\4\2\2\u0101\u0102\7(\2\2\u0102"+
		"\u0103\5\34\17\5\u0103\u0104\b\17\1\2\u0104\u011a\3\2\2\2\u0105\u0106"+
		"\f\3\2\2\u0106\u0107\7)\2\2\u0107\u0108\5\34\17\4\u0108\u0109\b\17\1\2"+
		"\u0109\u011a\3\2\2\2\u010a\u010b\f\f\2\2\u010b\u010c\7\5\2\2\u010c\u010d"+
		"\5\34\17\2\u010d\u010e\7\6\2\2\u010e\u010f\b\17\1\2\u010f\u011a\3\2\2"+
		"\2\u0110\u0111\f\13\2\2\u0111\u0112\7\32\2\2\u0112\u0113\7-\2\2\u0113"+
		"\u011a\b\17\1\2\u0114\u0115\f\n\2\2\u0115\u0116\7\33\2\2\u0116\u0117\5"+
		"\f\7\2\u0117\u0118\b\17\1\2\u0118\u011a\3\2\2\2\u0119\u00f1\3\2\2\2\u0119"+
		"\u00f6\3\2\2\2\u0119\u00fb\3\2\2\2\u0119\u0100\3\2\2\2\u0119\u0105\3\2"+
		"\2\2\u0119\u010a\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0114\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\35\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\32!\'\66DHTagqt|\u0085\u0087\u009d\u00a4\u00a7"+
		"\u00b5\u00c3\u00c6\u00cd\u00de\u00ef\u0119\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}