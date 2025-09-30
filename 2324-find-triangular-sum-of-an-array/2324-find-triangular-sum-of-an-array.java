import java.util.*;

class Solution {
    public int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        List<Integer> lst = new ArrayList<>();
        while (arr.size() > 1) {
            for (int i = 1; i < arr.size(); i++) {
                int sum = (arr.get(i - 1) + arr.get(i)) % 10; 
                lst.add(sum);
            }
            arr = new ArrayList<>(lst); 
            lst.clear(); 
        }
        return arr.get(0); 
    }
}
