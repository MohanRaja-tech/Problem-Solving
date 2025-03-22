class Solution {
    public boolean find132pattern(int[] nums) {
        int max_value = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){

            if(nums[i] < max_value){
                return true;
            }

            while(!stack.isEmpty() && stack.peek() < nums[i]){
                max_value = stack.pop();

            }

            stack.push(nums[i]);
        }
        return false;
    }
}
