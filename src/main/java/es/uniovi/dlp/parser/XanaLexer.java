// Generated from Xana.g4 by ANTLR 4.9.3

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.expressions.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaLexer extends Lexer {
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
		T__38=39, T__39=40, INT_CONSTANT=41, REAL_CONSTANT=42, CHAR_CONSTANT=43, 
		BOOLEAN_CONSTANT=44, ID=45, SIMPLE_COMMENT=46, MULTILINE_COMMENT=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "NUM", 
			"DECIMAL", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "BOOLEAN_CONSTANT", 
			"ID", "SIMPLE_COMMENT", "MULTILINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "','", "'['", "']'", "'defstruct do'", "'end'", "'int'", 
			"'double'", "'char'", "'boolean'", "'def'", "'('", "')'", "'do'", "'void'", 
			"'main'", "'if'", "':'", "'else'", "'puts'", "'in'", "'while'", "'return'", 
			"'='", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"BOOLEAN_CONSTANT", "ID", "SIMPLE_COMMENT", "MULTILINE_COMMENT", "WS"
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


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0155\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+"+
		"\3+\3+\3+\7+\u00fe\n+\f+\16+\u0101\13+\5+\u0103\n+\3,\6,\u0106\n,\r,\16"+
		",\u0107\3-\3-\3-\5-\u010d\n-\3-\3-\5-\u0111\n-\3-\3-\5-\u0115\n-\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u011f\n.\3.\5.\u0122\n.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u012d\n/\3\60\3\60\7\60\u0131\n\60\f\60\16\60\u0134\13\60\3\61"+
		"\3\61\7\61\u0138\n\61\f\61\16\61\u013b\13\61\3\61\5\61\u013e\n\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\7\62\u0147\n\62\f\62\16\62\u014a\13\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\4\u0139\u0148\2\64"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y,[-]._/a\60c\61e\62\3\2\n\3\2\62;\4\2"+
		"GGgg\4\2--//\5\2ppttvv\5\2C\\aac|\6\2\62;C\\aac|\4\3\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\2\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\tn\3\2\2\2"+
		"\13p\3\2\2\2\r}\3\2\2\2\17\u0081\3\2\2\2\21\u0085\3\2\2\2\23\u008c\3\2"+
		"\2\2\25\u0091\3\2\2\2\27\u0099\3\2\2\2\31\u009d\3\2\2\2\33\u009f\3\2\2"+
		"\2\35\u00a1\3\2\2\2\37\u00a4\3\2\2\2!\u00a9\3\2\2\2#\u00ae\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00b3\3\2\2\2)\u00b8\3\2\2\2+\u00bd\3\2\2\2-\u00c0\3\2\2\2"+
		"/\u00c6\3\2\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67"+
		"\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2?\u00dc\3\2"+
		"\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E\u00e2\3\2\2\2G\u00e5\3\2\2\2I\u00e7"+
		"\3\2\2\2K\u00ea\3\2\2\2M\u00ed\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2\2\2S"+
		"\u00f6\3\2\2\2U\u0102\3\2\2\2W\u0105\3\2\2\2Y\u0114\3\2\2\2[\u0121\3\2"+
		"\2\2]\u012c\3\2\2\2_\u012e\3\2\2\2a\u0135\3\2\2\2c\u0141\3\2\2\2e\u0151"+
		"\3\2\2\2gh\7<\2\2hi\7<\2\2i\4\3\2\2\2jk\7.\2\2k\6\3\2\2\2lm\7]\2\2m\b"+
		"\3\2\2\2no\7_\2\2o\n\3\2\2\2pq\7f\2\2qr\7g\2\2rs\7h\2\2st\7u\2\2tu\7v"+
		"\2\2uv\7t\2\2vw\7w\2\2wx\7e\2\2xy\7v\2\2yz\7\"\2\2z{\7f\2\2{|\7q\2\2|"+
		"\f\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\16\3\2\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\20\3\2\2\2\u0085"+
		"\u0086\7f\2\2\u0086\u0087\7q\2\2\u0087\u0088\7w\2\2\u0088\u0089\7d\2\2"+
		"\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\22\3\2\2\2\u008c\u008d\7"+
		"e\2\2\u008d\u008e\7j\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090\24"+
		"\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2"+
		"\u0098\26\3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b\7g\2\2\u009b\u009c\7"+
		"h\2\2\u009c\30\3\2\2\2\u009d\u009e\7*\2\2\u009e\32\3\2\2\2\u009f\u00a0"+
		"\7+\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7q\2\2\u00a3\36"+
		"\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7f\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2&\3\2\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"(\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc*\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\62\3\2\2"+
		"\2\u00cf\u00d0\7\60\2\2\u00d0\64\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7/\2\2\u00d58\3\2\2\2\u00d6\u00d7"+
		"\7#\2\2\u00d7:\3\2\2\2\u00d8\u00d9\7,\2\2\u00d9<\3\2\2\2\u00da\u00db\7"+
		"\61\2\2\u00db>\3\2\2\2\u00dc\u00dd\7\'\2\2\u00dd@\3\2\2\2\u00de\u00df"+
		"\7-\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7"+
		"@\2\2\u00e3\u00e4\7?\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6H\3\2"+
		"\2\2\u00e7\u00e8\7>\2\2\u00e8\u00e9\7?\2\2\u00e9J\3\2\2\2\u00ea\u00eb"+
		"\7#\2\2\u00eb\u00ec\7?\2\2\u00ecL\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\u00ef"+
		"\7?\2\2\u00efN\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7(\2\2\u00f2P\3"+
		"\2\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f5\7~\2\2\u00f5R\3\2\2\2\u00f6\u00f7"+
		"\t\2\2\2\u00f7T\3\2\2\2\u00f8\u00f9\7\60\2\2\u00f9\u0103\5W,\2\u00fa\u00fb"+
		"\5W,\2\u00fb\u00ff\7\60\2\2\u00fc\u00fe\5S*\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00fa\3\2\2\2\u0103"+
		"V\3\2\2\2\u0104\u0106\5S*\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108X\3\2\2\2\u0109\u0115\5U+\2\u010a"+
		"\u010d\5U+\2\u010b\u010d\5W,\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u0110\t\3\2\2\u010f\u0111\t\4\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5W,\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u010c\3\2\2\2\u0115Z\3\2\2\2"+
		"\u0116\u0117\7)\2\2\u0117\u0118\13\2\2\2\u0118\u0122\7)\2\2\u0119\u011a"+
		"\7)\2\2\u011a\u011b\7^\2\2\u011b\u011e\3\2\2\2\u011c\u011f\5W,\2\u011d"+
		"\u011f\t\5\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\7)\2\2\u0121\u0116\3\2\2\2\u0121\u0119\3\2\2\2\u0122"+
		"\\\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126\7w\2\2\u0126"+
		"\u012d\7g\2\2\u0127\u0128\7h\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2"+
		"\u012a\u012b\7u\2\2\u012b\u012d\7g\2\2\u012c\u0123\3\2\2\2\u012c\u0127"+
		"\3\2\2\2\u012d^\3\2\2\2\u012e\u0132\t\6\2\2\u012f\u0131\t\7\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133`\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\7%\2\2\u0136\u0138"+
		"\13\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e"+
		"\t\b\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\61\2\2"+
		"\u0140b\3\2\2\2\u0141\u0142\7$\2\2\u0142\u0143\7$\2\2\u0143\u0144\7$\2"+
		"\2\u0144\u0148\3\2\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7$\2\2\u014c\u014d\7$\2\2\u014d\u014e"+
		"\7$\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b\62\2\2\u0150d\3\2\2\2\u0151"+
		"\u0152\t\t\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\63\2\2\u0154f\3\2\2\2"+
		"\20\2\u00ff\u0102\u0107\u010c\u0110\u0114\u011e\u0121\u012c\u0132\u0139"+
		"\u013d\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}