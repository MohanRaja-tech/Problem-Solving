class Solution {
    public int getWinner(int[] arr, int k) {
    Queue<Integer> queue = new LinkedList<>();
    int max= arr[0];
    for(int i=1;i<arr.length;i++){
        queue.offer(arr[i]);
        max = Math.max(max,arr[i]);
    }
    int curr = arr[0];
    int winstreak= 0;
    while(!queue.isEmpty()){
        int opponent = queue.poll();
        if(curr > opponent){
            queue.offer(opponent);
            winstreak++;
        }
        else{
            queue.offer(curr);
            curr = opponent;
            winstreak = 1;
        }
        if(winstreak == k || curr == max){
            return curr;
        }
    }
    return -1;        
    }
}
