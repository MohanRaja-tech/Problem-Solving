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
    int max = 0;
    public void helper(TreeNode root){
        if(root == null) return ;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        if(map.get(root.val) >= 1) max = Math.max(max,map.get(root.val));
        helper(root.left);
        helper(root.right);

    }
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[]{0};
        helper(root);
        int c = 0;
        List<Integer> lst = new ArrayList<>();
        for(int num:map.keySet()){
            int freq = map.get(num);
            if(freq == max) lst.add(num);
        }
        int[] result = new int[lst.size()];
        for(int num:lst) result[c] = lst.get(c++);
        return result;
        
    }
}