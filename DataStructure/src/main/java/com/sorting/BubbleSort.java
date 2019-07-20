package com.sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={9,20,10,34,21,34,56,12};
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
