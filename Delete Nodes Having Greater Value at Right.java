/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    Node compute(Node head) {
        // your code here
        head = reverse(head);
        Node maxnode = head;
        Node current = head;
        while(current != null && current.next != null){
            if(current.next.data < maxnode.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
                maxnode = current;
            }
        }
        head = reverse(head);
        return head;
    }
}
