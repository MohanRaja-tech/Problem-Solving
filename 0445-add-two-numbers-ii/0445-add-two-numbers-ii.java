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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        ListNode reverse1 = reverse(l1);
        ListNode reverse2 = reverse(l2);
        l1 = reverse1;
        l2 = reverse2;

        while(l1 != null || l2 != null || carry != 0){
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;
            int sum = num1 + num2 + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10; 
            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode resulthead = reverse(dummy.next);
        return resulthead;
    }
}
