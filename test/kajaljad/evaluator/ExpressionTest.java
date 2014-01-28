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

    @Test
    public void forEvaluatingExpression() throws Exception {
        Expression twoPlusThree = e(e(3), e(2), plus());
        Expression multiplyByFour = e(twoPlusThree, e(4), multiply());
        Expression threeMultiplyByTwo = e(e(3), e(2), multiply());
        Expression expression = e(multiplyByFour, threeMultiplyByTwo, plus());
        assertEquals(26.0, expression.evaluate());
    }

    @Test
    public void forEvaluatingExpressionWithBrackets() throws Exception {
        Expression twoPlusFour = e(e(4), e(2), plus());
        Expression divideByThree = e(twoPlusFour, e(3), divide());
        Expression expression = e(twoPlusFour, divideByThree, plus());
        assertEquals(6.5, expression.evaluate());
    }

    @Test
    public void forEvaluatingExpressionWithExponent() throws Exception {
        Expression twoPlusThree = e(e(2), e(3), plus());
        Expression expression = e(e(2),twoPlusThree, exponent());
        assertEquals(25d, expression.evaluate());
    }

    public static Expression e(double n) {
        return new Expression(n);
    }

    public static Expression e(Expression l, Expression r, Operator o) {
        return new Expression(r, l, o);
    }

    public static Operator plus() {
        return new Addition();
    }

    public static Operator multiply() {
        return new Multiplication();
    }

    public static Operator divide() {
        return new Division();
    }

    public static Operator exponent() {
        return new Exponent();
    }
}
