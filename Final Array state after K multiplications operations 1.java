class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        

        for(int i=0;i<k;i++){
            int minvalue = Integer.MAX_VALUE;
            int minindex = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < minvalue){
                    minvalue = nums[j];
                    minindex = j;
                }
            
            }
            nums[minindex] = nums[minindex] * multiplier;
        }
        return nums;
        
    }
}
