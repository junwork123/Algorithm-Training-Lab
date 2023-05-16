package playground.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RemoveNthNodeTest {

    @Test
    void case1() {
        // Input: head = [1,2,3,4,5], n = 2
        // Output: [1,2,3,5]
        RemoveNthNode.ListNode input = new RemoveNthNode.ListNode(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        RemoveNthNode.ListNode head = new RemoveNthNode.ListNode(new ArrayList<>(List.of(1)));
        Assertions.assertEquals(head.val, new RemoveNthNode().removeNthFromEnd(input, 2).val);
    }
    @Test
    void case2() {
        // Input: head = [1], n = 1
        // Output: []
        RemoveNthNode.ListNode input = new RemoveNthNode.ListNode(new ArrayList<>(List.of(1)));
        RemoveNthNode.ListNode head = new RemoveNthNode.ListNode(new ArrayList<>(List.of()));
        Assertions.assertNull(new RemoveNthNode().removeNthFromEnd(input, 1));
    }
    @Test
    void case3() {
        // Input: head = [1,2], n = 1
        // Output: [1]
        RemoveNthNode.ListNode input = new RemoveNthNode.ListNode(new ArrayList<>(Arrays.asList(1, 2)));
        RemoveNthNode.ListNode expected = new RemoveNthNode.ListNode(new ArrayList<>(List.of(1)));
        Assertions.assertEquals(expected.val, new RemoveNthNode().removeNthFromEnd(input, 1).val);
    }
}