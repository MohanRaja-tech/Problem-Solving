class Solution {
    public boolean helper(int num){
        String str = Integer.toString(num);
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str.toCharArray()){
            if(ch - '0' != map.get(ch)){
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int result = 0;
        for(int i=n;i<Integer.MAX_VALUE;i++){
            if( i > n && helper(i)){
                result = i;
                break;
            }
        }
        return result;
    }
}