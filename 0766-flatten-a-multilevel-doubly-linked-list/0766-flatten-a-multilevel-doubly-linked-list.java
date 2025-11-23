/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        Stack<Node> stack = new Stack<>();
        Node dummy = new Node(0);
        Node current = dummy;
        stack.push(head);

        while(!stack.isEmpty()){
            Node temp = stack.pop();
            Node newNode = new Node(temp.val);
            current.next = newNode;
            newNode.prev = current;
            current = current.next;
            if(temp.next != null){
                stack.push(temp.next);
            }
            if(temp.child != null){
                stack.push(temp.child);
            }
        }
        Node result = dummy.next;
        if(result != null){
            result.prev = null;
        }
         return result;
    }
}