class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        }   
        boolean goingDown = false;
        int row = 0;
        for(char ch : s.toCharArray()){
            rows[row].append(ch);

            if(row == 0 || row == numRows-1)
                goingDown = !goingDown;
                 if(goingDown){
            row += 1;
        }
        else{
            row -= 1;
        }
            }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : rows){
            result.append(sb);
        }
       
    return result.toString();
    }
}
