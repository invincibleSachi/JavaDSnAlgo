package com.lcs;

public class Lcs {
    static char[] a={'a','b','c','d','g','h'};
    static char[] b={'a','b','e','d','f','h','r'};
    public static void main(String[] args){
        System.out.println(lcs(a.length,b.length));

    }

    public static int lcs(int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(a[m-1]==b[n-1]){
            return 1+lcs(m-1,n-1);
        }else {
            return Math.max(lcs(m-1,n),lcs(m,n-1));
        }
    }
}
