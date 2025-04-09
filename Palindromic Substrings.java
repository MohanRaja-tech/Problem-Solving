class Solution {

    public boolean check_palindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
           if(s.charAt(start) != s.charAt(end)){
            return false;
           }
           start++;
           end--;
        }
        return true;
    }


    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(check_palindrome(s.substring(i,j))){
                    count += 1;
                }
            }
        }
        return count;
    }
}
