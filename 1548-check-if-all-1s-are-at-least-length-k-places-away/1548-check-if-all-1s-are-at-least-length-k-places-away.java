class Solution {
    public boolean helper(int index,int k,int[] nums){
        int count = 0;
        for(int i=index+1;i<nums.length;i++){
            if(count >= k){
                return true;
            }
            if(count < k && nums[i] == 1){
                return false;
            }
            if(nums[i] == 0){
                count++;
            }
        }
        if(nums[nums.length-1] == 0) return true;
        return false;
    }
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1 && i != nums.length-1){
                if(!helper(i,k,nums)){
                    return false;
                }
            }
            
        }
        return true;
    }
}