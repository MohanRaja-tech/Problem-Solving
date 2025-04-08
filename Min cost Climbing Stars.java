class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        int result = 0;
        for(int i=2;i<cost.length;i++){
            result = cost[i] + Math.min(first,second);
            first = second;
            second = result;
        }
        return Math.min(first,second);
    }
}
