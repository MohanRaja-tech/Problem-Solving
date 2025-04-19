class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,int[]> indexmap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(!indexmap.containsKey(nums[i])){
                indexmap.put(nums[i],new int[]{i,i});
            }
            else{
                indexmap.get(nums[i])[1] = i;
            }
        }
        int max_freq = 0;
        for(int num : nums){
            if(map.get(num) > max_freq){
                max_freq = map.get(num);
            }
        }
        int result = Integer.MAX_VALUE;
        for(int num : map.keySet()){
            if(map.get(num) == max_freq){
                int[] indices = indexmap.get(num);
                int length = indices[1] - indices[0] + 1;
                result = Math.min(result,length);
            }
        }
        return result;
    }
}
