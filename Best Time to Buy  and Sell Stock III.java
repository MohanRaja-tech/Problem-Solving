class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE;
        int profit1 = 0;
        int buy2 = Integer.MAX_VALUE;
        int profit2  = 0;
        for(int price : prices){
            buy1 = Math.min(buy1,price);
            int current_profit = price-buy1;
            profit1 = Math.max(profit1,current_profit);

            buy2 = Math.min(buy2,price-profit1);
            int current_profit2 = price - buy2;
            profit2 = Math.max(profit2,current_profit2);
        }
        return profit2;
    }
}
