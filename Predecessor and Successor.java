/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public void helper(Node root, int key, int[] check, Node[] nodes) {
        if (root == null) return;

        if (root.data < key) {
            int diff = key - root.data;
            if (diff < check[0]) {
                check[0] = diff;
                nodes[0] = root; 
            }
        }
        if (root.data > key) {
            int diff1 = root.data - key;
            if (diff1 < check[1]) {
                check[1] = diff1;
                nodes[1] = root;
            }
        }

        helper(root.left, key, check, nodes);
        helper(root.right, key, check, nodes);
    }

    public ArrayList<Node> findPreSuc(Node root, int key) {
        int[] check = new int[2];
        check[0] = Integer.MAX_VALUE; 
        check[1] = Integer.MAX_VALUE;  
        
        Node[] nodes = new Node[2]; 

        helper(root, key, check, nodes);

        ArrayList<Node> lst = new ArrayList<>();
        lst.add(nodes[0]); 
        lst.add(nodes[1]); 
        return lst;
    }
}
