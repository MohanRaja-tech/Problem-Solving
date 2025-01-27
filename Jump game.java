class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int max_reach = nums[0];
        int last_index = nums.length-1;
        for(int i=1;max_reach >= i;i++){
            if(max_reach >= last_index){
                return true;
            }
            else{
                max_reach = Math.max(max_reach,nums[i]+i);
            }
        }
        return false;
        
    }
}
