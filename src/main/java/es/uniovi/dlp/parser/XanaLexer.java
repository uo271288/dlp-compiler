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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\6\3\37\n\3\r\3\16\3 \3\3\3\3\7\3%"+
		"\n\3\f\3\16\3(\13\3\5\3*\n\3\3\4\6\4-\n\4\r\4\16\4.\3\5\3\5\3\5\6\5\64"+
		"\n\5\r\5\16\5\65\5\58\n\5\3\5\3\5\5\5<\n\5\3\5\6\5?\n\5\r\5\16\5@\5\5"+
		"C\n\5\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7"+
		"S\n\7\r\7\16\7T\3\7\5\7X\n\7\3\7\5\7[\n\7\3\b\3\b\7\b_\n\b\f\b\16\bb\13"+
		"\b\3\b\5\be\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\4`o\2\13\3\2\5\2\7\3\t\4\13\5\r"+
		"\6\17\7\21\b\23\t\3\2\n\3\2\62;\4\2GGgg\4\2--//\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2ppttvv\4\3\f\f\17\17\5\2\13\f\17\17\"\"\u0089\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\3\25\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rZ\3\2\2"+
		"\2\17\\\3\2\2\2\21h\3\2\2\2\23x\3\2\2\2\25\26\t\2\2\2\26\4\3\2\2\2\27"+
		"\31\7\60\2\2\30\32\5\3\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34*\3\2\2\2\35\37\5\3\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3"+
		"\2\2\2 !\3\2\2\2!\"\3\2\2\2\"&\7\60\2\2#%\5\3\2\2$#\3\2\2\2%(\3\2\2\2"+
		"&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)\27\3\2\2\2)\36\3\2\2\2*\6"+
		"\3\2\2\2+-\5\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\b\3\2\2\2"+
		"\60C\5\5\3\2\618\5\5\3\2\62\64\5\3\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\61\3\2\2\2\67\63\3\2\2\289\3"+
		"\2\2\29;\t\3\2\2:<\t\4\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\3\2\2>=\3"+
		"\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B\60\3\2\2\2B\67\3\2\2\2"+
		"C\n\3\2\2\2DH\t\5\2\2EG\t\6\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2"+
		"\2I\f\3\2\2\2JH\3\2\2\2KL\7)\2\2LM\13\2\2\2M[\7)\2\2NO\7)\2\2OP\7^\2\2"+
		"PW\3\2\2\2QS\5\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2"+
		"VX\t\7\2\2WR\3\2\2\2WV\3\2\2\2XY\3\2\2\2Y[\7)\2\2ZK\3\2\2\2ZN\3\2\2\2"+
		"[\16\3\2\2\2\\`\7%\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2ce\t\b\2\2dc\3\2\2\2ef\3\2\2\2fg\b\b\2\2g\20\3"+
		"\2\2\2hi\7$\2\2ij\7$\2\2jk\7$\2\2ko\3\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2"+
		"\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7$\2\2st\7$\2\2tu\7$\2"+
		"\2uv\3\2\2\2vw\b\t\2\2w\22\3\2\2\2xy\t\t\2\2yz\3\2\2\2z{\b\n\2\2{\24\3"+
		"\2\2\2\24\2\33 &).\65\67;@BHTWZ`do\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}