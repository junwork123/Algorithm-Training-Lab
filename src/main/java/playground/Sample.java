package playground;

import playground.core.Input;
import playground.core.Problem;
import playground.core.ProblemInfo;
import playground.core.Result;

@ProblemInfo(
        Number = 0,
        Title = "Sample",
        Url = "https://www.acmicpc.net/problem/0")
public class Sample extends Problem {
    @Override
    protected void prepare(Input input) {

    }

    @Override
    protected Result calculate() {
        return new Result(0);
    }
}
