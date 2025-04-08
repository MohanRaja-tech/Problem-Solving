class Solution {
    public boolean check_duplicate(List<Integer> lst){
        Set<Integer> set= new HashSet<>();
        for(int num : lst){
            if(!set.contains(num)){
                set.add(num);
            
            }
            else{
                return true;
            }
        }
        return false;
    }
    public int minimumOperations(int[] nums) {
       List<Integer> lst= new ArrayList<>();
       int count = 0;
       for(int num : nums){
            lst.add(num);
       }
       
       while(check_duplicate(lst)){
        if(lst.size() < 3){
            lst.clear();
        }
        else{
        lst.remove(0);
        lst.remove(0);
        lst.remove(0);
        
        }
        count++;
       }
        return count;
    }
}
