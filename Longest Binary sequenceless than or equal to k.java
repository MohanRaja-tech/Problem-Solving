class Solution {
    public int longestSubsequence(String s, int k) {
        int zeros = 0;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                zeros++;
            }
        }
        int length = 0;
        long sum = 0;
        int power = 0;
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '1'){
                if(power < 32){
                    sum += (1L << power);
                
                if(sum <= k){
                    length++;
                }
                else{
                    break;
                }
                }
                else{
                    break;
                }
            }
            power++;
            
        }
        return zeros+length;
    }
}
