package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {

    @Test
    void case1() {
        assertEquals("PAHNAPLSIIGYIR", new ZigzagConversion().convert("PAYPALISHIRING", 3));
    }
    @Test
    void case2() {
        assertEquals("PINALSIGYAHRPI", new ZigzagConversion().convert("PAYPALISHIRING", 4));
    }
    @Test
    void case3() {
        assertEquals("A", new ZigzagConversion().convert("A", 1));
    }
}