import java.util.*;

class GfG {

    public static void getelements(Node root, List<Integer> lst) {
        if (root == null) return;
        lst.add(root.data);
        getelements(root.left, lst);
        getelements(root.right, lst);
    }

    private static Node buildBalancedBST(List<Integer> sorted, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        Node node = new Node(sorted.get(mid));
        node.left = buildBalancedBST(sorted, l, mid - 1);
        node.right = buildBalancedBST(sorted, mid + 1, r);
        return node;
    }

    public static Node changeKey(Node root, int old_key, int new_key) {
        if (root == null) return null;

        List<Integer> lst = new ArrayList<>();
        getelements(root, lst);

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == old_key) {
                lst.set(i, new_key);
            }
        }

        Collections.sort(lst);

        Node newroot = buildBalancedBST(lst, 0, lst.size() - 1);
        return newroot;
    }
}
