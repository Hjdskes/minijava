package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.classes.Formal;
import org.hjdskes.id2202.ast.classes.MainClass;
import org.hjdskes.id2202.ast.classes.MethodDecl;
import org.hjdskes.id2202.ast.classes.VarDecl;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclExtends;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclSimple;
import org.hjdskes.id2202.ast.expression.impl.ArrayLength;
import org.hjdskes.id2202.ast.expression.impl.ArrayLookup;
import org.hjdskes.id2202.ast.expression.impl.Call;
import org.hjdskes.id2202.ast.expression.impl.False;
import org.hjdskes.id2202.ast.expression.impl.IdentifierExpr;
import org.hjdskes.id2202.ast.expression.impl.IntegerLiteral;
import org.hjdskes.id2202.ast.expression.impl.NewArray;
import org.hjdskes.id2202.ast.expression.impl.NewObject;
import org.hjdskes.id2202.ast.expression.impl.UnOpExp;
import org.hjdskes.id2202.ast.expression.impl.BinOpExp;
import org.hjdskes.id2202.ast.expression.impl.This;
import org.hjdskes.id2202.ast.expression.impl.True;
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

/**
 * The {@link Visitor} interface defines the visitor part of the Visitor design pattern.
 */
public interface Visitor {
// CHECKSTYLE.OFF: JavadocMethod
    void visit(Program program);

    /* Classes */
    void visit(MainClass mainClass);
    void visit(ClassDeclSimple classDecl);
    void visit(ClassDeclExtends classDecl);
    void visit(VarDecl varDecl);
    void visit(MethodDecl methodDecl);
    void visit(Formal formal);

    /* Types */
    void visit(BooleanType type);
    void visit(IdentifierType type);
    void visit(IntArrayType type);
    void visit(IntegerType type);

    /* Statements */
    void visit(ArrayAssign arrayAsign);
    void visit(Assign assign);
    void visit(Block block);
    void visit(If i);
    void visit(Print print);
    void visit(While w);

    /* Expressions */
    void visit(ArrayLength arrayLength);
    void visit(ArrayLookup arrayLookup);
    void visit(BinOpExp binop);
    void visit(Call call);
    void visit(False f);
    void visit(IdentifierExpr identifier);
    void visit(IntegerLiteral integer);
    void visit(NewArray newArray);
    void visit(NewObject newObject);
    void visit(This t);
    void visit(True t);
    void visit(UnOpExp unop);

    /* Misc */
    void visit(Identifier identifier);
// CHECKSTYLE.ON: JavadocMethod
}
