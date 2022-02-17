// Generated from Xana.g4 by ANTLR 4.3

package es.uniovi.dlp.parser;

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, REAL_CONSTANT=2, ID=3, CHAR_CONSTANT=4, SIMPLE_COMMENT=5, 
		MULTILINE_COMMENT=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"NUM", "DECIMAL", "INT_CONSTANT", "REAL_CONSTANT", "ID", "CHAR_CONSTANT", 
		"SIMPLE_COMMENT", "MULTILINE_COMMENT", "WS"
	};


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\to\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3\7\3%"+
		"\n\3\f\3\16\3(\13\3\5\3*\n\3\3\4\6\4-\n\4\r\4\16\4.\3\5\3\5\3\5\6\5\64"+
		"\n\5\r\5\16\5\65\5\58\n\5\3\5\3\5\5\5<\n\5\3\5\6\5?\n\5\r\5\16\5@\5\5"+
		"C\n\5\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\3\7\3\b\3\b\7\bR\n\b"+
		"\f\b\16\bU\13\b\3\b\5\bX\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\ta\n\t\f\t"+
		"\16\td\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\4Sb\2\13\3\2\5\2\7"+
		"\3\t\4\13\5\r\6\17\7\21\b\23\t\3\2\t\3\2\62;\4\2GGgg\4\2--//\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\4\3\f\f\17\17\5\2\13\f\17\17\"\"y\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\3\25\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rK\3\2\2\2"+
		"\17O\3\2\2\2\21[\3\2\2\2\23k\3\2\2\2\25\26\t\2\2\2\26\4\3\2\2\2\27\31"+
		"\7\60\2\2\30\32\5\3\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34*\3\2\2\2\35\37\5\3\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2"+
		"\2 !\3\2\2\2!\"\3\2\2\2\"&\7\60\2\2#%\5\3\2\2$#\3\2\2\2%(\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)\27\3\2\2\2)\36\3\2\2\2*\6\3\2"+
		"\2\2+-\5\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\b\3\2\2\2\60C"+
		"\5\5\3\2\618\5\5\3\2\62\64\5\3\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\61\3\2\2\2\67\63\3\2\2\289\3\2\2\2"+
		"9;\t\3\2\2:<\t\4\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\3\2\2>=\3\2\2\2"+
		"?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\60\3\2\2\2B\67\3\2\2\2C\n\3"+
		"\2\2\2DH\t\5\2\2EG\t\6\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\f"+
		"\3\2\2\2JH\3\2\2\2KL\7)\2\2LM\13\2\2\2MN\7)\2\2N\16\3\2\2\2OS\7%\2\2P"+
		"R\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"VX\t\7\2\2WV\3\2\2\2XY\3\2\2\2YZ\b\b\2\2Z\20\3\2\2\2[\\\7$\2\2\\]\7$\2"+
		"\2]^\7$\2\2^b\3\2\2\2_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2\2b`\3\2\2"+
		"\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2fg\7$\2\2gh\7$\2\2hi\3\2\2\2ij\b\t\2\2"+
		"j\22\3\2\2\2kl\t\b\2\2lm\3\2\2\2mn\b\n\2\2n\24\3\2\2\2\21\2\33 &).\65"+
		"\67;@BHSWb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}