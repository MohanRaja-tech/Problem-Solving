// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> lst = new ArrayList<>(map.keySet());
        Collections.sort(lst, (a,b) -> map.get(b)-map.get(a));
        //System.out.println(lst);
        Map<Integer,ArrayList<Integer>> freq = new HashMap<>();
        for(int num:lst){
            if(freq.containsKey(map.get(num))){
                freq.get(map.get(num)).add(num);
            }
            else{
                freq.put(map.get(num),new ArrayList<>());
                freq.get(map.get(num)).add(num);
            }
        }
        //System.out.println(freq);
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>(freq.keySet());
        Collections.sort(temp,Collections.reverseOrder());
        for(int num:temp){
            ArrayList<Integer> temp1 = freq.get(num);
            Collections.sort(temp1);
            for(int num1 : temp1){
                for(int i=0;i<map.get(num1);i++){
                    result.add(num1);
                }
            }
            
        }
        return result;
    }
}
