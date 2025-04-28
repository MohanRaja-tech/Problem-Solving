class Solution {
    public int minimumLength(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(int num : map.values()){
            if(num%2 == 0){
                count += num-2;
            }
            else if(num%2 == 1){
                count += num-1;
            }
        }
        return s.length()-count;
    }
}
