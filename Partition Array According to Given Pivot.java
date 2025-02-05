class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] dp = new int[nums.length];
        int less = 0;
        int equal = 0;
        int great = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] < pivot){
                    dp[less] = nums[i];
                    less++;
                }

            }
            equal = less;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == pivot){
                    dp[equal] = nums[i];
                    equal++;
                }
            }
            great = equal;
            for(int i=0;i<nums.length;i++){
                if(nums[i] > pivot){
                    dp[great] = nums[i];
                    great++;
                }
            }
    return dp;

        
        
    }
}
