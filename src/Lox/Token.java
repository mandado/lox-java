package Lox;

import java.text.MessageFormat;

public class Token {
    public final TokenType type;
    public final String lexeme;
    public final Object literal;
    public final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return MessageFormat.format("Token( type: {0} - lexeme: {1} - literal: {2}", type, lexeme, literal);
    }
}
