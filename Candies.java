class Solution {
    public int candy(int[] ratings) {
        int[] candies=  new int[ratings.length];
        int n = ratings.length;
        int count = 0;
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                int temp = candies[i];
                if(temp > candies[i+1]){
                    continue;
                }
                else{
                    candies[i] = candies[i+1]+1;
                }
            }
        }
        for(int num:candies){
            count += num;
        }
        return count;
    }
}
