class Solution {
    public int lfind(int start,int end,int[] nums){
        int sum = 0;
        for(int i=start;i>=end;i--){
            sum += nums[i];
        }
        return sum;
    }
    public int rfind(int start,int end,int[] nums){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum += nums[i];
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int lsum = lfind(i-1,0,nums);
            int rsum = rfind(i+1,nums.length-1,nums);
            if(i == 0){
                if(0 == rsum){
                    return i;
                }
            }
            if(lsum == rsum){
                return i;
            }
        }
        return -1;
    }
}