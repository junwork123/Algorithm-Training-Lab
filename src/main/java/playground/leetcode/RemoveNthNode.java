package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.List;

@ProblemInfo(
        Number = 19,
        Title = "Remove Nth Node From End of List",
        Url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list/"
)
public class RemoveNthNode {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(List<Integer> list) {
            if (list.size() == 0) {
                return;
            }
            this.val = list.get(0);
            list.remove(0);
            if (list.size() > 0) {
                this.next = new ListNode(list);
            }
        }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = countLength(head);
        return removedNode(head, length - n + 1);
    }
    ListNode removedNode(ListNode head, int targetIndex) {
        int i = 0;
        ListNode node = head;
        ListNode prev = null;
        if(targetIndex == 0){ return node.next; }
        while (node != null){
            if(i == targetIndex){
                prev.next = node.next;
                break;
            }
            prev = node;
            node = node.next;
            i++;
        }
        return head;
    }
    int countLength(ListNode head) {
        int i = 0;
        while(head.next != null){
            i++;
            head = head.next;
        }
        return i;
    }
}
