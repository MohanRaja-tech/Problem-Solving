class Solution {
    public int f(int i,int[] dp,int[] nums){
        if(i < 0){
            return 0;
        }
        if(i == 0){
            return nums[0];
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + f(i-2,dp,nums);
        int notpick = f(i-1,dp,nums);
        int profit = Math.max(pick,notpick);
        dp[i] = Math.max(dp[i],profit);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[n-1];
        }
        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int profit1 = f(n-2,dp1,nums);

        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int[] newnums = Arrays.copyOfRange(nums,1,n);
        int profit2 = f(n-2,dp2,newnums);

        return Math.max(profit1,profit2);

    }
}