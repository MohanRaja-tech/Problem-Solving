// User function Template for Java

class Solution {
    int maxNtype(int arr[]) {
        // code here
        int[] nums = Arrays.copyOf(arr,arr.length);
        Arrays.sort(nums);
        boolean asc  = true;
        boolean desc = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != nums[i]){
                asc = false;
                break;
            }
        }
        int index = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] != arr[index++]){
                desc = false;
                break;
            }
        }
        if(asc){
            return 1;
        }
        if(desc){
            return 2;
        }
        int ascbreaks  = 0;
        int descbreaks = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]) ascbreaks++;
            if(arr[i-1] < arr[i]) descbreaks++;
        }
        if(ascbreaks == 1 && arr[0] > arr[arr.length-1]){
            return 4;
        }
        if(descbreaks == 1 && arr[0] < arr[arr.length-1]){
            return 3;
        }
        return -1;
    }
}
