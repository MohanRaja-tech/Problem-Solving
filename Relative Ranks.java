class Solution {
    public int[] sortdesc(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j]  = temp;
                }
            }
            
        }
        return nums;
    }
    public String[] findRelativeRanks(int[] score) {
        int[] temp = new int[score.length];
        int index = 0;
        for(int num : score){
            temp[index++] = num;
        }
        sortdesc(temp);
        int count = 4;
        Map<Integer,String> map = new  HashMap<>();
        for(int i=0;i<temp.length;i++){
           if(i == 0){
            map.put(temp[i],"Gold Medal"); 
           }
           else if(i == 1){
            map.put(temp[i],"Silver Medal");
           }        
           else if(i == 2){
                map.put(temp[i],"Bronze Medal");
            }
            else{
                map.put(temp[i],Integer.toString(count));
                count++;
            }
        }
        String[] result = new String[score.length];
        for(int i=0;i<score.length;i++){
            result[i] = map.get(score[i]);
        }
        return result;
    }
}
