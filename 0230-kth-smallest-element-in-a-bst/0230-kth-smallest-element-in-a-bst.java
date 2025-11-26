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
    List<Integer> lst = new ArrayList<>();
    public void helper(TreeNode root){
        if(root == null) return ;
        lst.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        Collections.sort(lst,Collections.reverseOrder());
        return lst.get(lst.size()-k);
        
    }
}