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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current = new ListNode(0); 
        ListNode dummy = current;

        ListNode templeft = list1;
        ListNode tempright = list2;

        while (templeft != null && tempright != null) {
            if (templeft.val < tempright.val) {
                current.next = new ListNode(templeft.val);
                templeft = templeft.next;
            } else {
                current.next = new ListNode(tempright.val);
                tempright = tempright.next;
            }
            current = current.next;
        }

        while (templeft != null) {
            current.next = new ListNode(templeft.val);
            templeft = templeft.next;
            current = current.next;
        }

        
        while (tempright != null) {
            current.next = new ListNode(tempright.val);
            tempright = tempright.next;
            current = current.next;
        }

        return dummy.next; 
    }
}
