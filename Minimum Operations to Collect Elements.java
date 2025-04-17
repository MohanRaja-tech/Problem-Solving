class Solution {
    public int minOperations(List<Integer> nums, int k) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> target = new ArrayList<>();
        for(int i=1;i<=k;i++){
            target.add(i);
        } 
        int result = 0;
       
        for(int i=nums.size()-1;i>=0;i--){
            lst.add(nums.get(i));
            result++;
            boolean allfound = true;
            for(int j : target){
                if(!lst.contains(j)){
                    allfound = false;
                    break;
                }
            }
                if(allfound){
                    break;
                }
            
        
        }   
        return result;
    }

}
