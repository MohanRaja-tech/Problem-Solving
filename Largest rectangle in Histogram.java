class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.add(i);
        }

        stack.clear();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n :  stack.peek();
            stack.add(i);
        }

        int max_area = 0;
        for(int i=0;i<n;i++){
            int width = right[i]-left[i]-1;
            int area = heights[i]*width;
            max_area = Math.max(area,max_area);
    }
    return max_area;
    }
}
