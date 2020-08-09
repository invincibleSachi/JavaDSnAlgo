package com.complex.algo.graph;

public class ShortestPathWeightedGraph {
    public static void main(String[] args){
        WGMainShortestDistance dg=new WGMainShortestDistance();
        dg.addVertex("A");
        dg.addVertex("B");
        dg.addVertex("C");
        dg.addVertex("D");
        dg.addVertex("E");
        dg.addVertex("F");
        dg.addVertex("G");
        //dg.setVertex();
        dg.addEdges("A","C",4);
        dg.addEdges("A","B",2);
        dg.addEdges("A","D",6);
        dg.addEdges("B","D",8);
        dg.addEdges("C","D",2);
        dg.addEdges("C","E",3);
        dg.addEdges("C","F",1);
        dg.addEdges("D","E",9);
        dg.addEdges("E","F",3);
        dg.addEdges("E","G",4);
        dg.addEdges("G","D",5);
        dg.addEdges("F","G",7);
        dg.findShortestPaths("A");
    }
}
