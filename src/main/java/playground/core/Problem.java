package playground.core;

public abstract class Problem {
    private final Input input;

    public Problem(Input input) {
        this.input = input;
    }

    public final Result solve(){
        prepare();
        return calculate();
    }
    protected abstract void prepare();
    protected abstract Result calculate();
}
