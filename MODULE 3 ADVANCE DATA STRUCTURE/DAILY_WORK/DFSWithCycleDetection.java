package poa;

import java.util.*;

public class DFSWithCycleDetection {
    // Method to perform DFS and detect cycles
    public static void dfs(Map<Integer, List<Integer>> graph, int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);
        boolean cycleDetected1=false;
        
        
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.println("Visited vertex: " + vertex);

                for (int neighbor : graph.get(vertex)) {
                	System.out.println("Exploring neighbor " + neighbor + " of node " + vertex);
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    } else {
                        // Cycle detected
                    	cycleDetected1=true;
                        System.out.println("Cycle detected: " + vertex + " -> " + neighbor);
                    }
                }
            }
        }
        if (!cycleDetected1) {
        	System.out.println("Cycle not detected");
        }
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        // Adding edges to the graph
        graph.put(0, Arrays.asList(1,2));
        graph.put(1, Arrays.asList(2));
        graph.put(2,Arrays.asList(0,3));
        graph.put(3, Arrays.asList(3));
        
        
       


        // Start DFS from vertex 0
        dfs(graph, 0);
    }
}