class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int result = Integer.MIN_VALUE;
        int min = arrays.get(0).get(0);
        int max  = arrays.get(0).get(arrays.get(0).size()-1);
        for(int i=1;i<arrays.size();i++){
            int currmin = arrays.get(i).get(0);
            int currmax = arrays.get(i).get(arrays.get(i).size()-1);

            int res1 = Math.abs(currmax-min);
            int res2 = Math.abs(currmin-max);
            result = Math.max(result,Math.max(res1,res2));

            min = Math.min(currmin,min);
            max = Math.max(currmax,max);
            
        }
        return result;
    }
}
