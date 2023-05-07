package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    @Test
    void case1() {
        IntegerToRoman solution = new IntegerToRoman();
        assertEquals("III", solution.intToRoman(3));
    }
    @Test
    void case2() {
        IntegerToRoman solution = new IntegerToRoman();
        assertEquals("LVIII", solution.intToRoman(58));
    }
    @Test
    void case3() {
        IntegerToRoman solution = new IntegerToRoman();
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }
}