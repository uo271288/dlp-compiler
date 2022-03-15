package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public interface Visitor<ReturnType, ParamType> {

    ReturnType visit(Program program, ParamType param);
    ReturnType visit(FunctionDefinition funcDef, ParamType param);
    ReturnType visit(VariableDefinition varDef, ParamType param);

    ReturnType visit(Assignment assignment, ParamType param);
    ReturnType visit(Conditional conditional, ParamType param);
    ReturnType visit(In in, ParamType param);
    ReturnType visit(Puts puts, ParamType param);
    ReturnType visit(Return aReturn, ParamType param);
    ReturnType visit(While aWhile, ParamType param);

    ReturnType visit(Arithmetic arithmetic, ParamType param);
    ReturnType visit(ArrayAccess arrayAccess, ParamType param);
    ReturnType visit(Cast cast, ParamType param);
    ReturnType visit(Comparison comparison, ParamType param);
    ReturnType visit(FieldAccess fieldAccess, ParamType param);
    ReturnType visit(FunctionInvocation functionInvocation, ParamType param);
    ReturnType visit(Logical logical, ParamType param);
    ReturnType visit(Not not, ParamType param);
    ReturnType visit(UnaryMinus unaryMinus, ParamType param);
    ReturnType visit(Variable variable, ParamType param);

    ReturnType visit(CharLiteral charLiteral, ParamType param);
    ReturnType visit(IntLiteral intLiteral, ParamType param);
    ReturnType visit(RealLiteral realLiteral, ParamType param);

    ReturnType visit(ArrayType arrayType, ParamType param);
    ReturnType visit(CharType charType, ParamType param);
    ReturnType visit(FunctionType functionType, ParamType param);
    ReturnType visit(IntType intType, ParamType param);
    ReturnType visit(RealType realType, ParamType param);
    ReturnType visit(StructType structType, ParamType param);
    ReturnType visit(VoidType voidType, ParamType param);

    ReturnType visit(StructField structField, ParamType param);
}
