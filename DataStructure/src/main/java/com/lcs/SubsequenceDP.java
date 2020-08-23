package com.lcs;

public class SubsequenceDP {
    static char[] a={'a','b','c','d','g','h','r','s'};
    static char[] b={'a','b','e','d','g','m','r'};
    static int[][] dp=new int[a.length][b.length];
    static int subsequenceLen=0;
    public static void main(String[] args){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else
                    dp[i][j]=-1;
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(a[i]==b[j]){
                    int currentSubse=1+dp[i-1][j-1];
                    if(currentSubse>subsequenceLen){
                        subsequenceLen=currentSubse;
                    }
                    dp[i][j]=subsequenceLen;
                }else{
                    dp[i][j]=0;
                }
            }
        }
        System.out.println(subsequenceLen);

    }

}
