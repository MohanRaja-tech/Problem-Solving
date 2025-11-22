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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode makecopy(ListNode head){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(head != null){
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }
        return dummy.next;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode original = makecopy(head);
        ListNode reversed =  reverse(original);
        ListNode temp1 = head;
        ListNode temp2 = reversed;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}