package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {
    @Test
    void case1() {
        // Input: dividend = 10, divisor = 3
        // Output: 3
        assertEquals(3, new DivideTwoIntegers().divide(10, 3));
    }
    @Test
    void case2() {
        // Input: dividend = 7, divisor = -3
        // Output: -2
        assertEquals(-2, new DivideTwoIntegers().divide(7, -3));
    }
}