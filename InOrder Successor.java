import java.util.*;

class Solution {
    public void helper(Node root, List<Integer> lst) {
        if (root == null) return;
        helper(root.left, lst);
        lst.add(root.data);
        helper(root.right, lst);
    }

    public int inorderSuccessor(Node root, Node x) {
        List<Integer> lst = new ArrayList<>();
        helper(root, lst);
        int index = Collections.binarySearch(lst, x.data);
        if (index < 0 || index + 1 >= lst.size()) {
            return -1;
        }
        return lst.get(index + 1);
    }
}
