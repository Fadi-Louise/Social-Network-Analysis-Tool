/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Map;

/**
 *
 * @author asus
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a graph
        Graph graph = new Graph();

        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        // Add edges to the graph
        graph.addEdge(nodeA, nodeB, 5);
        graph.addEdge(nodeA, nodeC, 3);
        graph.addEdge(nodeB, nodeD, 6);
        graph.addEdge(nodeC, nodeD, -2); // Negative edge weight

        // Create an instance of BellmanFordAlgorithm
        BellmanFordAlgorithm bellmanFordAlgorithm = new BellmanFordAlgorithm();

        // Calculate shortest paths from nodeA
        Map<Node, Integer> shortestDistancesFromA
                = bellmanFordAlgorithm.shortestPaths(graph, nodeA);

        // Print shortest distances
        for (Node node : shortestDistancesFromA.keySet()) {
            System.out.println("Shortest distance from Node A to Node "
                    + node.id + ": "
                    + shortestDistancesFromA.get(node));
        }
    }
}
