class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for(int num:nums){
            total += num;
        }
        List<Integer> result = new ArrayList<>();
        int  currsum = 0;
        for(int i=nums.length-1;i>=0;i--){
            currsum += nums[i];
            result.add(nums[i]);
            if(currsum > total-currsum){
                break;
            }
        }
        return result;
    }
}
