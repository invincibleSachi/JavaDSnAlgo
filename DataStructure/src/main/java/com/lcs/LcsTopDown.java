package com.lcs;

/***
 * find the lenght of common subsequence and print it.
 */
public class LcsTopDown {
    //static char[] a={'a','b','c','d','b','c'};
//    static char[] b={'a','b','e','d','f','h','r'};
    static char[] a={'a','g','b','c','b','a'};
static char[] b={'a','b','c','b','g','a'};
    static int[][] dp=new int[a.length+1][b.length+1];
    static String[][] dpCommonSeq=new String[a.length+1][b.length+1];
    public static void main(String[] args){

        //initialization
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=-1;
                }
                dpCommonSeq[i][j]="";
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(a[i-1]==b[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                    dpCommonSeq[i][j]=a[i-1]+dpCommonSeq[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    if(dp[i-1][j]>dp[i][j-1]){
                        dpCommonSeq[i][j]=dpCommonSeq[i-1][j];
                    }else{
                        dpCommonSeq[i][j]=dpCommonSeq[i][j-1];
                    }

                }
            }
        }
        System.out.println(dp[a.length][b.length]);
        System.out.println(dpCommonSeq[a.length][b.length]);
        //Print reverse of above string

    }


}
