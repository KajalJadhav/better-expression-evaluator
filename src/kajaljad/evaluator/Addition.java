package kajaljad.evaluator;

public class Addition implements Operator{
    @Override
    public double operate(Expression left,Expression right){
        return left.evaluate() + right.evaluate();
    }
}
