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
    int diameter = 0;
    public int fun(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = fun(root.left);
        int right = fun(root.right);
        diameter = Math.max(diameter,left+right);
        return 1 + Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return diameter;
    }
}