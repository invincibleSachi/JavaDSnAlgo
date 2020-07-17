package com.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] arr={23,12,34,21,45,11,9,89,16,19};
        int[] mergedSort=sort(arr);
       for(int i=0;i<mergedSort.length;i++){
           System.out.println(mergedSort[i]);
       }

    }
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        if(arr.length==2){
            if(arr[0]>arr[1]){
                arr[0]=arr[0]+arr[1];
                arr[1]=arr[0]-arr[1];
                arr[0]=arr[0]-arr[1];
            }
            return arr;
        }
        int[] firstHalf=new int[arr.length/2];
        int[] secondHalf=new int[arr.length-firstHalf.length];
        for(int i=0;i<firstHalf.length;i++){
            firstHalf[i]=arr[i];
        }
        for(int i=0;i<secondHalf.length;i++){
            secondHalf[i]=arr[firstHalf.length+i];
        }
        System.out.println("first Half " +Arrays.toString(firstHalf));
        System.out.println("second Half "+Arrays.toString(secondHalf));
        firstHalf=sort(firstHalf);
        secondHalf=sort(secondHalf);
        int[] mergedArr=mergedArr(firstHalf,secondHalf);
        return mergedArr;
    }

    static int[] mergedArr(int[] first, int[] second){
        System.out.println("first " +Arrays.toString(first));
        System.out.println("second "+Arrays.toString(second));
        int maxlength=first.length>second.length?first.length:second.length;
        int[] mergedarr=new int[first.length+second.length];
        int firArrayindex=0,secondArrayIndex=0,mergedIndex=0;

        for(int i=0;i<mergedarr.length;i++){
            if(firArrayindex>=first.length){
                mergedarr[mergedIndex++]=second[secondArrayIndex++];
                continue;
            }

            if(secondArrayIndex>=second.length){
                mergedarr[mergedIndex++]=first[firArrayindex++];
                continue;
            }

            if(first[firArrayindex]<=second[secondArrayIndex]){
                mergedarr[mergedIndex++]=first[firArrayindex++];
            }else {
                mergedarr[mergedIndex++]=second[secondArrayIndex++];
            }
        }
        System.out.println("merged "+Arrays.toString(mergedarr));
        return mergedarr;
    }
}
