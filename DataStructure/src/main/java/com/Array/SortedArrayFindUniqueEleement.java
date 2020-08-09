package com.Array;

public class SortedArrayFindUniqueEleement {
    static int[] arr={1,1,2,2,3,4,4,5,6,6,7,7,8,8};
    public static void main(String args[]){
        findUnique(0,arr.length-1);

    }
    public static void findUnique(int start, int end){
        if(start>end ){
            return;
        }
        int mid=start+(end-start)/2;
            if(mid==0){
                if((arr[mid]!=arr[mid+1])){
                    System.out.println(arr[mid]);
                }
            }else return;
            if(mid==arr.length-1){
                if((arr[mid]!=arr[mid-1])){
                    System.out.println(arr[mid]);
                    return;
                }
            }else return;

            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                System.out.println(arr[mid]);
            }

            findUnique(start,mid-1);
            findUnique(mid+1,end);
    }
}
