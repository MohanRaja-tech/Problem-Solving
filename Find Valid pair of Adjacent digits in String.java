class Solution {
    public String findValidPair(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            int freq = s.charAt(i)-'0';
            int freq2 = s.charAt(i+1)-'0';
            if(s.charAt(i) != s.charAt(i+1)){
                if(freq == map.get(s.charAt(i)) && freq2 == map.get(s.charAt(i+1))){
                    sb.append(s.charAt(i));
                    sb.append(s.charAt(i+1));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
