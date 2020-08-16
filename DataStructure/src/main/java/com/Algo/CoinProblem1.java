package com.Algo;

public class CoinProblem1 {
    /**
     * Find maxiumum no of ways to get total value of coin equal to 5
     * @param args
     */
    static int[] coins={1,2,3,4};
    static int desiredChange=5;
    public static void main(String[] args){
        System.out.println(change(0,0,0));
    }
    static int change(int totalVal, int i, int noOfWays){
        if(i==coins.length|| totalVal>=desiredChange){
            if(totalVal==desiredChange){
                noOfWays++;
            }
            return noOfWays;
        }
        int x=change(totalVal+coins[i],i,noOfWays)+
        change(totalVal,i+1,noOfWays);
        return x;
    }
}
