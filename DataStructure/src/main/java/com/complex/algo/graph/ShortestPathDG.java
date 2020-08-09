package com.complex.algo.graph;

import com.complex.algo.aux.Vertex;
import com.complex.algo.aux.Vertex1;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathDG {

    public static final int MAX_VERTICES=30;
    public static final int INITIAL=0;
    public static final int WAITING=1;
    public static final int VISITED=2;
    int n=0;
    int e;
    boolean [][] adj;
    Vertex1[] vertices;

    ShortestPathDG(){
        adj=new boolean[MAX_VERTICES][MAX_VERTICES];
        vertices=new Vertex1[MAX_VERTICES];
    }

    public void addVertex(String name){
        Vertex1 v=new Vertex1(name);
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

    public boolean isAdj(int vertexIndex, int index){
        return adj[vertexIndex][index];
    }

    public void findMinDistance(String vertex){
        int index=getIndex(vertex);
        Vertex1 v=vertices[index];
        Queue<Vertex1> q=new LinkedList<Vertex1>();
        v.setState(WAITING);
        System.out.println(" Visited "+v.getName());
        q.add(v);
        while(!q.isEmpty()){
            Vertex1 v1=q.remove();
            int vertexIndex=getIndex(v1.getName());
            v.setState(VISITED);
            for(int i=0;i<n;i++){
                if(isAdj(vertexIndex,i) && vertices[i].getState()==INITIAL){
                    q.add(vertices[i]);
                    vertices[i].setState(WAITING);
                    vertices[i].setPredecessor(v1.getName());
                    vertices[i].setDistance(v1.getDistance()+1);
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Name "+vertices[i].getName());
            System.out.println("Predecessor "+vertices[i].getPredecessor());
            System.out.println("Distance "+vertices[i].getDistance());
            System.out.println("State "+vertices[i].getState());
            System.out.println("======================== ");
        }
    }


}
