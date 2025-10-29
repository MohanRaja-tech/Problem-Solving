class Solution {
    public boolean checkset(String str){
       for(char ch:str.toCharArray()){
            if(ch == '0'){
                return false;
            }
       }
       return true;
    }
    public int smallestNumber(int n) {
        String binary =  Integer.toBinaryString(n);
        for(int i=n;i<=Integer.MAX_VALUE;i++){
            String temp = Integer.toBinaryString(i);
            if(checkset(temp)){
                return Integer.parseInt(temp,2);
            }
        }
        return 0;
    }
}