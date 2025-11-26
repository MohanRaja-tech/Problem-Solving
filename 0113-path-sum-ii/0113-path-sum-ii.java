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
    public void helper(TreeNode root,int target,List<List<Integer>> lst,List<Integer> temp){
        if(root == null) return;
        temp.add(root.val);
        if(root.left == null && root.right == null){
            if(root.val == target) lst.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        helper(root.left,target-root.val,lst,temp);
        helper(root.right,target-root.val,lst,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        helper(root,targetSum,result,lst);
        return result;
    }
}