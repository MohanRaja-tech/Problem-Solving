/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree {
    public void helper(Node root,ArrayList<Integer> lst){
        if(root == null){
            return ;
        }
        helper(root.left,lst);
        helper(root.right,lst);
        if(root.left != null && root.right == null){
            lst.add(root.left.data);
        }
        if(root.left == null && root.right != null){
            lst.add(root.right.data);
        }
    }
    ArrayList<Integer> noSibling(Node node) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        helper(node,lst);
        if(lst.size() == 0){
            lst.add(-1);
        }
        Collections.sort(lst);
        return lst;
    }
}
