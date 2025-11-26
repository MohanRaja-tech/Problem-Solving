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
    Map<Integer,Integer> map = new HashMap<>();
    boolean flag = false;
    public void helper(TreeNode root,int target){
        if(root == null) return;
        int check = target-root.val;
        if(map.containsKey(check)) flag = true;
        map.put(root.val,root.val);
        helper(root.left,target);
        helper(root.right,target);
    }
    public boolean findTarget(TreeNode root, int k) {
        helper(root,k);
        return flag;
    }
}