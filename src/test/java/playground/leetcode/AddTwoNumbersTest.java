package playground.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AddTwoNumbersTest {

    @Test
    void case1() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next = new AddTwoNumbers.ListNode(4);

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }
    @Test
    void case2() {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(0);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(0);

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertEquals(0, result.val);
        assertNull(result.next);
    }

    @Test
    void case3(){
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9);
        l1.next = new AddTwoNumbers.ListNode(9);
        l1.next.next = new AddTwoNumbers.ListNode(9);
        l1.next.next.next = new AddTwoNumbers.ListNode(9);
        l1.next.next.next.next = new AddTwoNumbers.ListNode(9);
        l1.next.next.next.next.next = new AddTwoNumbers.ListNode(9);
        l1.next.next.next.next.next.next = new AddTwoNumbers.ListNode(9);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9);
        l2.next = new AddTwoNumbers.ListNode(9);
        l2.next.next = new AddTwoNumbers.ListNode(9);
        l2.next.next.next = new AddTwoNumbers.ListNode(9);

        AddTwoNumbers.ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertEquals(8, result.val);
        assertEquals(9, result.next.val);
        assertEquals(9, result.next.next.val);
        assertEquals(9, result.next.next.next.val);
        assertEquals(0, result.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.val);
        assertEquals(0, result.next.next.next.next.next.next.val);
        assertEquals(1, result.next.next.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next.next.next);
    }
}