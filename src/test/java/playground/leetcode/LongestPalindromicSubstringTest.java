package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    @Test
    void case1() {
        assertEquals("bab".length(), new LongestPalindromicSubstring().longestPalindrome("babad").length());
    }
    @Test
    void case2() {
        assertEquals("bb".length(), new LongestPalindromicSubstring().longestPalindrome("cbbd").length());
    }
}