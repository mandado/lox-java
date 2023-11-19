#Lox java

this a version java of lox languagem from book https://craftinginterpreters.com/


BNF DIAGRAM


```BNF
program        → declaration* EOF ;

declaration    → varDecl
               | statement ;

statement      → exprStmt
               | printStmt ;

exprStmt       → expression ";" ;

printStmt      → "print" expression ";" ;
varDecl        → "var" IDENTIFIER ( "=" expression )? ";" ;

expression     → primary
               | unary
               | binary
               | grouping ;

equality   → comparison ( ( "!=" | "==" ) comparison )* ;
comparison → term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term       → factor ( ( "-" | "+" ) factor )* ;
factor     → unary ( ( "/" | "*" ) unary )* ;
unary      → ( "!" | "-" | "--" | "++" ) unary
           | postfix ;
postfix    → primary ( "--" | ++" )* ;
primary    → NUMBER | STRING | "true" | "false" | "nil"
           | "(" expression ")"
           | IDENTIFIER ;
```