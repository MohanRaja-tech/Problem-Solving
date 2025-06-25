/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static Node buildparent(Node root, int target, Map<Node, Node> pmap) {
        Queue<Node> q = new LinkedList<>();
        Node targetNode = null;
        q.offer(root);

        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current.data == target) {
                targetNode = current;
            }

            if (current.left != null) {
                pmap.put(current.left, current);
                q.offer(current.left);
            }

            if (current.right != null) {
                pmap.put(current.right, current);
                q.offer(current.right);
            }
        }
        return targetNode;
    }

    public static int minTime(Node root, int target) {
        Map<Node, Node> pmap = new HashMap<>();
        Node targetnode = buildparent(root, target, pmap);

        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();

        q.offer(targetnode);
        visited.add(targetnode);
        int count = 0;

        while (!q.isEmpty()) {
            int levelsize = q.size();
            boolean burned = false;

            for (int i = 0; i < levelsize; i++) {
                Node current = q.poll();

                if (current.left != null && !visited.contains(current.left)) {
                    q.offer(current.left);
                    visited.add(current.left);
                    burned = true;
                }

                if (current.right != null && !visited.contains(current.right)) {
                    q.offer(current.right);
                    visited.add(current.right);
                    burned = true;
                }

                if (pmap.containsKey(current)) {
                    Node parent = pmap.get(current);
                    if (!visited.contains(parent)) {
                        q.offer(parent);
                        visited.add(parent);
                        burned = true;
                    }
                }
            }
            if (burned) {
                count++;
            }
        }

        return count;
    }
}
