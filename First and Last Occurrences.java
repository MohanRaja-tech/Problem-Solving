class GFG {
    int search(int[] nums,int target,boolean findfirst){
        int start = 0;
        int end = nums.length-1;
        int index= -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                index = mid;
                if(findfirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(nums[mid] > target){
                end= mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return index;
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        int first = search(arr,x,true);
        int last = search(arr,x,false);
        lst.add(first);
        lst.add(last);
        return lst;
        
    }
}
