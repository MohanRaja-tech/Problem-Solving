class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        fun(nums,0,result,set);
        return result;
    }
    public void fun(int[] nums,int i,List<List<Integer>> result,Set<List<Integer>> set){
        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            //Collections.sort(temp);
            if(!set.contains(temp)){
                result.add(temp);
                set.add(temp);
            }
        }
        for(int j=i;j<nums.length;j++){
            swap(i,j,nums);
            fun(nums,i+1,result,set);
            swap(i,j,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}