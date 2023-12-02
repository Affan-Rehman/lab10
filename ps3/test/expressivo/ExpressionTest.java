/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import java.beans.Expression;

import org.junit.Test;

import expressivo.Expression.VariableExpression;
import expressivo.Expression.NumericExpression;
/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   TODO
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    @Test
    void testToString() {
        Expression expression = new AdditionExpression(
                new NumericExpression(1),
                new VariableExpression("x")
        );

        assertEquals("(1.0 + x)", expression.toString());
    }

    @Test
    void testEquals() {
        Expression expression1 = new AdditionExpression(
                new NumericExpression(1),
                new VariableExpression("x")
        );

        Expression expression2 = new AdditionExpression(
                new NumericExpression(1),
                new VariableExpression("x")
        );

        assertEquals(expression1, expression2);
    }

    @Test
    void testHashCode() {
        Expression expression1 = new AdditionExpression(
                new NumericExpression(1),
                new VariableExpression("x")
        );

        Expression expression2 = new AdditionExpression(
                new NumericExpression(1),
                new VariableExpression("x")
        );

        assertEquals(expression1.hashCode(), expression2.hashCode());

    }
       @Test
    void testSubtraction() {
        Expression expression = new SubtractionExpression(
                new NumericExpression(5),
                new NumericExpression(3)
        );

        assertEquals("(5.0 - 3.0)", expression.toString());
    }
}
