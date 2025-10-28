class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int[] freq = new int[max-min+1];
        for(int num:arr){
            freq[num-min]++;
        }
        Set<Integer> set = new HashSet<>();
        for(int num:freq){
            if(num == 0) continue;
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
    return true;
    }
}