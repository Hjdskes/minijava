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
import org.hjdskes.id2202.ast.expression.impl.This;
import org.hjdskes.id2202.ast.expression.impl.True;
import org.hjdskes.id2202.ast.expression.impl.UnOpExp;
import org.hjdskes.id2202.ast.statement.impl.ArrayAssign;
import org.hjdskes.id2202.ast.statement.impl.Assign;
import org.hjdskes.id2202.ast.statement.impl.Block;
import org.hjdskes.id2202.ast.statement.impl.If;
import org.hjdskes.id2202.ast.statement.impl.Print;
import org.hjdskes.id2202.ast.statement.impl.While;
import org.hjdskes.id2202.ast.type.impl.BooleanType;
import org.hjdskes.id2202.ast.type.impl.IdentifierType;
import org.hjdskes.id2202.ast.type.impl.IntArrayType;
import org.hjdskes.id2202.ast.type.impl.IntegerType;
import org.hjdskes.id2202.ast.type.impl.VoidType;

/**
 * The {@link Visitor<T>} interface defines the visitor part of the visitor design pattern.
 *
 * Using Java generics, the implementing class can return any type.
 * @param <T> The type to return.
 */
public interface Visitor<T> {
// CHECKSTYLE.OFF: JavadocMethod
    T visit(Program program);

    /* Classes */
    T visit(MainClass mainClass);
    T visit(ClassDeclSimple classDecl);
    T visit(ClassDeclExtends classDecl);
    T visit(VarDecl varDecl);
    T visit(MethodDecl methodDecl);
    T visit(Formal formal);

    /* Types */
    T visit(BooleanType type);
    T visit(IdentifierType type);
    T visit(IntArrayType type);
    T visit(IntegerType type);
    T visit(VoidType type);

    /* Statements */
    T visit(ArrayAssign arrayAsign);
    T visit(Assign assign);
    T visit(Block block);
    T visit(If i);
    T visit(Print print);
    T visit(While w);

    /* Expressions */
    T visit(ArrayLength arrayLength);
    T visit(ArrayLookup arrayLookup);
    T visit(BinOpExp binop);
    T visit(Call call);
    T visit(False f);
    T visit(IdentifierExpr identifier);
    T visit(IntegerLiteral integer);
    T visit(NewArray newArray);
    T visit(NewObject newObject);
    T visit(This t);
    T visit(True t);
    T visit(UnOpExp unop);

    /* Misc */
    T visit(Identifier identifier);
// CHECKSTYLE.ON: JavadocMethod
}
