class Solution {
    public int[] findOrder(int numCourses, int[][] arr) {
        int[] result = new int[numCourses];
        int n = numCourses;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] row:arr){
            int u = row[0];
            int v = row[1];
            adj.get(v).add(u);
        }
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
            for(int neighbour:adj.get(i)){
                    indegree[neighbour]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                q.offer(i);
                count++;
            }
        }
        int index = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            result[index++] = node;
            
            for(int neighbour:adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    q.offer(neighbour);
                    count++;
                }
            }
        }
        if(count != n){
            return new int[]{};
        }
        return result;
    }
}