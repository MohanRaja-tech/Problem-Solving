/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
     static List<Integer> lst = new ArrayList<>();
    public static void getelements(Node root){
        if(root == null){
            return ;
        }
        lst.add(root.data);
        getelements(root.left);
        getelements(root.right);
    }
    public static boolean check(int val,int target){
        int x = target-val;
        int left = 0;
        int right = lst.size()-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(lst.get(mid) == x){
                return true;
            }
            else if(lst.get(mid) > x){
                right  = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return  false;
    }
  
    public static void Count(Node root,int[] count){
        if(root == null){
            return;
        }
        if(check(root.data,count[1])){
            count[0]++;
        }
        Count(root.left,count);
        Count(root.right,count);
    }
    public static int countPairs(Node root1, Node root2, int x) {
        // code here
        lst.clear();
        getelements(root2);
        Collections.sort(lst);
        int[] arr = new int[2];
        arr[1] = x;
        Count(root1,arr);
        return arr[0];
    }
}
