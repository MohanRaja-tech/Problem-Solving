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
class Solution {
    public void helper(TreeNode root,int[] sum,boolean isLeft){
        if(root == null){
            return;
        }
        if(isLeft && root.left == null && root.right == null){
            sum[0] += root.val;
        }
        helper(root.left,sum,true); //left nodes
        helper(root.right,sum,false); // right nodes
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = new int[1];
        helper(root,sum,false); // root is not the left node
        return sum[0];
    }
}
