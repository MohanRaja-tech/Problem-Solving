class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char result = 'a';
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0){
                result = ch;
                break;
            }
            map.put(ch,map.get(ch)-1);
        }
        return result;
    }

}
