class Solution {
    public String compressedString(String word) {
        int start = 0;
        
        StringBuilder sb = new StringBuilder();
        while(start < word.length()){
            int end = start;
            int count = 0;
            
            while(end < word.length() && word.charAt(start) == word.charAt(end) && count < 9){
                end++;
                count++;
            }

            sb.append(count);
            sb.append(word.charAt(start));
            start = end;
           
            
        }
        return sb.toString();
    }
}
