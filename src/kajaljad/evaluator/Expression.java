package kajaljad.evaluator;

public class Expression {
    Double value;
    Expression left;
    Expression right;
    Operator operator;

    public Expression(Double value) {
        this.value = value;
    }

    public Expression(Expression left, Expression right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public double evaluate() {
        return (value!=null) ? value : operator.operate(left,right);
    }
}
