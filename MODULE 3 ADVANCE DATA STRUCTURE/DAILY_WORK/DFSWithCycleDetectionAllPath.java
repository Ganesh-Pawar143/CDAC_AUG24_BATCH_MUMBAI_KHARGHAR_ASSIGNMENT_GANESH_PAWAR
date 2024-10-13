package poa;

 

import java.util.*;

public class DFSWithCycleDetectionAllPath {
    // Method to perform DFS and detect cycles
    public static void dfs(Map<Integer, List<Integer>> graph, int startVertex) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> currentPath = new ArrayList<>(); // To store current path
        stack.push(startVertex);
        boolean cycleDetected = false;

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                currentPath.add(vertex);  // Add the vertex to the current path
                System.out.println("Visited vertex: " + vertex);

                for (int neighbor : graph.get(vertex)) {
                    System.out.println("Exploring neighbor " + neighbor + " of node " + vertex);

                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    } else {
                     
                        cycleDetected = true;
                        System.out.println("Cycle detected at vertex " + vertex);
                        printCyclePath(currentPath, neighbor);
                    }
                }
            }
          
            currentPath.remove((Integer)vertex);
        }

        if (!cycleDetected) {
            System.out.println("No cycles detected.");
        }
    }

   
    public static void printCyclePath(List<Integer> currentPath, int cycleStartNode) {
        System.out.print("Cycle involves nodes: ");
        boolean cycleStarted = false;
        for (int node : currentPath) {
            // Start printing from the node where the cycle starts
            if (node == cycleStartNode) {
                cycleStarted = true;
            }
            if (cycleStarted) {
                System.out.print(node + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Adding edges to the graph
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(3));

        // Start DFS from vertex 0
        dfs(graph, 0);
    }
}
