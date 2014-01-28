package kajaljad.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SubtractionTest {
    @Test
    public void testSubtraction() {
        Operator subtraction = new Subtraction();
        double result;
        result =subtraction.operate(new Expression(3d), new Expression(3d));
        assertEquals(0d, result);
    }
}
