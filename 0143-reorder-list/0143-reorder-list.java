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
         ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public ListNode copyhelper(ListNode head){
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        //ListNode temp = head;
        while(head != null){
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;;
        }
        return dummy.next;
    }
    public void reorderList(ListNode head) {
        ListNode original = copyhelper(head);
        ListNode reversed = reverse(copyhelper(head));

        boolean flag = true;
        ListNode temp1 = original;
        ListNode temp2 = reversed;
        ListNode current = head;
        
        while(current != null){
            if(flag){
                current.val = temp1.val;
                temp1 = temp1.next;
            }
            else{
                current.val = temp2.val;
                temp2 = temp2.next;
            }
            flag = !flag;
            current = current.next;
        }
    }
}