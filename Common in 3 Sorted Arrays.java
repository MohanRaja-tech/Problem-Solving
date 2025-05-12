class Solution {
    // Function to find common elements in three arrays.
    public boolean search(List<Integer> lst,int target){
        
        int start = 0;
        int end= lst.size()-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(lst.get(mid) == target){
                return true;
            }
            else if(lst.get(mid) > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
        
    }
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> result = new ArrayList<>();
        Set<Integer> set  = new HashSet<>();
        for(int num : arr1){
            if(search(arr2,num) && search(arr3,num) && !set.contains(num)){
                result.add(num);
                set.add(num);
            }
        }
        return result;
    }
}
