class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return f(n-1,dp,nums);
    }
    public int f(int i,int[] dp,int[] nums){
        if(i < 0){
            return 0;
        }
        if(i == 0){
            return nums[i];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + f(i-2,dp,nums);
        int notpick = f(i-1,dp,nums);

        int profit = Math.max(pick,notpick);
        dp[i] = profit;
        return dp[i];
        
    }
}
