class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(board, word, visited, i, j, m, n, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, boolean[][] visited,
                       int i, int j, int row, int col, int idx) {

        if(idx == word.length()) return true;

        if(i < 0 || i >= row || j < 0 || j >= col || visited[i][j])
            return false;

        if(board[i][j] != word.charAt(idx))
            return false;

        visited[i][j] = true;

        if(dfs(board, word, visited, i-1, j, row, col, idx+1) ||
           dfs(board, word, visited, i+1, j, row, col, idx+1) ||
           dfs(board, word, visited, i, j-1, row, col, idx+1) ||
           dfs(board, word, visited, i, j+1, row, col, idx+1))
            return true;

        visited[i][j] = false;
        return false;
    }
}
