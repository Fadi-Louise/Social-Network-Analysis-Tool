/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class Graph {

    List<Node> nodes;
    List<Edge> edges; // List to store all edges in the graph

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    // Add a node to the graph
    public void addNode(Node node) {
        nodes.add(node);
    }

    // Add an edge to the graph
    public void addEdge(Node source, Node destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
        source.addNeighbor(edge); // Add edge to source node's neighbors
    }

    // Getter method for nodes
    public List<Node> getNodes() {
        return nodes;
    }
}
