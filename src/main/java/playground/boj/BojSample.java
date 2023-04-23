package playground.boj;

import playground.core.Problem;
import playground.core.ProblemInfo;
import playground.core.Result;
import utils.Utils;

import java.io.IOException;

@ProblemInfo(
        Number = 0,
        Title = "Sample",
        Url = "https://www.acmicpc.net/problem/0")
public class BojSample implements Problem {
    public BojSample() throws IOException {
        String input = Utils.getInput();
        prepare(input);
        solve();
    }
    public void prepare(String input) {

    }

    @Override
    public Result solve() {
        return new Result(0);
    }
}
