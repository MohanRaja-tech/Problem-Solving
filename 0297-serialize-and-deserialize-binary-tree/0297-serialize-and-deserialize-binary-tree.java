/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public void helper1(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("null");
            sb.append(",");
            return;
        }
        sb.append(Integer.toString(root.val));
        sb.append(",");
        helper1(root.left,sb);
        helper1(root.right,sb);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper1(root,sb);
        return sb.toString();
    }
    public TreeNode helper2(List<String> lst,int[] index){
        if(index[0] >= lst.size()) return null;
        String val = lst.get(index[0]++);
        if(val.equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = helper2(lst,index);
        root.right = helper2(lst,index);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        int[] index = {0};
        List<String> lst = Arrays.asList(arr);
        return helper2(lst,index);
    }   
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));