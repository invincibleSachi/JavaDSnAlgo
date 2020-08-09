package com.complex.algo.graph;

public class GraphMainShortestDistance {
    public static void main(String[] args){
        ShortestPathDG dg=new ShortestPathDG();
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
        dg.findMinDistance("A");

    }
}
