class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(int i:nums){
            if(map.get(i) == 1 && !map.containsKey(i+1) && !map.containsKey(i-1)){
                lst.add(i);
            }
        }
        return lst;
        
    }
}
