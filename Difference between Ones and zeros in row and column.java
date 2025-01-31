class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] diff = new int[rows][cols];
        int[] onerows = new int[rows];
        int[] onecols = new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                onerows[i] += grid[i][j];
                onecols[j] += grid[i][j];
            }
        } 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                diff[i][j] = onerows[i] + onecols[j] - (rows-onerows[i]) - (cols-onecols[j]);
            }
        }
        return diff;       
    }
}
