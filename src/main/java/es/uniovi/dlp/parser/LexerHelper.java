package es.uniovi.dlp.parser;

public class LexerHelper {
    public static int lexemeToInt(String lexeme) {
        try {
            return Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static double lexemeToReal(String lexeme) {
        try {
            return Double.parseDouble(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static char lexemeToChar(String lexeme) {
        if (lexeme.charAt(1) == '\\') {
            switch (lexeme.charAt(2)) {
                case 't':
                    return '\t';
                case 'r':
                    return '\r';
                case 'n':
                    return '\n';
            }
            return (char) Integer.parseInt(lexeme.substring(2, lexeme.length() - 1));
        } else
            return lexeme.charAt(1);
    }

    public static int lexemeToBoolean(String lexeme) {
        try {
            return Boolean.parseBoolean(lexeme) ? 1 : 0;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }
}