package com.complex.algo.graph;

public class GraphMain {
    public static void main(String[] args){
        DirectedGraph dg=new DirectedGraph();
        dg.addVertex("A");
        dg.addVertex("B");
        dg.addVertex("C");
        dg.addVertex("D");
        dg.addVertex("E");
        dg.addVertex("F");
        dg.addVertex("G");
        dg.addEdges("A","C");
        dg.addEdges("A","B");
        dg.addEdges("A","D");
        dg.addEdges("B","D");
        dg.addEdges("C","D");
        dg.addEdges("C","E");
        dg.addEdges("C","F");
        dg.addEdges("D","E");
        dg.addEdges("E","F");
        dg.addEdges("E","G");
        dg.addEdges("G","D");
        dg.addEdges("F","G");
        dg.breadthFirstTraversal("G");
    }
}
