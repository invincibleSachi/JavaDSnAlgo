package com.lcs;

import java.util.Arrays;

public class LongestPalindromicSubSeq {
    static char[] a={'a','g','b','c','b','a'};
    static int[][] dp=new int[a.length+1][a.length+1];
    static String[][] longestPalindrom=new String[a.length+1][a.length+1];
    public static void main(String[] args){
        char[] b=new char[a.length];
        for(int i=a.length-1;i>=0;i--){
            b[a.length-1-i]=a[i];

        }
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else {
                    dp[i][j]=-1;
                }
                longestPalindrom[i][j]="";
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(a[i-1]==b[j-1]){
                    dp[j][j]=1+dp[i-1][j-1];
                    longestPalindrom[i][j]=a[i-1]+longestPalindrom[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    if(dp[i-1][j]>dp[i][j-1]){
                        longestPalindrom[i][j]=longestPalindrom[i-1][j];
                    }else {
                        longestPalindrom[i][j]=longestPalindrom[i][j-1];
                    }
                }
            }
        }

        System.out.println(longestPalindrom[a.length][b.length]);
        System.out.println(longestPalindrom[a.length][b.length].length());

    }
}
