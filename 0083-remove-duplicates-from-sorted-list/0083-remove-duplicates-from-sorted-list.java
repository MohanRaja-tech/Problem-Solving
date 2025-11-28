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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            if(prev !=  null){
                while(temp != null && temp.val == prev.val){
                    temp = temp.next;
                }
                if(temp == null) prev.next = null;
                else prev.next = temp;
            }
            prev  = temp;
            if(temp != null) temp = temp.next;
        }
        return head;
    }
}