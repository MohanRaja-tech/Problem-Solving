class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int V =  numCourses;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            
        }
        int[] indegree = new int[V];
        for(int u=0;u<V;u++){
            for(int v:adj.get(u)){
                indegree[v]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            set.add(node);
            for(int adjacent:adj.get(node)){
                indegree[adjacent]--;
                if(indegree[adjacent] == 0){
                    q.offer(adjacent);
                }
            }

        }
    return set.size() == V;
    }
}