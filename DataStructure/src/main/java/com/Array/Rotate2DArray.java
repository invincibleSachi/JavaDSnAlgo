package com.Array;

public class Rotate2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = arr.length;
        int c = arr[1].length;
        int[][] arr1=new int[arr.length][arr[1].length];
        //Clockwise Rotation

        for (int j=0;j<arr[1].length;j++){
            for (int i=arr.length-1;i>=0;i--){
                System.out.println(arr[i][j]);
            }
        }
    }


}
