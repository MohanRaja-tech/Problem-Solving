class Solution {
    int maxLen(int arr[]) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == 0){
                maxlen = Math.max(maxlen,i+1);
            }
            else if(map.containsKey(sum)){
                maxlen = Math.max(maxlen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}
