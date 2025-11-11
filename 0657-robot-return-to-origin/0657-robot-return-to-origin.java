class Solution {
    public boolean judgeCircle(String moves) {
        int vertorigin = 0;
        int hororigin = 0;
        for(char ch:moves.toCharArray()){
            if(ch == 'U'){
                vertorigin++;
            }
            if(ch == 'D'){
                vertorigin--;
            }
            if(ch == 'L'){
                hororigin--;
            }
            if(ch == 'R'){
                hororigin++;
            }
        }
        return (vertorigin == 0 && hororigin == 0);
    }
}