package playground.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    @Test
    void case1() {
        // Input: head = [1,2,3,4]
        // Output: [2,1,4,3]
        SwapNodesInPairs.ListNode input = SwapNodesInPairs.createNodeList(List.of(1, 2, 3, 4));
        assertEquals(2, new SwapNodesInPairs().swapPairs(input).val);
    }
    @Test
    void case2() {
        // Input: head = []
        // Output: []
        SwapNodesInPairs.ListNode input = SwapNodesInPairs.createNodeList(List.of());
        assertNull(new SwapNodesInPairs().swapPairs(input));
    }
    @Test
    void case3() {
        // Input: head = [1]
        // Output: [1]
        SwapNodesInPairs.ListNode input = SwapNodesInPairs.createNodeList(List.of(1));
        assertEquals(1, new SwapNodesInPairs().swapPairs(input).val);
    }
}