package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    @Test
    void case1() {
        // Input: n = 3
        // Output: ["((()))","(()())","(())()","()(())","()()()"]
        assertEquals(5, new GenerateParentheses().generateParenthesis(3).size());
    }
    @Test
    void case2() {
        // Input: n = 1
        // Output: ["()"]
        assertEquals(1, new GenerateParentheses().generateParenthesis(1).size());
    }
}