package playground.leetcode;

import playground.core.ProblemInfo;

import java.util.List;

@ProblemInfo(
        Number = 24,
        Title = "Swap Nodes in Pairs",
        Url = "https://leetcode.com/problems/swap-nodes-in-pairs/"
)
public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode createNodeList(List<Integer> list){
        if(list.size() == 0) { return null; }
        ListNode node = new ListNode(list.get(0));
        node.next = createNodeList(list.subList(1, list.size()));
        return node;
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null) { return null; }
        if(head.next == null) { return head; }
        ListNode origin = head.next;

        ListNode prev = null;
        ListNode now = head;
        while (now != null && now.next != null){
            swap(prev, now);
            prev = now;
            now = now.next;
        }

        return origin;
    }
    void swap(ListNode prev, ListNode now){
        ListNode next = now.next;
        ListNode nextNext = now.next.next;
        if(prev != null) { prev.next = next; }
        next.next = now;
        now.next = nextNext;
    }
}
