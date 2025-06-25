/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class Pair{
        Node node;
        int line;
        Pair(Node node,int line){
            this.node = node;
            this.line = line;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer>lst = new ArrayList<>();
        if(root == null){
            return lst;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        
        
        while(!q.isEmpty()){
            Pair current = q.poll();
            Node currnode = current.node;
            int line = current.line;
            
            if(!map.containsKey(line)){
                map.put(line,currnode.data);
            }
            if(currnode.left != null){
                q.offer(new Pair(currnode.left,line-1));
            }
            if(currnode.right != null){
                q.offer(new Pair(currnode.right,line+1));
            }
        }
        
        for(int num : map.keySet()){
            lst.add(map.get(num));
        }
        return lst;
    }
}
