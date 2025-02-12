class Solution {
    public int digitsum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            int sum = digitsum(i);
            if(map.containsKey(sum)){
                max = Math.max(max,map.get(sum)+i);
            }
            map.put(sum,Math.max(map.getOrDefault(sum,-1),i));
        }
        return max;
        
    }
}
