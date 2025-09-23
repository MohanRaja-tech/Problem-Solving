class Solution {
    public void fun(int[] nums,List<List<Integer>> result,int idx,List<Integer> temp,int k){
        if(temp.size() == k){
            //System.out.println(new ArrayList<>(temp));
            result.add(new ArrayList<>(temp));
            return;
        }
        if(idx>nums.length-1)return;
        temp.add(nums[idx]);
        fun(nums,result,idx+1,temp,k);
        temp.remove(temp.size()-1);
        fun(nums,result,idx+1,temp,k);

        
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i=1;i<=n;i++){
            nums[i-1] = i;
        }
        List<List<Integer>> result = new ArrayList<>();
        fun(nums,result,0,new ArrayList<>(),k);
        return result;
    }
}
