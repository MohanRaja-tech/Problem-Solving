class Solution { 
    public void fun(int[] nums,List<List<Integer>> result,int idx,List<Integer> temp){
        if(idx == nums.length){
            //System.out.println(new ArrayList<>(temp));
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        fun(nums,result,idx+1,temp);
        temp.remove(temp.size()-1);
        fun(nums,result,idx+1,temp);

        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        fun(nums,result,0,new ArrayList<>());
        return result;
    }
}