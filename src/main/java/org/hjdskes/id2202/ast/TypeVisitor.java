package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.classes.Formal;
import org.hjdskes.id2202.ast.classes.MainClass;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclExtends;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclSimple;
import org.hjdskes.id2202.ast.expression.impl.ArrayLength;
import org.hjdskes.id2202.ast.expression.impl.ArrayLookup;
import org.hjdskes.id2202.ast.expression.impl.BinOpExp;
import org.hjdskes.id2202.ast.expression.impl.Call;
import org.hjdskes.id2202.ast.expression.impl.False;
import org.hjdskes.id2202.ast.expression.impl.IdentifierExpr;
import org.hjdskes.id2202.ast.expression.impl.IntegerLiteral;
import org.hjdskes.id2202.ast.expression.impl.NewArray;
import org.hjdskes.id2202.ast.expression.impl.NewObject;
import org.hjdskes.id2202.ast.expression.impl.UnOpExp;
import org.hjdskes.id2202.ast.expression.impl.This;
import org.hjdskes.id2202.ast.expression.impl.True;
import org.hjdskes.id2202.ast.statement.impl.ArrayAssign;
import org.hjdskes.id2202.ast.statement.impl.Assign;
import org.hjdskes.id2202.ast.statement.impl.Block;
import org.hjdskes.id2202.ast.statement.impl.If;
import org.hjdskes.id2202.ast.statement.impl.Print;
import org.hjdskes.id2202.ast.statement.impl.While;
import org.hjdskes.id2202.ast.type.Type;
import org.hjdskes.id2202.ast.type.impl.BooleanType;
import org.hjdskes.id2202.ast.type.impl.IdentifierType;
import org.hjdskes.id2202.ast.type.impl.IntArrayType;
import org.hjdskes.id2202.ast.type.impl.IntegerType;

/**
 * The {@link TypeVisitor} interface defines the visitor part of the Visitor design pattern.
 */
public interface TypeVisitor {
// CHECKSTYLE.OFF: JavadocMethod
    Type visit(Program program);

    /* Classes */
    Type visit(MainClass mainClass);
    Type visit(ClassDeclSimple classDecl);
    Type visit(ClassDeclExtends classDecl);
    Type visit(VarDecl varDecl);
    Type visit(MethodDecl methodDecl);
    Type visit(Formal formal);

    /* Types */
    Type visit(BooleanType type);
    Type visit(IdentifierType type);
    Type visit(IntArrayType type);
    Type visit(IntegerType type);

    /* Statements */
    Type visit(ArrayAssign arrayAsign);
    Type visit(Assign assign);
    Type visit(Block block);
    Type visit(If i);
    Type visit(Print print);
    Type visit(While w);

    /* Expressions */
    Type visit(ArrayLength arrayLength);
    Type visit(ArrayLookup arrayLookup);
    Type visit(BinOpExp binop);
    Type visit(Call call);
    Type visit(False f);
    Type visit(IdentifierExpr identifier);
    Type visit(IntegerLiteral integer);
    Type visit(NewArray newArray);
    Type visit(NewObject newObject);
    Type visit(This t);
    Type visit(True t);
    Type visit(UnOpExp unop);

    /* Misc */
    Type visit(Identifier identifier);
// CHECKSTYLE.ON: JavadocMethod
}
