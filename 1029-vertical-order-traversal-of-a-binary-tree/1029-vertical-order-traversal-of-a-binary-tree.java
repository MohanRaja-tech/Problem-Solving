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
class Pair{
    int col;
    int row;
    TreeNode node;
    Pair(TreeNode node,int row,int col){
       this.row = row;
       this.node = node;
       this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0,0));
       TreeMap<Integer,TreeMap<Integer,List<Integer>>> map = new TreeMap<>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int row = p.row;
            int col = p.col;    
            if(!map.containsKey(col)){
                map.put(col,new TreeMap<>());
            }
            if(!map.get(col).containsKey(row)){
                map.get(col).put(row,new ArrayList<>());
            }
            map.get(col).get(row).add(node.val);
            if(node.left != null) q.offer(new Pair(node.left,row+1,col-1));
            if(node.right != null) q.offer(new Pair(node.right,row+1,col+1));
        }
        for(TreeMap<Integer,List<Integer>> rows:map.values()){
                List<Integer> collist = new ArrayList<>();
                for(List<Integer> lst : rows.values()){
                    Collections.sort(lst);
                    collist.addAll(lst);
                }
                result.add(collist);
        }
        return result;
    }
}