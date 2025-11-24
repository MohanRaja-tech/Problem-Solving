class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c != '.'){
                    if(set.contains(c)) return false;
                    set.add(c);
                }
            }
            set.clear();
        }
        set.clear();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[j][i];
                if(c != '.'){
                    if(set.contains(c)) return false;
                    set.add(c);
                }
            }
            set.clear();
        }
        for(int startrow=0;startrow<9;startrow += 3){
            for(int startcol=0;startcol < 9;startcol += 3){
                set.clear();
                for(int row=startrow;row<startrow+3;row++){
                    for(int col=startcol;col<startcol+3;col++){
                        char ch = board[row][col];
                        if(ch != '.'){
                            if(set.contains(ch)) return false;
                            set.add(ch);
                        }
                    }
                }
            }
        }
        return true;
    }
}
