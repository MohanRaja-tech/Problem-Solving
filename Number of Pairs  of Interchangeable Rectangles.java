class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Long> map = new HashMap<>();
        long count = 0;
        for(int[] rect : rectangles){
            double pair = (double)rect[0]/rect[1];
            count += map.getOrDefault(pair,0L);
            map.put(pair,map.getOrDefault(pair,0L)+1);
        }
        return count;
    }
}
