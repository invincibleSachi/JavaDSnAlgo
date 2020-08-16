package com.Array;

public class MaxSumSubArray {
    static int[] arr={-2,-3,4,2,-2,2,5,-3};

    public static void main(String[] args){
        int meh=0,msf=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            meh=meh+arr[i];
            if(meh<arr[i]){
                meh=arr[i];
            }
            if(msf<meh){
                msf=meh;
            }
        }
        System.out.println(msf);
    }
}
