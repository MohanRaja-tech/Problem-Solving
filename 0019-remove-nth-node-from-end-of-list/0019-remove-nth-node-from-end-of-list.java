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
        List<Integer> lst = new ArrayList<>();
        while(temp != null){
            lst.add(temp.val);
            temp = temp.next;
        }
        int remove_index = lst.size()-n;
        lst.remove(remove_index);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int num : lst){
            current.next  = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}