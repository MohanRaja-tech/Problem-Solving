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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int num1 = 0;
            int num2 = 0;
            if(l1 != null){
                num1 = l1.val;
            }
            if(l2 != null){
                num2 =  l2.val;
            }
            int sum = num1 + num2 + carry;
            current.next = new ListNode(sum%10);
            current = current.next;
            carry = sum/10;
            if(l1 != null){
                l1 = l1.next;
            }
            else{
                l1 = null;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            else{
                l2 = null;
            }
        }
        return dummy.next;
    }
}