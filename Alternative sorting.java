// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        List<Integer> temp = new ArrayList<>();
        for(int num:arr){
            temp.add(num);
        }
        Collections.sort(temp);
        ArrayList<Integer> lst = new ArrayList<>();
        int start = 0;
        int end = temp.size()-1;
        while(start <= end){
            if(start != end){
                lst.add(temp.get(end));
                lst.add(temp.get(start));
                start++;
                end--;
            }
            else{
                lst.add(temp.get(start));
                break;
            }
        }
        return lst;
    }
}
