class Solution {
    public long maximumTripletValue(int[] nums) {
        long max_triplet = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long a = nums[i];
                    long b = nums[j];
                    long c = nums[k];
                    max_triplet = Math.max(max_triplet,(a-b)*c);                }
            }
        }
        return max_triplet;
    }
}
