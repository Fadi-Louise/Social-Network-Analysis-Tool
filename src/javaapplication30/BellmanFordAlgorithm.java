/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asus
 */
public class BellmanFordAlgorithm {

    // Method to calculate the shortest paths from a source node to all other nodes in the graph
    public Map<Node, Integer> shortestPaths(Graph graph, Node source) {
        // Map to store the shortest distances from the source node to all other nodes
        Map<Node, Integer> shortestDistances = new HashMap<>();

        // Initialize the distances of all nodes to infinity except for the source node
        for (int i = 0; i < graph.getNodes().size(); i++) {
            Node node = graph.getNodes().get(i);
            node.distance = Integer.MAX_VALUE;
        }
        source.distance = 0;

        // Relax all edges |V| - 1 times
        for (int i = 0; i < graph.getNodes().size() - 1; i++) {
            for (int j = 0; j < graph.edges.size(); j++) {
                Edge edge = graph.edges.get(j);
                Node u = edge.source;
                Node v = edge.destination;
                int weight = edge.weight;
                if (u.distance != Integer.MAX_VALUE && u.distance + weight < v.distance) {
                    v.distance = u.distance + weight;
                    v.root = u;
                }
            }
        }

        // Check for negative cycles
        for (int i = 0; i < graph.edges.size(); i++) {
            Edge edge = graph.edges.get(i);
            Node u = edge.source;
            Node v = edge.destination;
            int weight = edge.weight;
            if (u.distance != Integer.MAX_VALUE && u.distance + weight < v.distance) {
                // Negative cycle found
                System.out.println("Graph contains negative cycle");
                return null;
            }
        }

        // Extract shortest distances from the graph
        for (int i = 0; i < graph.getNodes().size(); i++) {
            Node node = graph.getNodes().get(i);
            shortestDistances.put(node, node.distance);
        }

        return shortestDistances;
    }
}
