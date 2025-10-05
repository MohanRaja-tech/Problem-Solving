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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<String> path = new LinkedList<>();
        queue.offer(root);
        path.offer(String.valueOf(root.val));
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            String pa = path.poll();
            if(node.left == null && node.right == null){
                lst.add(pa);
            }
            if(node.left != null){
                queue.offer(node.left);
                path.offer(pa+"->"+String.valueOf(node.left.val));
            }
            if(node.right != null){
                queue.offer(node.right);
                path.offer(pa+"->"+String.valueOf(node.right.val));
            }
        }
        return lst;
        
    }
}