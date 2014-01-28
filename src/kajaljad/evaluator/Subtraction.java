package kajaljad.evaluator;

public class Subtraction implements Operator{
    @Override
    public double operate(Expression left,Expression right){
        return left.evaluate() - right.evaluate();
    }
}
