/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
import java.util.*;
class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node left = null;
            int size = q.size();
            boolean flag = true;
            for(int i=0;i<size;i++){
                Node node = q.poll();
                if(flag){
                    left = node;
                    flag = false;
                }
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            result.add(left.data);
            
        }
        return result;
    }
}
