class Solution {
    public int totalMoney(int n) {
        int prevmonday = 1;
        int profit = 0;
        int count = 1;
        for(int i=1;i<=n;i++){
            profit += count;
            if(i%7 == 0){
                count = prevmonday+1;
                prevmonday++;
            }
            else{
              
                count++;
            }
        }
        return profit;
    }
}