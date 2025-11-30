class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        long[] dist = new long[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        for(int i=0;i<=k;i++){
            long[] temp = Arrays.copyOf(dist,n);
            
            for(int[] flight : flights){
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];
                if(dist[from] != Integer.MAX_VALUE){
                    if(dist[from]+price < temp[to]){
                        temp[to] = dist[from]+price;
                    }
                }
            }
            dist = temp;
    }
        return dist[dst] == Integer.MAX_VALUE ? -1 : (int)dist[dst];
    }
}