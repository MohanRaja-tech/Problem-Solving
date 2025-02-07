class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Map<Integer,Integer>  map = new HashMap<>();
        for(int i : nums){
            int freq = map.getOrDefault(i,0);
            if(freq >= lst.size()){
                lst.add(new ArrayList<>());
            }
            lst.get(freq).add(i); // accessing the row and adding element
            map.put(i,freq+1); 
        }
        return lst;
        
    }
}
