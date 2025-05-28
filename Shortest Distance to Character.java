class Solution {
    public int find(int index,String s,char c){
       int min = Integer.MAX_VALUE;
       for(int i=index;i<s.length();i++){
            if(s.charAt(i) == c){
                min = Math.min(min,i-index);
            }
       }
       for(int i=index;i>=0;i--){
            if(s.charAt(i) == c){
                min = Math.min(min,index-i);
            }
       }
       return min;
    }
    public int[] shortestToChar(String s, char c) {
        int[] result =  new int[s.length()];
      

        for(int i=0;i<s.length();i++){
            int index = find(i,s,c);
            result[i] = index;
            
            
        }
        return result;
    }
}
