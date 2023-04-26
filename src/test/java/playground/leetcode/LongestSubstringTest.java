package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void case1() {
        String s = "abcabcbb";
        int result = new LongestSubstring().lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }
    @Test
    void case2() {
        String s = "bbbbb";
        int result = new LongestSubstring().lengthOfLongestSubstring(s);
        assertEquals(1, result);
    }
    @Test
    void case3() {
        String s = "pwwkew";
        int result = new LongestSubstring().lengthOfLongestSubstring(s);
        assertEquals(3, result);
    }
}