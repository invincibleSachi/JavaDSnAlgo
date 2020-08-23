package com.lcs;

public class LcsMemoization {
    static char[] a={'a','b','c','d','g','h'};
    static char[] b={'a','b','e','d','f','h','r'};
    static int[][] dp=new int[a.length+1][b.length+1];
    public static void main(String[] args){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs(a.length,b.length));

    }

    public static int lcs(int m, int n){
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(m==0 || n==0){
            return 0;
        }
        if(a[m-1]==b[n-1]){
            return dp[m][n]=1+lcs(m-1,n-1);
        }else {
            return dp[m][n]=Math.max(lcs(m-1,n),lcs(m,n-1));
        }
    }
}
