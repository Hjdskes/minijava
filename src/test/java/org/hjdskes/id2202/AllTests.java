package org.hjdskes.id2202;

import org.hjdskes.id2202.ast.IdentifierTest;
import org.hjdskes.id2202.ast.ListTest;
import org.hjdskes.id2202.ast.ProgramTest;
import org.hjdskes.id2202.ast.classes.FormalTest;
import org.hjdskes.id2202.ast.classes.MainClassTest;
import org.hjdskes.id2202.ast.classes.MethodDeclTest;
import org.hjdskes.id2202.ast.classes.VarDeclTest;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclExtendsTest;
import org.hjdskes.id2202.ast.classes.impl.ClassDeclSimpleTest;
import org.hjdskes.id2202.ast.expression.impl.ArrayLengthTest;
import org.hjdskes.id2202.ast.expression.impl.ArrayLookupTest;
import org.hjdskes.id2202.ast.expression.impl.BinOpExpTest;
import org.hjdskes.id2202.ast.expression.impl.CallTest;
import org.hjdskes.id2202.ast.expression.impl.FalseTest;
import org.hjdskes.id2202.ast.expression.impl.IdentifierExprTest;
import org.hjdskes.id2202.ast.expression.impl.IntegerLiteralTest;
import org.hjdskes.id2202.ast.expression.impl.NewArrayTest;
import org.hjdskes.id2202.ast.expression.impl.NewObjectTest;
import org.hjdskes.id2202.ast.expression.impl.ThisTest;
import org.hjdskes.id2202.ast.expression.impl.TrueTest;
import org.hjdskes.id2202.ast.expression.impl.UnOpExpTest;
import org.hjdskes.id2202.ast.statement.impl.ArrayAssignTest;
import org.hjdskes.id2202.ast.statement.impl.AssignTest;
import org.hjdskes.id2202.ast.statement.impl.BlockTest;
import org.hjdskes.id2202.ast.statement.impl.IfTest;
import org.hjdskes.id2202.ast.statement.impl.PrintTest;
import org.hjdskes.id2202.ast.statement.impl.WhileTest;
import org.hjdskes.id2202.ast.type.impl.BooleanTypeTest;
import org.hjdskes.id2202.ast.type.impl.IdentifierTypeTest;
import org.hjdskes.id2202.ast.type.impl.IntArrayTypeTest;
import org.hjdskes.id2202.ast.type.impl.IntegerTypeTest;
import org.hjdskes.id2202.parser.MiniJavaLexerTest;
import org.hjdskes.id2202.parser.MiniJavaParserTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Driver to easily run all the tests.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        /* AST */
        ClassDeclExtendsTest.class,
        ClassDeclSimpleTest.class,
        FormalTest.class,
        MainClassTest.class,
        MethodDeclTest.class,
        VarDeclTest.class,

        ArrayLengthTest.class,
        ArrayLookupTest.class,
        BinOpExpTest.class,
        CallTest.class,
        FalseTest.class,
        IdentifierExprTest.class,
        IntegerLiteralTest.class,
        NewArrayTest.class,
        NewObjectTest.class,
        ThisTest.class,
        TrueTest.class,
        UnOpExpTest.class,

        ArrayAssignTest.class,
        AssignTest.class,
        BlockTest.class,
        IfTest.class,
        PrintTest.class,
        WhileTest.class,

        BooleanTypeTest.class,
        IdentifierTypeTest.class,
        IntArrayTypeTest.class,
        IntegerTypeTest.class,

        IdentifierTest.class,
        ListTest.class,
        ProgramTest.class,

        /* Parser */
        MiniJavaLexerTest.class,
        MiniJavaParserTest.class,
})
public class AllTests {
}
