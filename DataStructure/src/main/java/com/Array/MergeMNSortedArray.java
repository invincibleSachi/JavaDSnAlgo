package com.Array;

public class MergeMNSortedArray {
    public static void main(String[] args){
        /**
         * There are two sorted arrays. First one is of size m+n containing only m elements. Another one is of size n and contains n elements. Merge these two arrays into the first array of size m+n such that the output is sorted.
         */

        int[] arr1={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
        int[] arr2={4,5,7,8,9,11,18,23};
        int[] arr3={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] arr=merge2Arr(arr3, merge2Arr(arr1,arr2));

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static int[] merge2Arr(int[] arr1, int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int i=0,j=0,l=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[l++]=arr1[i++];
            }else{
                arr[l++]=arr2[j++];
            }
        }
        if(arr1.length>arr2.length){
            while(i<arr1.length){
                arr[l++]=arr1[i++];
            }
        }else{
            while(j<arr2.length){
                arr[l++]=arr2[j++];
            }
        }
        return arr;
    }
}
