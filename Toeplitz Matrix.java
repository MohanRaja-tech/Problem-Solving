class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        for (int i = 0; i < n; i++) {
            if (!checkDiagonal(matrix, 0, i)) return false;
        }
        
        
        for (int i = 1; i < m; i++) { 
            if (!checkDiagonal(matrix, i, 0)) return false;
        }
        
        return true;
    }
    
    private boolean checkDiagonal(int[][] matrix, int row, int col) {
        int m = matrix.length;
        int n = matrix[0].length;
        int target = matrix[row][col];
        
        while (row < m && col < n) {
            if (matrix[row][col] != target) {
                return false;
            }
            row++;
            col++;
        }
        return true;
    }
}
