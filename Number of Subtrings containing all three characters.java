class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.getOrDefault('a',0) > 0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                count += s.length()-right;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
               
            }
            left++;
        }
      
        
    }
    return count;
}
}
