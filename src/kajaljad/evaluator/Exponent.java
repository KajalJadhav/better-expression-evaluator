package kajaljad.evaluator;

public class Exponent implements Operator {
    @Override
    public double operate(Expression left, Expression right) {
        return Math.pow(left.evaluate(), right.evaluate());
    }
}
