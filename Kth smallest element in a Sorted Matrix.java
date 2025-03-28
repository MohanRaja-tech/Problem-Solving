class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] arr = new int[m*n];
        int index = 0;
        for(int[] row : matrix){
            for(int i : row){
                arr[index++] = i;
            }

        }
        Arrays.sort(arr);
        if(arr.length < k){
            return -1;
        }

        return arr[k-1];
           
    }
}
