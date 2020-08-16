package com.Array;

public class SubsetWithSumX {
    static int[] arr={2,3,7,8,10};
    static int givenSum=13;
    static int iterations=0;
   static int[][] dp=new int[arr.length+1][givenSum+1];
    public static void main(String[] args){
        System.out.println(findSubsetWithSum(0,0));
        System.out.println(iterations);
    }

    static boolean findSubsetWithSum(int i, int sum){


        if(i>= arr.length|| sum>givenSum){
            if(sum==givenSum) {
                dp[i][sum]=1;
                return true;
            }
            else{
                //dp[i][sum]=2;
                return false;
            }
        }
        if(dp[i][sum]!=0){
            return dp[i][sum]==1?true:false;
        }
        iterations++;
        boolean x= findSubsetWithSum(i+1,sum+arr[i])|| findSubsetWithSum(i+1,sum);
        dp[i][sum]= x==true?1:2;
        return x;
    }
}
