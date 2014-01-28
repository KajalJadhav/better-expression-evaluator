package kajaljad.evaluator;

public class Multiplication implements Operator{
    @Override
    public double operate(Expression left,Expression right){
        return left.evaluate() * right.evaluate();
    }
}
