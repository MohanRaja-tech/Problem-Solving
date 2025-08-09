class Solution {
    public int findCenter(int[][] edges) {
        int target = edges.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] row:edges){
            for(int num:row){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num) >= target){
                return num;
            }
        }
        return -1;
    }
}
