package com.Algo;

public class RodCuttingDP {
    static int totalLength=8;
    static int[] length={1,2,3,4,5,6,7,8};
    static int[] price={1,5,8,9,10,17,17,20};
    static int[][] dp=new int[length.length+1][totalLength+1];
    public static void main(String[] args){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0||j==0){
                     dp[i][j]=0;
                }else dp[i][j]=-1;
            }
        }
        //i--> index
        //j --> Available length
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(j>=length[i-1]){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j] );
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[8][8]);
    }


}
