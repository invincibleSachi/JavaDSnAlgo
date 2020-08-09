package com.Array;

public class FindSumPairInSortedArray {
    static int[] arr={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
    public static void main(String[] args){
        int l=0;
        int r= arr.length-1;
        int givenSum=31;
        while((l>=0 && l<arr.length)&&(r>=0&&r< arr.length)){
            if(arr[l]+arr[r]==givenSum){
                System.out.println("Sum of "+arr[l]+" "+arr[r] +" is "+givenSum);
                l++;
            }else{
                if(arr[l]+arr[r]<=givenSum){
                    l++;
                }else r--;
            }
            if(l==r){
                l++;
            }
        }

    }
}
