import java.util.*;

class Solution {
    static class Pair {
        int row;
        int col;
        int weight;
        Pair(int row, int col, int weight) {
            this.row = row;
            this.col = col;
            this.weight = weight;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);

        int[][] dist = new int[rows][cols];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;

        pq.add(new Pair(0, 0, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int row = current.row;
            int col = current.col;
            int effort = current.weight;

            if (row == rows - 1 && col == cols - 1) {
                return effort;
            }

            for (int i = 0; i < 4; i++) {
                int newrow = row + drow[i];
                int newcol = col + dcol[i];

                if (newrow >= 0 && newrow < rows && newcol >= 0 && newcol < cols) {
                    int diff = Math.abs(heights[row][col] - heights[newrow][newcol]);
                    int neweffort = Math.max(effort, diff);

                    if (neweffort < dist[newrow][newcol]) {
                        dist[newrow][newcol] = neweffort;
                        pq.add(new Pair(newrow, newcol, neweffort));
                    }
                }
            }
        }

        return -1;
    }
}
