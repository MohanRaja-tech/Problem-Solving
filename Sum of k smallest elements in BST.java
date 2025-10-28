// User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree {
    public void helper(Node root,Set<Integer> set,int[] sum){
        if(root == null) return;
        if(!set.contains(root.data)){
              sum[1] = Math.min(sum[1],root.data);
        }
        helper(root.left,set,sum);
        helper(root.right,set,sum);
        
      
    }
    int sum(Node root, int k) {
        Set<Integer> set = new HashSet<>();
        int[] sum = new int[2];
       
        for(int i=0;i<k;i++){
            sum[1] = Integer.MAX_VALUE;
            helper(root,set,sum);
            if(sum[1] == Integer.MAX_VALUE) break;
            sum[0] += sum[1];
            set.add(sum[1]);
            
        }
        return sum[0];
    }
}
