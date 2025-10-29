/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        List<Integer> lst =  new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
        
            for(int i=0;i<size;i++){
                Node current = q.poll();
                lst.add(current.data);
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
           
        }
        Collections.sort(lst);
        return lst.get(lst.size()-k);
    }
}
