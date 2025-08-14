class Solution {
    public String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE;
        String maxstr = "";
        char[] arr = num.toCharArray();
        for(int i=0;i<arr.length-2;i++){
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
                String temp = "";
                temp += arr[i];
                temp += arr[i+1];
                temp += arr[i+2];
                
                int n = Integer.parseInt(temp);
                if(n > max){
                    max = n;
                    maxstr = temp;

                }
                
            }
        }
        return maxstr;
    }
}
