class Solution {
    public int[] getSneakyNumbers(int[] nums) { 
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            max = Math.max(max,num);
        }
        int[] freq  = new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        
        int[] result = new int[2];
        int idx = 0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(freq[num] == 2 && !set.contains(num)){
                result[idx++] =  num;
                set.add(num);
            }
        }
        return result;
    }
}