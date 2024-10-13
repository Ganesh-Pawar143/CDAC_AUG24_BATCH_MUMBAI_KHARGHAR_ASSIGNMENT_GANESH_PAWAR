package poa;

import java.util.*;

public class DFSDIRECTEDCHAR {
    // Method to perform DFS and detect cycles
    public static void dfs(Map<Character, List<Character>> graph, char startVertex) {
        Set<Character> visited = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            char vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.println("Visited vertex: " + vertex);

                for (char neighbor : graph.get(vertex)) {
                	System.out.println("Exploring neighbor " + neighbor + " of node " + vertex);
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    } else {
                        // Cycle detected
                        System.out.println("Cycle detected: " + vertex + " -> " + neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Character, List<Character>> graph = new HashMap<>();
        
        // Adding edges to the graph
        graph.put('A', Arrays.asList('B','C'));
        graph.put('B', Arrays.asList('C'));
        graph.put('C',Arrays.asList('A','C'));
        graph.put('D', Arrays.asList('C'));
        
        
       


        // Start DFS from vertex 0
        dfs(graph, 'A');
    }
}