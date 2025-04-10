class Solution {
    public boolean check_palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String result = "";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp = s.substring(i,j);
                if(check_palindrome(temp)){
                    if(temp.length() > result.length()){
                        result = temp;
                    }
                }
            }
    }
    return result;
    }
}
