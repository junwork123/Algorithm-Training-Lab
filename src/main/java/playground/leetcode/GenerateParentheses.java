package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.ArrayList;
import java.util.List;

@ProblemInfo(
        Number = 22,
        Title = "Generate Parentheses",
        Url = "https://leetcode.com/problems/generate-parentheses/"
)
public class GenerateParentheses {
    List<String> result = new ArrayList<>();
    int max = 0;
    public List<String> generateParenthesis(int n) {
        this.max = n;
        process("", 0, 0);
        return result;
    }
    void process(String now, int left, int right){
        if(left > right){
            process(now + ")", left, right + 1);
        }
        if(left < max){
            process(now + "(", left + 1, right);
        }
        if(left == max && right == max){
            result.add(now);
        }
    }
}
