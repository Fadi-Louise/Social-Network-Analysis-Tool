# Bellman-Ford Algorithm Implementation

This repository contains a Java implementation of the Bellman-Ford algorithm, a graph algorithm that computes shortest paths from a source vertex to all other vertices in a weighted digraph.

## Overview

The Bellman-Ford algorithm is particularly useful because it can handle graphs with negative edge weights, unlike Dijkstra's algorithm. It also detects negative cycles in the graph, which are cycles whose edge weights sum to a negative value.

## Project Structure

The project consists of the following classes:

- **Node**: Represents a vertex in the graph with an ID, a list of neighboring edges, distance from the source, and a reference to the predecessor node.
- **Edge**: Represents a directed edge in the graph with source and destination nodes, and a weight.
- **Graph**: Represents a directed graph containing nodes and edges, with methods to add nodes and edges.
- **BellmanFordAlgorithm**: Implements the Bellman-Ford algorithm to find shortest paths from a source node to all other nodes.
- **JavaApplication30**: Contains the main method that demonstrates the algorithm's usage.

## How It Works

The Bellman-Ford algorithm works by repeatedly relaxing all edges in the graph, updating the distance of each vertex if a shorter path is found. After |V|-1 iterations (where |V| is the number of vertices), the algorithm checks for negative-weight cycles.

## Usage Example

```java
public class JavaApplication30 {
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        // Add nodes and edges here
        Node source = graph.getNode(0);
        
        BellmanFordAlgorithm bfa = new BellmanFordAlgorithm(graph);
        bfa.run(source);
        
        // Output shortest paths and distances
        bfa.printShortestPaths();
    }
}
```

## Features

- Finds shortest paths from a source node to all other nodes.
- Handles negative edge weights.
- Detects negative cycles in the graph.
- Returns a map of nodes to their shortest distance from the source.

## Requirements

- Java 8 or higher

## License

This project is available under the MIT License.

## Author

Created by Fadi Louise, 2024.
