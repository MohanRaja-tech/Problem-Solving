class Solution {
    public int helper(Queue<int[]> q,int[][]visited,int[] drow,int[] dcol,int m,int n,int[][] grid){
        int sum = 0;
        while(!q.isEmpty()){
            int[] p = q.poll();
            int row = p[0];
            int col = p[1];
            for(int i=0;i<4;i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n){
                    if(grid[nrow][ncol] > 0 && visited[nrow][ncol] == 0){
                        visited[nrow][ncol] = 1;
                        q.offer(new int[]{nrow,ncol});
                        sum += grid[nrow][ncol];
                    }
                }
            }
        }
        return sum;
    }
    public int findMaxFish(int[][] grid) {
        if(grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        int[] drow = {0,0,-1,1};
        int[] dcol = {-1,1,0,0};
        int[][] visited = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0 && visited[i][j] == 0){
                    int sum = grid[i][j];
                    visited[i][j] = 1;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i,j});
                    int tsum = helper(q,visited,drow,dcol,m,n,grid);
                    sum += tsum;
                    max = Math.max(sum,max);
                }
            }
            
        }
        return max;
    }
}