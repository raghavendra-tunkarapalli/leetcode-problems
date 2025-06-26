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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dup = new ListNode(0);
       dup.next=head;
       ListNode fir = dup;
       ListNode sec = dup;
        for(int i=0;i<=n;i++){
            fir=fir.next;
        }
        while(fir!=null){
            fir=fir.next;
            sec=sec.next;
        }
        sec.next=sec.next.next;
        return dup.next;
    }
}
