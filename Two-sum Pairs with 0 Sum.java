lass Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Set<ArrayList<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int check = 0-arr[i];
            if(map.containsKey(check)){
                ArrayList<Integer> lst = new ArrayList<>();
                int a = arr[i];
                int b = check;
                if(a < b){
                    lst.add(a);
                    lst.add(b);
                }
                else{
                    lst.add(b);
                    lst.add(a);
                }
                if(!set.contains(lst)){
                    set.add(lst);
                }
            }
            map.put(arr[i],i);
        }
        for(ArrayList<Integer> temp :set){
            result.add(temp);
        }
        result.sort((list1,list2) ->{
            if(!list1.get(0).equals(list2.get(0))){
                return list1.get(0)-list2.get(0);
            }
            else{
                return list1.get(1)-list2.get(1);
            }
        });
        return result; 
    }
}
