class Solution {
    public void helper1(int[] arr,int n){
        int range = (n/2);
        System.out.print(range);
        int count = 1;
        int idx = 0;
        while(idx < range){
            arr[idx++] = count;
            count++;
        }
        arr[idx++] = 0;
        count = 1;
        while(idx < n){
            arr[idx++] = -count;
            count++;
        }
    }
    public void helper2(int[] arr,int n){
        int range = (n/2)-1;
        int count = 1;
        int idx = 0;
        while(idx <= range) arr[idx++] = count++;
        count = 1;
        while(idx < n){
            arr[idx++] = -count;
            count++;
        }
    }
    public int[] sumZero(int n) {
        if(n == 1) return new int[]{0};
        boolean flag = n%2 == 1 ? true : false;
        int[] result = new int[n];
        if(flag) helper1(result,n);
        else helper2(result,n);
        return result;
    }
}