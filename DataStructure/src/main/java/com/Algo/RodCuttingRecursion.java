package com.Algo;

public class RodCuttingRecursion {
    static int totalLength=8;
    static int[] length={1,2,3,4,5,6,7,8};
    static int[] price={1,5,8,9,10,17,17,20};
    public static void main(String[] args){
        System.out.println(maximumProfit(price.length-1,totalLength));
    }

    public static int maximumProfit(int i,int len){
        if(i==0||len==0){
            return 0;
        }
        if(len>=length[i]){
            return Math.max(maximumProfit(i,len-length[i])+price[i],maximumProfit(i-1,len));
        }else {
            return maximumProfit(i-1,len);
        }
    }
}
