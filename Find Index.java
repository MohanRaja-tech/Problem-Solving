class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        int target = key;
        int first = -1;
        int second = -1;
        boolean flag1 = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (flag1) {
                    first = i;
                    flag1 = false;
                }
                second = i; 
            }
        }

        if (first == -1) {
            return new int[]{-1, -1};
        } else if (second == -1) {
            return new int[]{first, first};
        } else {
            return new int[]{first, second};
        }
    }
}
