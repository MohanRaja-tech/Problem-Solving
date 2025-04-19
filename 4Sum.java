class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = n-1;
                while(left < right){
                    long sum = (long) nums[i]+ nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        List<Integer> lst = new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[left]);
                        lst.add(nums[right]);
                        set.add(lst);
                        while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                    }
                    else if(sum > target){
                        right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    
                }
            }
        }
        for(List<Integer> elements : set){
            result.add(elements);
        }
        return result;
    }
}
