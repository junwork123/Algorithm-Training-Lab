package playground.core;

public abstract class Problem {
    public final Result solve(Input input){
        prepare(input);
        return calculate();
    }
    protected abstract void prepare(Input input);
    protected abstract Result calculate();
}
