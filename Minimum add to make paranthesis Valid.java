class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int addition = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                balance++;
            }
            else if(ch == ')'){
                if(balance > 0){
                    balance--;
                }
                else{
                    addition++;
                }
            }
           
        }
        return balance+addition;
    }
}
