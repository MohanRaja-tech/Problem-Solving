class Solution {
    public int helper(String target,String[] list2){
        for(int i=0;i<list2.length;i++){
            if(list2[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer,List<String>> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            int index = helper(list1[i],list2);
            if(index != -1){
                int sum = index+i;
                if(!map.containsKey(sum)){
                     map.put(sum,new ArrayList<>());
                     map.get(sum).add(list1[i]);
                }
                else{
                    map.get(sum).add(list1[i]);
                }
               
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num:map.keySet()){
            min = Math.min(num,min);
        }
        List<String> temp = map.get(min);
        String[] result = new String[temp.size()];
        int idx = 0;
        for(String s : temp){
            result[idx++] = s;
        }
        return result;
    }
}