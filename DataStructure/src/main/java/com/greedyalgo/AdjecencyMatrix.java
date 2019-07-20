package com.greedyalgo;

//Shortest path problem for weighted graph
public class AdjecencyMatrix {
    static int inf=Integer.MAX_VALUE;
    static int[] distances={0,inf,inf,inf,inf,inf,inf,inf};
    static boolean[] visited={true,false,false,false,false,false,false,false};
    public static void main(String[] args){
        char[] vertex={'A','B','C','D','E','F','G','H'};
        int[][] vertices={
                {0,4,-1,5,-1,6,-1,-1}, //A
                {4,0,2,-1,-1,-1,-1,-1}, //B
                {-1,2,0,3,-1,-1,4,-1}, //C
                {5,-1,3,0,8,-1,-1,-1}, //D
                {-1,-1,-1,8,0,4,-1,9}, //E
                {6,-1,-1,-1,4,0,-1,4}, //F
                {-1,-1,4,-1,9,-1,0,8}, //G
                {-1,-1,-1,-1,-1,4,8,0}, //H
        };




        for (int i=0;i<vertices.length;i++){
            optimizeDistances(vertices[i],i);
        }

        for(int i=0;i<distances.length;i++){
            System.out.println(distances[i]);
        }

    }

    public static void optimizeDistances(int[] vertex, int vistedIndex){
        visited[vistedIndex]=true;
        int distanceFromA=distances[vistedIndex];
        for(int i=0;i<distances.length;i++){
            if(vertex[i]>0 && !visited[i]){
                int d=0;
                if(distanceFromA!=Integer.MAX_VALUE && distanceFromA>0){
                    d=vertex[i]+distanceFromA;
                }else{
                    d=vertex[i];
                }

                if(distances[i]>d){
                    distances[i]=vertex[i]+distanceFromA;
                }

            }
        }

    }
}