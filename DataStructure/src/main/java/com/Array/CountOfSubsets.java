package com.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountOfSubsets {
    static int[] arr={2,3,5,6,8,10};
    static int givenSum=10;
    static int count=0;
    static int[][] dp=new int[arr.length+1][givenSum+1];
    public static void main(String[] args){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        countSubsetSum10(0,0);
        System.out.println(count);
    }

    static void countSubsetSum10(int i, int sum){
        if(i> arr.length || sum>givenSum){
            return;
        }
        if(sum==0){
            givenSum=10;
        }
        if(sum==givenSum){
            count++;
            return;
        }
        if(i< arr.length){
            countSubsetSum10(i+1,sum+arr[i]);
            countSubsetSum10(i+1,sum);

        }


    }
}
