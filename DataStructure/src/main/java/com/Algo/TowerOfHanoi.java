package com.Algo;

public class TowerOfHanoi {
    public static void main(String[] args){
        towerOfHanoi(2,"A","C","B");
    }

   public static void towerOfHanoi(int n,String source,String dest,String temp){
        if(n==1){
            System.out.println("Move disk "+n + " from "+source+ " to "+dest);
            return;
        }
        towerOfHanoi(n-1,source,temp,dest);
        System.out.println("Move disk "+ n + " from "+source+" to "+ dest);
        towerOfHanoi(n-1,temp,source,dest);
   }
}
