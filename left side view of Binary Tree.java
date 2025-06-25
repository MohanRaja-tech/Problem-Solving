/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null){
            return lst;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int loop = q.size();
            Node left = null;
            
            for(int i=0;i<loop;i++){
                Node current = q.poll();
                if(i == 0){
                    left = current;
                }
                
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
            lst.add(left.data);
        }
        return lst;
    }
}
