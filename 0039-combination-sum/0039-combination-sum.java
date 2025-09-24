import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates, 0, result, target, new ArrayList<>());
        return result;
    }

    public void fun(int[] nums, int idx, List<List<Integer>> result, int target, List<Integer> temp) {
        int sum = Sum(temp);
        if (sum > target) {
            return;
        }

        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return; 
        }
        if (idx == nums.length) {
            return;
        }

        temp.add(nums[idx]);
        fun(nums, idx, result, target, temp);
        temp.remove(temp.size() - 1);
        fun(nums, idx + 1, result, target, temp);
    }

    public int Sum(List<Integer> lst) {
        int sum = 0;
        for (int num : lst) {
            sum += num;
        }
        return sum;
    }
}
