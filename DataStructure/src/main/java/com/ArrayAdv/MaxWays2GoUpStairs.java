package com.ArrayAdv;

import java.util.Arrays;

public class MaxWays2GoUpStairs {
    static int[] arr={0,1,2,3,4};
    public static void main(String[] args){
        int[] a={arr[0]};
        getWays(a);
    }

    public static void getWays(int[] arrT){
        if(arrT[arrT.length-1]==arr[arr.length-1])
            System.out.println(Arrays.toString(arrT));
        if(arrT.length>=arr.length || arrT[arrT.length-1]==arr[arr.length-1]){
            return;
        }

        int newSize=arrT.length+1;
        int[] temp=new int[newSize];
        for(int i=0;i< arrT.length;i++){
            temp[i]=arrT[i];
        }
        temp[newSize-1]=temp[newSize-2]+1;
        getWays(temp);
        temp[newSize-1]=temp[newSize-2]+2;
        if(temp[newSize-1]<=arr[arr.length-1]){
            getWays(temp);
        }


    }
}
