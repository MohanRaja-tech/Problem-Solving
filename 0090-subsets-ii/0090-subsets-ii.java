class Solution {
    public void fun(int[] nums,List<List<Integer>> result,Set<List<Integer>> set,int idx,List<Integer> temp){
        if(idx == nums.length){
            List<Integer> lst = new ArrayList<>(temp);
            Collections.sort(lst);
            if(!set.contains(lst)){
                result.add(new ArrayList<>(temp));
                set.add(new ArrayList<>(lst));
            }
            return;
        }
        temp.add(nums[idx]);
        fun(nums,result,set,idx+1,temp);
        temp.remove(temp.size()-1);
        fun(nums,result,set,idx+1,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        fun(nums,result,set,0,new ArrayList<>());
        //List<List<Integer>> lst = new ArrayList<>();
        return result;

    }
}