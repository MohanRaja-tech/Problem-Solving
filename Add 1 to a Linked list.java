class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while(temp != null){
            int sum = temp.data + carry;
            temp.data = sum%10;
            carry = sum/10;
            
            if(carry == 0){
                break;
            }
            if(temp.next == null && carry>0){
                temp.next = new Node(carry);
                carry = 0;
                break;
            }
            temp = temp.next;
        }
        return reverse(head);
    }
    private Node reverse(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current !=  null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
