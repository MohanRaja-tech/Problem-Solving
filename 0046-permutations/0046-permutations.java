class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        fun(nums,0,result);
        return result;    
    }
    public void fun(int[] nums,int i,List<List<Integer>> result){
        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            result.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            fun(nums,i+1,result);
            swap(nums,i,j);
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}