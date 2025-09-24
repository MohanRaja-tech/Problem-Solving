class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        fun(1,n,k,result,set,new ArrayList<>());
        return result;
    }

    public void fun(int start,int remain,int k,List<List<Integer>> result,Set<Integer> set,List<Integer> temp){
        if(temp.size() == k && remain == 0){
            result.add(new ArrayList<>(temp));
            set.clear();
            return;
        }
        for(int i=start;i<=9;i++){
            if(i > remain){
                break;
            }
            if(!set.contains(i)){
                temp.add(i);
                set.add(i);
                fun(i+1,remain-i,k,result,set,temp);
                temp.remove(temp.size()-1);
                set.remove(i);
            }
            
            
        }
    }
}
