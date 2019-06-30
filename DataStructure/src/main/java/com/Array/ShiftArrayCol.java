package com.Array;

public class ShiftArrayCol {
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        int r=arr.length;
        int c=arr[1].length;
        for (int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr[i].length/2;j++){
                temp=arr[i][c-j-1];
                arr[i][c-j-1]=arr[i][j];
                arr[i][j]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
