
class Solution {
    int drow[] = {-1, 1, 0, 0};
    int dcol[] = {0, 0, -1, 1};

    public boolean isBound(int row, int col, int m, int n) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }

    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>(); 
        int freshOranges = 0;
        int maxTime = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0}); 
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) {
            return 0;
        }

        int rottenCount = 0; 

        while (!q.isEmpty()) {
            int[] p = q.poll();
            int row = p[0];
            int col = p[1];
            int time = p[2];
            
            maxTime = Math.max(maxTime, time);

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];

                if (isBound(nrow, ncol, m, n) && grid[nrow][ncol] == 1) {
                    grid[nrow][ncol] = 2; 
                    rottenCount++;
                    q.offer(new int[]{nrow, ncol, time + 1});
                }
            }
        }
        
        return (rottenCount == freshOranges) ? maxTime : -1;
    }
}