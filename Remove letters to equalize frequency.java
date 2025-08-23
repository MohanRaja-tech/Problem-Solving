

class Solution {
    public boolean equalFrequency(String word) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
            Set<Integer> set = new HashSet<>(map.values());
            if(set.size() == 1){
                return true;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return false;
    }
}
