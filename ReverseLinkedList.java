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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode clone = dummy;
        ListNode temp = head;
        while(temp != null){
            clone.next = new ListNode(temp.val);
            clone = clone.next;
            temp = temp.next;
        }
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode original = dummy.next;
        ListNode reversed = prev;
        while(original != null){
            if(original.val != reversed.val){
                return false;
            }
            original = original.next;
            reversed = reversed.next;
        }
        return true;
    }
}
