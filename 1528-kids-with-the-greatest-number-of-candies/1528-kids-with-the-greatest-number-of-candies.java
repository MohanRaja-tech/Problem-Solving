class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst = new ArrayList<>();
        int add =  extraCandies;
        int max = 0;
        for(int num:candies){
            max = Math.max(num,max);    
        }
        for(int num:candies){
            int temp = num+add;
            if(temp > max || temp == max){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
        return lst;
    }
}