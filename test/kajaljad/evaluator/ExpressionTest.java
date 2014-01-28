package kajaljad.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void forEvaluatingAdditionOfTwoNumbers() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new Addition());
        assertEquals(5d, expression.evaluate());
    }

    @Test
    public void forEvaluatingSubtractionOfTwoNumbers() throws Exception {
        Expression expression = new Expression(new Expression(3d), new Expression(3d), new Subtraction());
        assertEquals(0d, expression.evaluate());
    }

    @Test
    public void forEvaluatingMultiplicationOfTwoNumbers() throws Exception {
        Expression expression = new Expression(new Expression(3d), new Expression(3d), new Multiplication());
        assertEquals(9d, expression.evaluate());
    }

    @Test
    public void forEvaluatingDivisionOfTwoNumbers() throws Exception {
        Expression expression = new Expression(new Expression(3d), new Expression(3d), new Division());
        assertEquals(1d, expression.evaluate());
    }

    @Test
    public void forEvaluatingExponentOfANumber() throws Exception {
        Expression expression = new Expression(new Expression(10d), new Expression(2d), new Exponent());
        assertEquals(100d, expression.evaluate());
    }
}
