package com.Array;

import java.util.Arrays;

public class AllPossibleSubArrays {
    static int[] arr={1,2,3,4};
    static int countSubArr=0;
    public static void main(String[] args){
        int[] arrbase={};
        printArr(arrbase,0);
        System.out.println("Total num "+countSubArr);
    }

    static void printArr(int[] a,int i){
        System.out.println(Arrays.toString(a));
        countSubArr++;
        if(i==arr.length){
            return;
        }
        int[] arrNew=new int[a.length+1];
        for(int k=0;k<a.length;k++){
            arrNew[k]=a[k];
        }

        for(int l=i;l<arr.length;l++){
            arrNew[arrNew.length-1]=arr[l];
            printArr(arrNew,l+1);
        }

    }


}
