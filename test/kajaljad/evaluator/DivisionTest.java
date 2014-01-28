package kajaljad.evaluator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DivisionTest {
    @Test
    public void testDivision() {
        Operator division = new Division();
        double result;
        result = division.operate(new Expression(10d), new Expression(2d));
        assertEquals(5d, result);
    }
}

