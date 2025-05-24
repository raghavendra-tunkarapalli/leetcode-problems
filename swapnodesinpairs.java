/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = head;
        while(res != null && res.next != null){
            int temp = res.val;
            res.val = res.next.val;
            res.next.val = temp;
            res = res.next.next;
        }
        return head;
    }
}