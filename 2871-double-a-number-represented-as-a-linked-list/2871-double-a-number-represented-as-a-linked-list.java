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

    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        int carry = 0;
        ListNode prev = null;
        while(temp != null){
            int sum = temp.val*2 + carry;
            temp.val = sum%10;
            carry = sum/10;
            prev = temp;
            temp = temp.next;
        }
        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            prev.next = newNode;
            prev = newNode;
        }
        return reverse(head);
    }   
}