/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    Long min;
    Long max;
    Pair(TreeNode node,Long min,Long max){
        this.node = node;
        this.min = min;
        this.max = max;
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,Long.MIN_VALUE,Long.MAX_VALUE));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            Long max = p.max;
            Long min = p.min;
            if(node.val <= min || node.val >= max) return false;
            if(node.left != null) q.offer(new Pair(node.left,min,(long)node.val));
            if(node.right != null) q.offer(new Pair(node.right,(long)node.val,max));
        }
        return true;
    }
}