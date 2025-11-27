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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        q.offer(root);
        boolean isodd = false;
        while(!q.isEmpty()){
           int size = q.size();
           List<TreeNode> level = new ArrayList<>();
           for(int i=0;i<size;i++){
               TreeNode node = q.poll();
               level.add(node);
               if(node.left != null) q.offer(node.left);
               if(node.right != null) q.offer(node.right);
           }
           if(isodd){
            int start = 0;
            int end = level.size()-1;
            while(start < end){
                int temp = level.get(start).val;
                level.get(start).val = level.get(end).val;
                level.get(end).val = temp;
                start++;
                end--;
            }
           }
           isodd = !isodd;   
        }
        return root;
    }
}