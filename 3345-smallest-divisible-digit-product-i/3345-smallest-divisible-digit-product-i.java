class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (digitSum(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    private int digitSum(int num) {
        int sum = 1;
        while (num > 0) {
            sum *= num % 10;
            num /= 10;
        }
        return sum;
    }
}