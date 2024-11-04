class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int []new1 = new int[m+n];
        int i = 0;
        for(int start=0;start<m;start++){
            new1[i++] = nums1[start];

        }
        for(int j=0;j<n;j++){
            new1[i++] = nums2[j];

        }
        Arrays.sort(new1);
        if(new1.length % 2 == 1){
            return new1[new1.length/2];
        }
        else{
           int m1 = new1[new1.length/2-1];
           int m2 = new1[new1.length/2];
           return (float)(m1+m2)/2.0;
        }


        
        
    }
}
