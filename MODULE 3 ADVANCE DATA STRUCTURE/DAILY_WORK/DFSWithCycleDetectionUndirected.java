package poa;

import java.util.*;

public class DFSWithCycleDetectionUndirected {
    // Method to perform DFS and detect cycles in an undirected graph
    public static void dfs(Map<Integer, List<Integer>> graph, int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(startVertex, -1));  // -1 indicates no parent for the root node
        boolean cycleDetected=false;
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            int vertex = pair.vertex;
            int parent = pair.parent;
            
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.println("Visited vertex: " + vertex);

                for (int neighbor : graph.get(vertex)) {
                	System.out.println("Exploring neighbor " + neighbor + " of node " + vertex);
                    if (!visited.contains(neighbor)) {
                        stack.push(new Pair(neighbor, vertex));
                    } else if (neighbor != parent) {
                        // Cycle detected since neighbor is visited and it's not the parent
                    	cycleDetected = true;
                        System.out.println("Cycle detected: " + vertex + " -> " + neighbor);
                    }
                }
            }
            
        }
        if (!cycleDetected) {
        	System.out.println("Cycle not detected");
        }
        
    }

    // Helper class to keep track of vertex and its parent in the stack
    static class Pair {
        int vertex;
        int parent;

        Pair(int vertex, int parent) {
            this.vertex = vertex;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        // Adding edges to the undirected graph
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 2));
        graph.put(2, Arrays.asList(0, 1, 3));
        graph.put(3, Arrays.asList(2));

        // Start DFS from vertex 0
        dfs(graph, 0);
    }
}