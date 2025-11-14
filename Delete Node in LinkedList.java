\class Solution {
    Node deleteNode(Node head, int x) {
        Node temp = head;
        Node prev = null;
        int count = 1;

        while (temp != null) {
            if (count == x) {

                if (prev == null) {
                    head = temp.next; 
                }

                else if (temp.next != null) {
                    prev.next = temp.next;
                } else {
                    prev.next = null;
                }
                break; 
            }

            prev = temp;
            temp = temp.next;
            count++;
        }

        return head;
    }
}
