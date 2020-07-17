package com.Array;

public class KthUnsorted {
    static int k=4;
    static int[] kth=new int[k];
    public static void main(String args[]){
        int[] arr={2,34,5,1,23,56,85,21,2,3,56,83,73,2,46,98};
        int k=4;
        int temp=0;
        fillKthWithInfinity();
        printArr(kth);
        for(int i=0;i<arr.length;i++){
            insertIntoKthArray(arr[i]);
        }
        printArr(kth);
//        for (int i=0;i<arr.length;i++){
//            if(i<k-1){
//                kth[i]=arr
//            }
//        }
    }

    public static int[] swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        int[] ret={a,b};
        return ret;
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void fillKthWithInfinity(){
        for(int i=0;i<kth.length;i++){
            kth[i]=Integer.MAX_VALUE;
        }
    }

    public static void insertIntoKthArray(int n){
        int temp=0;
        if(kth[0]==Integer.MAX_VALUE){
            kth[0]=n;
        }
        for(int i=0;i<kth.length;i++){
            if(kth[i]>n){
                insertNShiftKthBy1(i,n);
            }
        }
    }

    public static void insertNShiftKthBy1(int x,int insert){
        for(int i=kth.length-1;i>=x;i--){
            if(i-1!=0){
                kth[i]=kth[i-1];
            }

        }
        kth[x]=insert;
    }
}
