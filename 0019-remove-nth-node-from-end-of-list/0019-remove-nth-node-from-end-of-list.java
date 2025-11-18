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
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp =  temp.next;
        }
        int target = count-n;
        int tempcount = 0;
        //ListNode newHead = reverse(head);
        temp = head;
        ListNode prev = null;
        while(temp != null){
            if(tempcount ==  target){
                if(prev == null){
                    return head.next;
                }
                else{
                    prev.next = temp.next;
                }
                return head;
            }
            prev = temp;
            tempcount++;
            temp = temp.next;
        }
        return head;
    }
}