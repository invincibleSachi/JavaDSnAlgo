package com.Algo;

import java.util.Arrays;

public class RodCutttingMaxProfit {
    static int totalLength=8;
    static int[] length={1,2,3,4,5,6,7,8};
    static int[] price={1,5,8,9,10,17,17,20};
    public static void main(String[] args){
        /*
            Given rod of length 8 m can be cut in multiples of 1 m
            with the given price of size of rod find the way to maximize profit.
         */
        int[] arr={};
        int maxProfit=maximizeProfit(arr,0,0,0);
        System.out.println(maxProfit);

    }

    static int maximizeProfit(int[] lengths,int allLength,int profit, int i){
        if(allLength>=totalLength || i>=length.length){
            return profit;
        }
        //System.out.println(Arrays.toString(lengths));
        //System.out.println(profit);
        //If I include ith length of rod
        int[] newLengths= Arrays.copyOf(lengths,lengths.length+1);
        newLengths[lengths.length]=length[i];
        //I will not increment i as I can cut rods of same size few more times
        int increaseProfit=profit;
        if(allLength+length[i]<=totalLength){
            increaseProfit=maximizeProfit(newLengths,allLength+length[i],profit+price[i],i);
        }
        int mx= Math.max(increaseProfit,maximizeProfit(lengths,allLength,profit,i+1));
        //System.out.println("Proft returned "+mx + " from either of "+Arrays.toString(newLengths)+ " or "+ Arrays.toString(lengths));
        return mx;

    }
}
