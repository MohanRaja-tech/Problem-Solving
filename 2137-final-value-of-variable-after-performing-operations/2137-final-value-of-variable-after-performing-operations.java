class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i=0;i<operations.length;i++){
            String temp = operations[i];
            if(temp.startsWith("--")){
                --X;
            }
            else if(temp.startsWith("++")){
                ++X;
            }
            else if(temp.charAt(1) == '+'){
                X++;
            }
            else{
                X--;
            }
            
        }
        return X;
    }
}