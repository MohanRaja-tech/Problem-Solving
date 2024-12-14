class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                right++;
            }
            else{
                left++;
            }
            if(left == right){
                count += 1;
            }
        }
        return count;
        
    }
}
