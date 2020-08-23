package com.lcs;

public class Subsequence {

    static char[] a={'a','b','c','d','g','h','r','s'};
    static char[] b={'a','b','e','d','g','h','r'};
    static int subsequenceLen=0;
    public static void main(String[] args){
        lcs(a.length,b.length);
        System.out.println(subsequenceLen);

    }

    public static int lcs(int m, int n){
        if(m==0||n==0){
            return 0;
        }
        if(a[m-1]==b[n-1]){
            int currentSubsequenceLen= 1+lcs(m-1,n-1);
            if(currentSubsequenceLen>subsequenceLen){
                subsequenceLen=currentSubsequenceLen;
            }
            return currentSubsequenceLen;
        }else{
             lcs(m-1,n);lcs(m,n-1);
             return 0;
        }
    }
}
