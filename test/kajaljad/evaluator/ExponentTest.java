package kajaljad.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExponentTest {
    @Test
    public void testExponent() {
        Operator exponent = new Exponent();
        double result;
        result = exponent.operate(new Expression(10d), new Expression(2d));
        assertEquals(100d, result);
    }
}
