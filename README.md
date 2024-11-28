# Depth-First-Search (DFS) Example In Java
This code is an implementation of **Depth-First Search (DFS)** for a directed graph in Java.
DFS is a graph traversal algorithm that explores as far as possible along each branch before backtraking. This implementation uses recursion to perform the traversal.

## Features
- ***Graph Representation***
  - The graph is represented using the adjacency list for edge storage and traversal.
- ***DFS Algorithm**:
  - The algorithm starts at a specified vertix and traverses all connected vertices using recursive approach.
- ***Customizable Graph***:
    - The code allows users to define the number of vertices and edges to simulate different graph structures.
 
## The Implementation
1. ***Graph Initialisation***:
   - A graph is created with a specified number of vertices
   - An adjacency list is used to store edges between vertices
2. ***Adding Edges***:
   - The *addEdge(int source, int destination)* method is used to add a directed edge from the source vertex to the destinatin vertex.
3. ***Performing DFS***:
   - *The depthFirstSearch(int startVertex)* method initialises the traversal starting from the startVertex.
   - A recursive helper method *dfsUtil* ensures that all vertices connected to the current vertex ere visited.

## Methods:
1. *addEdge (int source, int destination)*: Adds a directed edge from sourse to destination
2. *depthFirstSearch(int startVetrex)*: Starts a DFS traversal from the given vertex
3. *dfsUtil(int vertex, boolean[] visited)*: Recursive helper function to visit vertexes.

## Key Concepts Demonstrated
1. ***Graph Representation***
   - An adjacency list is used for memory efficience
2. ***Depth-First Search***:
   - Recursive implementation for traversing graphs
3. ***Java Collections***:
   - Usage of ArrayList for managing adjacency lists
     

## Usage
Clone the repository and run it. The code in the main class can be modified to enter the nodes as the user input

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

## Contributing
Feel free to fork the repository and fix bugs, or enhance functionality.
