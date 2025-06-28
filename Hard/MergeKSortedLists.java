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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> merge = new ArrayList<>();
        for(ListNode node:lists){
            while(node!=null){
                merge.add(node.val);
                node =node.next;
            }
        }
        Collections.sort(merge);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int i:merge){
            temp.next=new ListNode(i);
            temp = temp.next;
        }
        return dummy.next;
    }
}
