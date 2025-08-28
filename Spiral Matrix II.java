class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int fill = 1;
        while(left <= right && top <= bottom && fill <= n*n ){
            for(int i=left;i<=right;i++){
                spiral[top][i] = fill;
                fill++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                spiral[i][right] = fill;
                fill++;
            }
            right--;
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    spiral[bottom][i] = fill;
                    fill++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    spiral[i][left] = fill;
                    fill++;
                }
                left++;
            }
        }
        int[][] result = new int[n][n];
        for(int i=0;i<spiral.length;i++){
            for(int j=0;j<spiral[i].length;j++){
                result[i][j] = spiral[i][j];
            }
        }
        return result;
    }
}
