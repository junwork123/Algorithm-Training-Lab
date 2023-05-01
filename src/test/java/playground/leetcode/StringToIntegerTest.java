package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void case1() {
        StringToInteger solution = new StringToInteger();
        assertEquals(42, solution.myAtoi("42"));
    }
    @Test
    void case2() {
        StringToInteger solution = new StringToInteger();
        assertEquals(-42, solution.myAtoi("   -42"));
    }
    @Test
    void case3() {
        StringToInteger solution = new StringToInteger();
        assertEquals(4193, solution.myAtoi("4193 with words"));
    }
    @Test
    void case4() {
        StringToInteger solution = new StringToInteger();
        assertEquals(0, solution.myAtoi("words and 987"));
    }
    @Test
    void case5() {
        StringToInteger solution = new StringToInteger();
        assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    }
    @Test
    void case6() {
        StringToInteger solution = new StringToInteger();
        assertEquals(2147483647, solution.myAtoi("21474836460"));
    }
    @Test
    void case7() {
        StringToInteger solution = new StringToInteger();
        assertEquals(0, solution.myAtoi("   +0 123"));
    }
    @Test
    void case8() {
        StringToInteger solution = new StringToInteger();
        assertEquals(-2147483647, solution.myAtoi("-2147483647"));
    }
    @Test
    void case9() {
        StringToInteger solution = new StringToInteger();
        assertEquals(2147483647, solution.myAtoi("+2147483648"));
    }
}