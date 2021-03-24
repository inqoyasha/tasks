package study.practice.task03;

public final class Div implements Expr {
    private final Expr left;
    private final Expr right;

    public Div(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
