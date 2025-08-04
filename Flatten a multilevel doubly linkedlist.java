class Solution {
    public Node flatten(Node head) {
        if (head == null) return null; 

        Stack<Node> stack = new Stack<>();
        Node current = new Node(0);
        Node dummy = current;

        stack.push(head);

        while (!stack.isEmpty()) {
            Node temp = stack.pop();

            Node newNode = new Node(temp.val);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;

            if (temp.next != null) {
                stack.push(temp.next);
            }
            if (temp.child != null) {
                stack.push(temp.child);
            }
        }

        Node resulthead = dummy.next;
        if (resulthead != null) {
            resulthead.prev = null;
        }

        return resulthead;
    }
}
