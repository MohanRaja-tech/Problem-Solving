class Solution {
    public void rotate(int[][] matrix) {
       transpose(matrix);
       reverse(matrix); 
    }
    public void transpose(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int[][] matrix){
        int row = matrix.length;
        for(int i=0;i<row;i++){
            int start = 0;
            int end = matrix[0].length-1;
            while(start <= end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}