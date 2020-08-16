package com.Array;

public class EqualSumPartition {
    static int[] arr={1,5,11,5};
    public static void main(String[] args){
        findSubsets(0,0,22);
    }

    static void findSubsets(int i, int sum1, int sum2){
        if(i== arr.length){
            if(sum1==sum2){
                System.out.println("Sum is "+sum1);
            }else {
                System.out.println("sum is not equal");
            }
            return ;

        }else {
            //if ith element included then
            findSubsets(i+1,sum1+arr[i],sum2-arr[i]);
            //if ith element not included
            findSubsets(i+1,sum1,sum2);
        }
    }
}
