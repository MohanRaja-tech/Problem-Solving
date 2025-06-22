class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
       if(n == 0){
            return 0;
       }
       if(n == 1){
        return nums[0];
       }
       if(n == 2){
        return Math.max(nums[0],nums[1]);
       }
       int[] dp1 = new int[n];
       int[] dp2 = new int[n];
       Arrays.fill(dp1,-1);
       Arrays.fill(dp2,-1);
       int cost1 = f(n-2,dp1,nums,0);
       int cost2 = f(n-1,dp2,nums,1);
       return Math.max(cost1,cost2);
    }
    public int f(int i,int[] dp,int[] nums,int start){
        
        if(i < start){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int pick = nums[i] + f(i-2,dp,nums,start);
        int notpick = f(i-1,dp,nums,start);
        dp[i] = Math.max(pick,notpick);
        return dp[i];
    }
}
