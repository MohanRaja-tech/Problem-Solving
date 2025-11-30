
import java.util.*;

public class Solution {
    public static  boolean helper(List<List<Integer>> graph,int start,int n){
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vis[start] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei:graph.get(node)){
                if(!vis[nei]){
                    vis[nei] = true;
                    q.offer(nei);
                }
            }
        }
       for(boolean flag:vis){
           if(!flag){
               return false;
           }
       }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        List<List<Integer>> rgraph = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            rgraph.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            graph.get(u).add(v);
            rgraph.get(v).add(u);       
        }
        if(!helper(graph,0,n)){
            System.out.println("The road network is not connected.");
            return;
        }
        if(!helper(rgraph,0,n)){
            System.out.println("The road network is not connected.");
            return;
        }
        System.out.println("The road network is connected.");
    }
}
