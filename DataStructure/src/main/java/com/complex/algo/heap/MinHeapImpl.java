package com.complex.algo.heap;

import com.complex.algo.aux.Tnode;
import lombok.Getter;

@Getter
public class MinHeapImpl {
   int size;
   int[] heapArr;
   int heapSize=0;
   MinHeapImpl(int size){
       this.size=size;
       heapArr=new int[size];


   }

   public void addToHeap(int a){
       heapSize++;
       heapArr[heapSize-1]=a;
       bubbleUp(heapSize-1);
   }

   public void bubbleUp(int index){
       if(index<1){
           return;
       }
       int newEl=heapArr[index];
       int parent=heapArr[(index-1)/2];
       if(newEl<parent){
           heapArr[(index-1)/2]=newEl;
           heapArr[index]=parent;
       }
       bubbleUp(index/2);
   }

   public void deleteFromHeap(){
       int deletedElement=heapArr[0];
       heapArr[0]=heapArr[heapSize-1];

       if(heapSize>=2){
           shiftAfterDelete(0);
       }
        System.out.println("Deleted Item from Heap "+deletedElement);
       heapArr[heapSize-1]=deletedElement;
       heapSize--;
   }
   public void deleteAllFromHeap(){
       while(heapSize>0){
           deleteFromHeap();
       }
   }

   public void shiftAfterDelete(int index){
       if(2*index+1>=heapSize-1){
           return;
       }
       int parent=heapArr[index];
       int leftChildIndex=2*index+1;
       int rightChildIndex=2*index+2;
       int leftChild=Integer.MAX_VALUE;
       int rightChild=Integer.MAX_VALUE;
       if(heapSize>=leftChildIndex+1){
           leftChild=heapArr[leftChildIndex];
       }
       if(rightChild>=rightChildIndex+1){
           rightChild=heapArr[rightChildIndex];
       }
       if(leftChild<rightChild && leftChild<parent){
           //Swap positions
           heapArr[index]=leftChild;
           heapArr[2*index+1]=parent;
           index=2*index+1;
       }else if(leftChild>rightChild && rightChild<parent){
           //Swap positions
           heapArr[index]=rightChild;
           heapArr[2*index+2]=parent;
           index=2*index+2;
       }else{
           return;
       }
       shiftAfterDelete(index);

   }

   public void displayHeap(){
       for(int i=0;i<heapSize-1;i++){
           System.out.println(heapArr[i]);
       }
   }

    public void displayArr(){
        for(int i=0;i<heapArr.length;i++){
            System.out.println(heapArr[i]);
        }
    }

}
