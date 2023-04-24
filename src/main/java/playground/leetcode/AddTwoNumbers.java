package playground.leetcode;

import playground.core.ProblemInfo;

@ProblemInfo(
        Number = 2,
        Title = "Add Two Numbers",
        Url = "https://leetcode.com/problems/add-two-numbers/"
)
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;

        int carry = 0;
        int sum;
        while(canCalculate(l1, l2, carry)) {
            // 계산
            sum = valueOf(l1) + valueOf(l2) + carry;
            carry = sum / 10;
            sum = sum % 10;
            current.val = sum;

            // 다음 단계 준비
            l1 = toNext(l1);
            l2 = toNext(l2);
            if (canCalculate(l1, l2, carry)) {
                current.next = new ListNode();
                current = current.next;
            }
        }
        return head;
    }
    ListNode toNext(ListNode node) {
        if(node == null) return null;
        return node.next == null ? null : node.next;
    }
    int valueOf(ListNode node) {
        return node == null ? 0 : node.val;
    }
    boolean isNotNull(ListNode node) {
        return node != null;
    }
    boolean canCalculate(ListNode l1, ListNode l2, int carry) {
        return isNotNull(l1) || isNotNull(l2) || carry > 0;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
