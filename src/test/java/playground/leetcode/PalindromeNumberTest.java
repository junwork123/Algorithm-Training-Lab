package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @Test
    void case1() {
        PalindromeNumber solution = new PalindromeNumber();
        assertTrue(solution.isPalindrome(121));
    }
    @Test
    void case2() {
        PalindromeNumber solution = new PalindromeNumber();
        assertFalse(solution.isPalindrome(-121));
    }
    @Test
    void case3() {
        PalindromeNumber solution = new PalindromeNumber();
        assertFalse(solution.isPalindrome(10));
    }
    @Test
    void case4() {
        PalindromeNumber solution = new PalindromeNumber();
        assertTrue(solution.isPalindrome(0));
    }
    @Test
    void case5() {
        PalindromeNumber solution = new PalindromeNumber();
        assertTrue(solution.isPalindrome(1));
    }
}
