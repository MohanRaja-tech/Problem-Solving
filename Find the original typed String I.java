class Solution {
    public int possibleStringCount(String word) {
        int i=0;
        String s = word;
        int n = word.length();
        int total = 1;
        while(i < n){
            int j = i;
            while(j < n && s.charAt(i) == s.charAt(j)){
                j++;
            }
            int length = j-i;
            if(length  > 1){
                total += (length-1);
            }
            i = j;
        }
        return total;
    }
}
