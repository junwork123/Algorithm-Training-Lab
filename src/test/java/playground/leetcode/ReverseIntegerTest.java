package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void case1() {
        assertEquals(321, new ReverseInteger().reverse(123));
    }
    @Test
    void case2() {
        assertEquals(-321, new ReverseInteger().reverse(-123));
    }
    @Test
    void case3() {
        assertEquals(21, new ReverseInteger().reverse(120));
    }
}