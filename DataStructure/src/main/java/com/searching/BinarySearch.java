package com.searching;

import java.util.Arrays;

public class BinarySearch {
    static int[] arr={4,5,6,7,9,12,15,18,24,27,29,45,67,89};
    public static void main(String agrs[]){
        int index=search(0,arr.length,39);
        System.out.println(index);
    }

    public static int search(int start, int end,int searchKey){
        if(start>=end){
            return -1;
        }
        int mid=getMid(start,end);


        if(arr[mid]==searchKey){
            return mid;
        }
        if(arr[mid]>searchKey){
            return search(start,mid,searchKey);
        }else if(arr[mid]<searchKey) {
            return search(mid+1,end,searchKey);
        }else{
            return -1;
        }
    }

    public static int getMid(int start, int end){
        int mid=0;
        if((start+end)%2==0){
            mid=(start+end)/2;
        }else {
            mid=((start+end)/2)+1;
        }
        return mid;
    }

}
