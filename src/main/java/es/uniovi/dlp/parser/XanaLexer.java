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
		INT_CONSTANT=1, SIMPLE_COMMENT=2, MULTILINE_COMMENT=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'"
	};
	public static final String[] ruleNames = {
		"INT_CONSTANT", "SIMPLE_COMMENT", "MULTILINE_COMMENT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\6-\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r\2\16\2\16\3\3\3\3\7\3\23\n\3\f"+
		"\3\16\3\26\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3 \2\6\3\3\5\4\7\5\t\6\3\2\5"+
		"\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"/\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2\2\5\20\3\2\2\2\7\31\3\2\2\2\t)\3\2\2\2"+
		"\13\r\t\2\2\2\f\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17"+
		"\4\3\2\2\2\20\24\7%\2\2\21\23\n\3\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\b\3\2\2\30\6"+
		"\3\2\2\2\31\32\7$\2\2\32\33\7$\2\2\33\34\7$\2\2\34 \3\2\2\2\35\37\13\2"+
		"\2\2\36\35\3\2\2\2\37\"\3\2\2\2 !\3\2\2\2 \36\3\2\2\2!#\3\2\2\2\" \3\2"+
		"\2\2#$\7$\2\2$%\7$\2\2%&\7$\2\2&\'\3\2\2\2\'(\b\4\2\2(\b\3\2\2\2)*\t\4"+
		"\2\2*+\3\2\2\2+,\b\5\2\2,\n\3\2\2\2\6\2\16\24 \3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}