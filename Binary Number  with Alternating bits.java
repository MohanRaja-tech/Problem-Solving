class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin = Integer.toBinaryString(n);
        if(bin.length() == 1){
            return true;
        }
        for(int i=1;i<bin.length();i++){
            if(bin.charAt(i) == '0' && bin.charAt(i-1) == '1' ){
                continue;
            }
            else if(bin.charAt(i) == '1' && bin.charAt(i-1) == '0'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    }
