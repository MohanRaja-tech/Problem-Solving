class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> lst  = new ArrayList<>();
                if(sum == 0){
                    lst.add(nums[i]);
                    lst.add(nums[j]);
                    lst.add(nums[k]);
                    j++;
                    k--;
                    result.add(lst);
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        return new ArrayList<List<Integer>>(result);
        
    }
}
