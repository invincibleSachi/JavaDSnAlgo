package com.Array;

public class JugglingAlgoRotation {
    static int[] arr1={3,5,7,9,11,13,14,17,19,20,33,55,66,77,88,99};
    public static void main(String[] args){
        //rotate by k=4
        int k=4;
        int g=gcd(arr1.length,k);
        int temp=0;
        for(int j=0;j<g;j++){
            for(int i=j;i< arr1.length/2;i=i+g){
                arr1[i]=arr1[i]+ arr1[arr1.length-1-i];
                arr1[arr1.length-1-i]=arr1[i]- arr1[arr1.length-1-i];
                arr1[i]=arr1[i]- arr1[arr1.length-1-i];
            }
        }

        display();

    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b) {
            return gcd(a - b,b);
        }else
            return gcd(a,b-a);
    }

    public static void display(){
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
