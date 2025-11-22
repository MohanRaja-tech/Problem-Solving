class Solution {
    public int helper(int num, boolean flag) {
        int count = 0;
        if (flag) {
            while (num % 3 != 0) {
                num += 1;
                count++;
            }
        } else {
            while (num % 3 != 0) {
                num -= 1;
                count++;
            }
        }
        return count;
    }

    public boolean satisfy(int[] nums) {
        for (int num : nums) {
            if (num % 3 != 0) {
                return false;
            }
        }
        return true;
    }

    public int minimumOperations(int[] nums) {
        int min = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) continue;

            int add = helper(nums[i], true);
            int sub = helper(nums[i], false);

            if (add <= sub) {
                nums[i] += add;
                min += add;
            } else {
                nums[i] -= sub;
                min += sub;
            }
        }

        return min;
    }
}
