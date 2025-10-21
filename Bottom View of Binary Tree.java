class Solution {
    public static class Pair {
        Node node;
        int line;

        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> lst = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair current = q.poll();
            Node currNode = current.node;
            int line = current.line;

            map.put(line, currNode.data);

            if (currNode.left != null) {
                q.offer(new Pair(currNode.left, line - 1));
            }

            if (currNode.right != null) {
                q.offer(new Pair(currNode.right, line + 1));
            }
        }

        for (int num : map.keySet()) {
            lst.add(map.get(num));
        }

        return lst;
    }
}
