package com.Array;

public class MergeSortedArray {
    public static void main(String[] args){
        int[] arr1={3,4,9,12,15,18};
        int[] arr2={4,6,7,10,11,13,14,16};
        int[] arr3={1,2,3,4,6,8,16,18,22,24};
        int i=0;
        int mergeCount=arr1.length+arr2.length+arr3.length;
        int[] mergedArr=new int[mergeCount];
        int arr1Counter=0,arr2Counter=0,arr3Counter=0;
        while(i< mergeCount){
            int num1,num2,num3;
            num1=(arr1Counter>arr1.length-1)?Integer.MAX_VALUE:arr1[arr1Counter];
            num2=(arr2Counter>arr2.length-1)?Integer.MAX_VALUE:arr2[arr2Counter];
            num3=(arr3Counter>arr3.length-1)?Integer.MAX_VALUE:arr3[arr3Counter];
            if(num1<=num2 && num1<=num3){
                mergedArr[i++]=arr1[arr1Counter++];
            }else if(num2<=num1 && num2<=num3){
                mergedArr[i++]=arr2[arr2Counter++];
            }else{
                mergedArr[i++]=arr3[arr3Counter++];
            }
        }

        for(int j=0;j<mergedArr.length;j++){
            System.out.println(mergedArr[j]);
        }
    }
}
