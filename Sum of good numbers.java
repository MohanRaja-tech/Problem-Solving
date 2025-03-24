class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = 0;

            if (i - k >= 0) {
                left = nums[i - k];
            }
            if (i + k < n) {
                right = nums[i + k];
            }

            if (nums[i] > left && nums[i] > right) {
                total += nums[i];
            }
        }

        return total;
    }
}
