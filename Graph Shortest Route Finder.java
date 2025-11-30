import java.io.*;
import java.util.*;

public class Solution {
    public static void helper(List<List<Integer>> graph,int start,int n){
        int[] dis = new int[n];
        Arrays.fill(dis,-1);
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dis[start] = 0;
        
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei:graph.get(node)){
                if(dis[nei] == -1){
                    dis[nei] = dis[node]+6;
                    q.offer(nei);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i != start) System.out.print(dis[i]+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<List<Integer>> graph = new ArrayList<>();
            for(int i=0;i<n;i++){
                graph.add(new ArrayList<>());
            }
            for(int i=0;i<m;i++){
                int u = sc.nextInt()-1;
                int v = sc.nextInt()-1;
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            int start = sc.nextInt()-1;
            helper(graph,start,n);
        }
    }
}
