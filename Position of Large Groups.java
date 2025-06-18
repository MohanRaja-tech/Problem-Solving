class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lst = new ArrayList<>();
        int count  = 1;
        int start_index = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                if(count >= 3){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start_index);
                    temp.add(i);
                    lst.add(temp);
                }
                start_index  = i+1;
                count = 1;
            }
        }
        if(count >= 3){
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(start_index);
            temp1.add(arr.length-1);
            lst.add(temp1);
        }
        return lst;
    }
}
