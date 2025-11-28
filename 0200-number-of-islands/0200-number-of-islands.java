class Pair{
    int row = 0;
    int col = 0;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int m  = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        //for(boolean[] temp:visited) Arrays.fill(temp,false);
        int[] drow  = {-1,1,0,0};
        int[] dcol =  {0,0,-1,1};
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    visited[i][j] = true;
                    Queue<Pair> q = new LinkedList<>();
                    q.offer(new Pair(i,j));
                    while(!q.isEmpty()){
                        Pair p = q.poll();
                        int row = p.row;
                        int col = p.col;
                        for(int k=0;k<4;k++){
                            int nrow = row + drow[k];
                            int ncol = col + dcol[k];
                            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n){
                                if(grid[nrow][ncol] == '1' && !visited[nrow][ncol]){
                                    q.offer(new Pair(nrow,ncol));
                                    visited[nrow][ncol] = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}