class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int width = j-i;
            int length = Math.min(height[i],height[j]);
            int area = width*length;
            max = Math.max(area,max);
            if(height[i] < height[j]){
                i++;
            }
            else
            {
                j--;

            }
        }
        return max;
    }
}