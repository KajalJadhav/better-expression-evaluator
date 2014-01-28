package kajaljad.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void testAddition() {
        Operator addition = new Addition();
        double result;
        result = addition.operate(new Expression(2d), new Expression(3d));
        assertEquals(5d, result);
    }
}
