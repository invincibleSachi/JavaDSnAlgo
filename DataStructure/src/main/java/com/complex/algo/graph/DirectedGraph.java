package com.complex.algo.graph;


import com.complex.algo.aux.Vertex;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraph {
    public static final int MAX_VERTICES=30;
    public static final int INITIAL=0;
    public static final int WAITING=1;
    public static final int VISITED=1;
    int n=0;
    int e;
    boolean [][] adj;
    Vertex[] vertices;

    DirectedGraph(){
        adj=new boolean[MAX_VERTICES][MAX_VERTICES];
        vertices=new Vertex[MAX_VERTICES];
    }

    public void addVertex(String name){
        Vertex v=new Vertex(name);
        v.setState(INITIAL);
        vertices[n++]=v;
    }

    public int getIndex(String name){
        for(int i=0;i<vertices.length;i++){
            if(vertices[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void addEdges(String from, String to){
        int row=getIndex(from);
        int col=getIndex(to);
        if(row==-1){
            throw new IllegalReceiveException("from edge is not found "+from);
        }
        if(col==-1){
            throw new IllegalReceiveException("to edge is not found "+to);
        }
        adj[row][col]=true;
    }

    public void breadthFirstTraversal(String vertex){

        Queue<Vertex> q=new LinkedList<Vertex>();
        Vertex v=vertices[getIndex(vertex)];
        v.setState(WAITING);
        q.add(v);
        int vertexIndex=-1;
        while(!q.isEmpty()){
            v=q.remove();
            vertexIndex=getIndex(v.getName());
            System.out.println("Visited "+ v.getName());
            vertices[vertexIndex].setState(VISITED);
            for(int i=0;i<n;i++){
                if (isAdj(vertexIndex,i) && vertices[i].getState()==INITIAL){
                    q.add(vertices[i]);
                    vertices[i].setState(WAITING);
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Name "+vertices[i].getName());
            System.out.println("State "+vertices[i].getState());
        }

    }

    public boolean isAdj(int vertexIndex, int index){
        return adj[vertexIndex][index];
    }



}
