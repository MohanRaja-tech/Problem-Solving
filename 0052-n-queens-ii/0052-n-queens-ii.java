class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(result,board,0,n);
        return result.size();
    }
    public void backtrack(List<List<String>> result,char[][] board,int row,int n){
        if(row == n){
            result.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(issafe(board,row,col,n)){
                board[row][col] = 'Q';
                backtrack(result,board,row+1,n);
                board[row][col] = '.';
            }
        }
    }
    public boolean issafe(char[][] board,int row,int col,int n){
        //column 
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // upper left diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //upper right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> lst = new ArrayList<>();
        for(char[] row:board){
            lst.add(new String(row));
        }
        return lst;
    }
}