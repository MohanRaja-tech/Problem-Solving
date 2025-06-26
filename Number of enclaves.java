class Solution {
    public class Pair {
        int row;
        int col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int numEnclaves(int[][] grid) {
        int m = grid.length;        // rows
        int n = grid[0].length;     // cols
        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();

        // Traverse first and last column of every row
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
                visited[i][0] = true;
                q.offer(new Pair(i, 0));
            }
            if (grid[i][n - 1] == 1 && !visited[i][n - 1]) {
                visited[i][n - 1] = true;
                q.offer(new Pair(i, n - 1));
            }
        }

        // Traverse first and last row of every column
        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1 && !visited[0][i]) {
                visited[0][i] = true;
                q.offer(new Pair(0, i));
            }
            if (grid[m - 1][i] == 1 && !visited[m - 1][i]) {
                visited[m - 1][i] = true;
                q.offer(new Pair(m - 1, i));
            }
        }

        // Directions: up, down, left, right
        int[] drow = {-1, 1, 0, 0};
        int[] dcol = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.row;
            int col = p.col;

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
                        && grid[nrow][ncol] == 1 && !visited[nrow][ncol]) {
                    q.add(new Pair(nrow, ncol));
                    visited[nrow][ncol] = true;
                }
            }
        }

        int enclaves = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    enclaves++;
                }
            }
        }

        return enclaves;
    }
}
