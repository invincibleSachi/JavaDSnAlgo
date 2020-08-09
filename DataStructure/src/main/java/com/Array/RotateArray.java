package com.Array;

public class RotateArray {
    public static void main(String[] args){
        int[] arr1={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
        int k=3;
        int counter=0;
        int index=arr1.length-k-1;
        int[] arr2=new int[arr1.length];
        while(counter<arr1.length){
            index=index% arr1.length;
            arr2[counter++]=arr1[index++];
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
