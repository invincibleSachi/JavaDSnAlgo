package com.searching;

public class SearchInSortedArray {
    static int[] arr1={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
    public static void main(String[] args){
        System.out.println(find(0, arr1.length-1, 200));
    }

    public static int find(int start,int end,int key){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr1[mid]==key){
            return mid;
        }

        if(arr1[mid]>key){
            return find(start,mid-1,key);
        }else{
            return find(mid+1,end,key);
        }

    }
}
