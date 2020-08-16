package com.Array;

public class Knapsack10 {
    static int [][] dp=new int[5][8];
    static int calls=0;
    public static void main(String[] args){
        for(int i=0;i<dp.length;i++){
            for (int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        int[] w={1,3,4,5};
        int[] v={1,4,5,7};
        int maxWeight=7;
        System.out.println("Max Profit "+knapsack(w,v,maxWeight,3));
        System.out.println("total calls made "+calls);
    }

    public static int knapsack(int[] w, int[] v, int weight, int n){

        int m;
        if(dp[n][weight]!=-1){
            return dp[n][weight];
        }
        calls++;
        if(n==0||weight==0){
            return 0;
        }else if(w[n]<=weight){
            m= Math.max(v[n]+knapsack(w,v,weight-w[n],n-1),knapsack(w,v,weight,n-1));
            dp[n][weight]=m;
            return m;
        }else {
            m= knapsack(w,v,weight,n-1);
            dp[n][weight]=m;
            return m;
        }
    }
}
