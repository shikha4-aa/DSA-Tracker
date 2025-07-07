//Link: https://www.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1
//Problem:Your task is to determine whether it is possible to color the graph using at most m different colors such that no two adjacent vertices share the same color.

class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        int graph[][] = new int[v][v];
        
        for(int[] edge: edges){
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }
        
        int[] colors = new int[v];
        
        return solve(0, graph, colors, v, m);
    }
    
    
    private boolean solve(int node, int[][] graph, int[] colors, int v, int m){
        if(node== v){
            return true;
        }
        
        
        for(int c = 1; c<=m; c++){
            if(isSafe(node,graph, colors, v, c)){
                colors[node] = c;
                
                if(solve(node+1, graph, colors, v, m)) return true;
                
                colors[node] = 0; //backtrack
            }
        }
        return false;
    }
    
    private boolean isSafe(int node, int[][] graph, int[] colors, int v, int c){
        for(int i = 0; i<v; i++){
            if(graph[node][i] == 1 && colors[i]== c) return false;
        }
        return true;
    }
}





