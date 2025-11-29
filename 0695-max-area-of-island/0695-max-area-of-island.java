class Solution {
    public int helper(int[][] grid,int[] drow,int[] dcol,int[][] visited,int m,int n,Queue<int[]> q){
        int count = 0;
        while(!q.isEmpty()){
           int[] p = q.poll();
           int row = p[0];
           int col = p[1];
           for(int i=0;i<4;i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n){
                    if(grid[nrow][ncol] == 1 && visited[nrow][ncol] != 1){
                        count++;
                        q.offer(new int[]{nrow,ncol});
                        visited[nrow][ncol] = 1;
                    }
                }
           } 
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int[] drow = {0,0,-1,1};
        int[] dcol = {-1,1,0,0};
        int count = 0;
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    visited[i][j] = 1;
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    count += helper(grid,drow,dcol,visited,m,n,q);
                    max = Math.max(max,count);
                    count = 0;
                }
            }
        }
        return max;
    }
}