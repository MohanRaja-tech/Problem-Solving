class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length % 3 != 0){
            return new int[0][0];
        }
        Arrays.sort(nums);
        int[] [] res = new int[nums.length/3][3];
        for(int i=0;i<nums.length-2;i+=3){
          if(nums[i+2] - nums[i] > k){
            return new int[0][0];
          }
           
        }
        int index = 0;
        for(int i=0;i<nums.length/3;i++){
            for(int j=0;j<3;j++){
                res[i][j] = nums[index];
                index++;
            }
            
    }
    return res;
        
    }
}
