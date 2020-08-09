package com.searching;

public class FindMinInSortedAndRotatedArray {
    static int[] arr1={33,55,66,77,88,99,3,5,7,9,11,13,14,17,19,20,};

    public static void main(String[] args){
        int pivot=findPivotIndex(0, arr1.length);
        System.out.println(findMin(0, pivot, 19));
        System.out.println(findMin(pivot+1, arr1.length-1, 19));

    }

    public static int findMin(int start,int end,int key){

        if(start>end) return -1;
        if(start==end){
            if(arr1[start]==key){
                return start;
            }else{
                return -1;
            }
        }
        int mid=start+(end-start)/2;
        if(arr1[mid]==key){
            return mid;
        }
        if(arr1[mid]>key){
            return findMin(start,mid-1,key);
        }else
            return findMin(mid+1,end,key);


    }

    public static int findPivotIndex(int start, int end){
        if(end<start || start>arr1.length-1) return -1;
        int mid=start+(end-start)/2;
        if(isPivot(mid)) return mid;
        if(arr1[start]<=arr1[mid]){
            return findPivotIndex(mid+1,end);
        }else{
            return findPivotIndex(start,mid-1);
        }
    }

    public static boolean isPivot(int index){
        if(index<=1 || index>= arr1.length-1){
            return false;
        }else {
            if(arr1[index-1]<arr1[index]&& arr1[index]>arr1[index+1]){
                return true;
            }else{
                return false;
            }
        }
    }
}
