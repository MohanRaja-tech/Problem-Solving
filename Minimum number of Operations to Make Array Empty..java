class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map  = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
     int min_op = 0;
    for(int a : map.keySet()){
        int b = map.get(a);
        if(b < 2){
            return -1;
        }
        if(b % 3 == 0){
         min_op += (b/3);
        }
        else{
            min_op += (b/3)+1;
        }
    }
    return min_op;
    }
}
