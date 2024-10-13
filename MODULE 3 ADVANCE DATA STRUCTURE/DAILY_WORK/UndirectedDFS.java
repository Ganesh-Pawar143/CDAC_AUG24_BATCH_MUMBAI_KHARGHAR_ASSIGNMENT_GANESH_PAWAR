package poa;

import java.util.ArrayList;
import java.util.List;

public class UndirectedDFS {
    private final int V; // Number of vertices
    private final List<List<Integer>> adj; // Adjacency list

    // Constructor
    public UndirectedDFS(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int source, int dest) {
        adj.get(source).add(dest);
        System.out.println("Added edge from " + source + " to " + dest);
        printAdjList();
    }

    // Print adjacency list
    private void printAdjList() {
        System.out.println("Current Adjacency List:");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Helper function for DFS
    private boolean isCyclicUtil(int i,List<List<Integer>> adj, boolean[] visited, int parent) {
        System.out.println("Visiting node " + i);
        
        visited[i] = true;       

        for (Integer neighbor : adj.get(i)) {
            System.out.println("Exploring neighbor " + neighbor + " of node " + i);
            if (!visited[neighbor]) {
            	if (isCyclicUtil(neighbor,adj, visited, i) ){
                    return true;
                }  	
             
            } else if (neighbor != parent) //// If an adjacent vertex is visited and // is not parent of current vertex,// then there exists a cycle in the graph.
                return true;     
            
        }
        return false;
    }

    // Function to detect cycle in the graph
    public boolean isCyclic() {
        // Mark all the vertices as not visited and not part of recursion stack
        boolean[] visited = new boolean[V];
       

        // Call the recursive helper function to detect cycle in different DFS trees
        for (int i = 0; i < V; i++) {
            System.out.println("Starting DFS from node " + i);
            if (!visited[i]) {
	            if (isCyclicUtil(i, adj ,visited, -1)) {
	                return true;
	            }
            }
        }

        return false;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        UndirectedDFS graph = new UndirectedDFS(3);
        graph.addEdge(1, 0);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(1, 2);

        if (graph.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}

