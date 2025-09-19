class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 1;
        int[] dp = new int[nums.length];
        int n = nums.length;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    max = Math.max(max,dp[i]);
                }
            }
        }
        return max;
    }
}
