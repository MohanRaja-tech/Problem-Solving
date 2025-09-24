import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        fun(nums, 0, result, target, new ArrayList<>());
        return result;
    }

    public void fun(int[] nums, int idx, List<List<Integer>> result, int remain, List<Integer> temp) {
        if (remain == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (nums[i] > remain) break;

           
            if (i > idx && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]);
            fun(nums, i + 1, result, remain - nums[i], temp);
            temp.remove(temp.size() - 1);
        }
    }
}
