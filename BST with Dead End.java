/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public void helper(Node root,Set<Integer> all,Set<Integer> leaf){
        if(root == null){
            return;
        }
        all.add(root.data);
        if(root.left == null && root.right == null){
            leaf.add(root.data);
        }
        helper(root.left,all,leaf);
        helper(root.right,all,leaf);
    }
    public boolean isDeadEnd(Node root) {
        Set<Integer> all = new HashSet<>();
        Set<Integer> leaf = new HashSet<>();
        all.add(0);
        helper(root,all,leaf);
        for(int num :leaf){
            if(all.contains(num-1) && all.contains(num+1)){
                return true;
            }
        }
        return false;
    }
}
