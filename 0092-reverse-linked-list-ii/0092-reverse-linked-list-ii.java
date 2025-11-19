class Solution {

    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right) return head;

        ListNode tempt = head;
        ListNode prev = null; 
        ListNode temp = null; 
        ListNode next = null; 
        int count = 1;

        while(tempt != null){
            if(count == left) {
                temp = tempt;
            }
            if(count == right) {
                next = tempt.next;
                tempt.next = null;
                break;
            }
            if(temp == null) {
                prev = tempt;
            }
            tempt = tempt.next;
            count++;
        }
        ListNode newNode = reverse(temp);

        if(prev != null)
            prev.next = newNode;
        else
            head = newNode;
        tempt = newNode;
        while(tempt.next != null){
            tempt = tempt.next;
        }

        tempt.next = next;

        return head;
    }
}
