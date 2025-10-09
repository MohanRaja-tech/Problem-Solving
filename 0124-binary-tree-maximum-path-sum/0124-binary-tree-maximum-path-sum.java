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
    int sum  = Integer.MIN_VALUE;
    public int helper(TreeNode root){
       if(root == null){
            return 0;
       }

       int left = Math.max(0,helper(root.left));
       int right = Math.max(0,helper(root.right));

       int tempsum = root.val + left + right;
       sum = Math.max(sum,tempsum); 

       return root.val + Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return sum;
    }
}