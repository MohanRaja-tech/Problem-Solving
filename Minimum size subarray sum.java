class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int min_array = Integer.MAX_VALUE;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                min_array = Math.min(min_array,i-start+1);
                sum -= nums[start];
                start++; 
            }
    }
    if(min_array == Integer.MAX_VALUE){
        return 0;
    }
    else{
        return min_array;
    }

        
        
    }
}
