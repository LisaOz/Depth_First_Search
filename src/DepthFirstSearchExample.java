/*
 * DFS is a graph traversal algorithm that explores as far as possible along each branch 
 * before backtracking. It uses a stack (explicitly or via recursion) to keep track 
 * of vertices to visit next.
 */
import java.util.*;
 
// Class to represent a graph for DFS
class Graph13 {
    private int vertices; // Number of vertices
    private ArrayList<ArrayList<Integer>> adjacencyList; // Adjacency list
 
    // Constructor to initialise the graph
    public Graph13(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }
 
    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }
 
    // Method to perform Depth-First Search
    public void depthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[vertices]; // To track visited vertices
        System.out.println("Depth-First Search starting from vertex " + startVertex + ":");
        dfsUtil(startVertex, visited);
    }
 
    // Recursive utility helper function for DFS
    private void dfsUtil(int vertex, boolean[] visited) {
        
        visited[vertex] = true; // Mark the current vertex as visited
        System.out.print(vertex + " ");
 
        // Recursion for all adjacent vertices
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}
 
// Main class to demonstrate DFS
public class DepthFirstSearchExample {
    public static void main(String[] args) {
        // Create a graph with 6 vertices
        Graph13 graph = new Graph13(6);
 
        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
 
        // Perform Depth-First Search starting from vertex 0
        graph.depthFirstSearch(0);
    }
}
 