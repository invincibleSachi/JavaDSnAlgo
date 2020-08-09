package com.sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={9,20,10,14,21,30,56,12};
        int key=arr[0];
        int j=0;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j>-1 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

       }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
