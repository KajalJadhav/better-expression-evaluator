package kajaljad.evaluator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void testMultiplication() {
        Operator multiplication = new Multiplication();
        double result;
        result = multiplication.operate(new Expression(2d), new Expression(3d));
        assertEquals(6d, result);
    }
}
