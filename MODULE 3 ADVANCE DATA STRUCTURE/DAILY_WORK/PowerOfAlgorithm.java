package poa;

import java.util.ArrayList;
import java.util.List;

public class PowerOfAlgorithm {
    private final int V; // Number of vertices
    private final List<List<Integer>> adj; // Adjacency list

    // Constructor
    public PowerOfAlgorithm(int V) {
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
    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
        System.out.println("Visiting node " + i);
        System.out.println("Visited array: " + java.util.Arrays.toString(visited));
        System.out.println("Recursion stack: " + java.util.Arrays.toString(recStack));

        // If the current node is already in the recursion stack, we have a cycle
        if (recStack[i]) {
            System.out.println("Cycle detected at node " + i);
            return true;
        }

        // If it is already visited, no need to explore again
        if (visited[i]) {
            return false;
        }

        // Mark the current node as visited and add to recursion stack
        visited[i] = true;
        recStack[i] = true;

        // Recur for all the vertices adjacent to this vertex
        for (Integer neighbor : adj.get(i)) {
            System.out.println("Exploring neighbor " + neighbor + " of node " + i);
            if (isCyclicUtil(neighbor, visited, recStack)) {
                return true;
            }
        }

        // Remove the vertex from recursion stack
        recStack[i] = false;
        System.out.println("Backtracking from node " + i);
        System.out.println("Updated Recursion stack: " + java.util.Arrays.toString(recStack));
        return false;
    }

    // Function to detect cycle in the graph
    public boolean isCyclic() {
        // Mark all the vertices as not visited and not part of recursion stack
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        // Call the recursive helper function to detect cycle in different DFS trees
        for (int i = 0; i < V; i++) {
            System.out.println("Starting DFS from node " + i);
            if (isCyclicUtil(i, visited, recStack)) {
                return true;
            }
        }

        return false;
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        PowerOfAlgorithm graph = new PowerOfAlgorithm(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        if (graph.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}
