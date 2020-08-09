package com.Array;

public class ReverseArrayOptimized {
    static int[] arr1={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
    public static void main(String[] args){

        //Rotate by K
        int k=5;
        reverse(0,arr1.length-1);
        reverse(0,k-1);
        reverse(k, arr1.length-1);
        display();




    }

    public static void display(){
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void reverse(int start, int end){
        int mid= (start+end)/2;
        for(int i=0;i<(mid-start);i++){
            arr1[start+i]=arr1[start+i]+arr1[end-i];
            arr1[end-i]=arr1[start+i]-arr1[end-i];
            arr1[start+i]=arr1[start+i]-arr1[end-i];
        }
    }
}
