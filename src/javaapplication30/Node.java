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
public class Node {

    int id;
    List<Edge> neighbors;
    int distance; // Distance from the source node
    Node root; // Predecessor node in the shortest path

    public Node(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
        this.distance = Integer.MAX_VALUE; // Initially set to infinity
        this.root = null;
    }

    // Add a neighbor to this node
    public void addNeighbor(Edge edge) {
        neighbors.add(edge);
    }
}
