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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean zigzag = false;
        while(!q.isEmpty()){
            int levelsize = q.size();
            List<Integer> lst = new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode node = q.poll();
                lst.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            if(zigzag){
                Collections.reverse(lst);
                result.add(lst);
            }
            else{
                result.add(lst);
            }
            zigzag = !zigzag;
        }
        return result;
    }
}