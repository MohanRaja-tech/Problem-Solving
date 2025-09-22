class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int num:stones){
            sum += num;
        }
        int target = sum/2;
        boolean[] dp = new boolean[target+1];
        Arrays.fill(dp,false);
        dp[0] = true;
        for(int num:stones){
            for(int i=target;i>=num;i--){
                dp[i] = dp[i] || dp[i-num];
            }
        }
        for(int i=target;i>=0;i--){
            if(dp[i]){
                return sum - (2*i);
            }
        }
        return 0;
    }
}