class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<List<Integer>,Integer> map = new HashMap<>();
        int count = 0;
        for(int[] row : dominoes){
            int a = row[0];
            int b = row[1];
            List<Integer> key = Arrays.asList(Math.min(a,b),Math.max(a,b));
            count += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}
