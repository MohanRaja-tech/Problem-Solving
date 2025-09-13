class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int con = 0;
        int vow = 0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vow = Math.max(vow,map.get(ch));
            }
            else{
                con = Math.max(con,map.get(ch));
            }
        }
        return vow+con;
    }
}
