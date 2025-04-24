class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> distinct = new HashSet<>();
        for(int num : nums){
            distinct.add(num);
        }
        int totaldis = distinct.size();

        int count = 0;
        int left = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size() == totaldis){
                count +=  nums.length-right;
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return count;
    }
}
