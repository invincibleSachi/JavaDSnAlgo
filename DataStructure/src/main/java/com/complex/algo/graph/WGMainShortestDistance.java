package com.complex.algo.graph;

import com.complex.algo.aux.Edge;
import com.complex.algo.aux.WgVertex;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.LinkedList;
import java.util.Queue;

public class WGMainShortestDistance {
    public static final int MAX_VERTICES=30;
    public static final int INITIAL=0;
    public static final int TEMPORARY=1;
    public static final int FINALIZED=2;
    int n=0;
    int e=0;
    Edge[] edges;
    WgVertex[] vertices;

    WGMainShortestDistance(){
        edges=new Edge[MAX_VERTICES*(MAX_VERTICES-1)];
        vertices=new WgVertex[MAX_VERTICES];

    }

    public void addVertex(String name){
        WgVertex v=new WgVertex(name);
        v.setState(INITIAL);
        vertices[n++]=v;
    }

//    public void setVertex(){
//        int k=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                Edge e=new Edge();
//                e.setFrom(vertices[i]);
//                e.setTo(vertices[j]);
//                e.setDistance(Integer.MAX_VALUE);
//                if(i==j){
//                    e.setDistance(0);
//                }
//                edges[k++]=e;
//            }
//        }
//    }

    public int getIndex(String name){
        for(int i=0;i<vertices.length;i++){
            if(vertices[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void addEdges(String from, String to,int distance){
        int row=getIndex(from);
        int col=getIndex(to);
        if(row==-1){
            throw new IllegalReceiveException("from edge is not found "+from);
        }
        if(col==-1){
            throw new IllegalReceiveException("to edge is not found "+to);
        }
        Edge edge=new Edge();
        edge.setFrom(vertices[row]);
        edge.setTo(vertices[col]);
        edge.setDistance(distance);
        edges[e++]=edge;
    }

    public int getDistnace(String source, String dest){
        if(source.equals(dest)){
            return 0;
        }
        for(int i=0;i<e;i++){
            if(edges[i].getFrom().getName().equals(source) && edges[i].getTo().getName().equals(dest)){
                edges[i].setVisited(true);
                return edges[i].getDistance();
            }
        }
        return Integer.MAX_VALUE;
    }

    public boolean hasEdgeVisited(String source, String dest){
        if(source.equals(dest)){
            return true;
        }
        for(int i=0;i<e;i++){
            if(edges[i].getFrom().getName().equals(source) && edges[i].getTo().getName().equals(dest)){
                return edges[i].isVisited();
            }
        }
        return false;
    }

    public void findShortestPaths(String sourceVertex){
        Queue<WgVertex> q=new LinkedList<WgVertex>();
        int sourceVertexIndex=getIndex(sourceVertex);
        WgVertex v=vertices[sourceVertexIndex];
        v.setDistance(0);
        v.setState(FINALIZED);
        q.add(v);
        while(!q.isEmpty()){
            WgVertex wgVertex=q.remove();
            int wgIndex=getIndex(wgVertex.getName());
            System.out.println("removed "+wgVertex.getName());
            for(int i=0;i<n;i++){
                System.out.println(vertices[i].getName());
                if(hasEdgeVisited(wgVertex.getName(),vertices[i].getName())){
                    continue;
                }
                int distBetween2Points=getDistnace(wgVertex.getName(),vertices[i].getName());
                if(distBetween2Points!=Integer.MAX_VALUE && vertices[i].getState()!=FINALIZED && !vertices[i].getPredecessor().equals(wgVertex.getName())){
                    int distance=vertices[wgIndex].getDistance()+distBetween2Points;
                    if(distance<vertices[i].getDistance()){
                        vertices[i].setDistance(distance);
                        vertices[i].setPredecessor(wgVertex.getName());
                    }

                    q.add(vertices[i]);

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
