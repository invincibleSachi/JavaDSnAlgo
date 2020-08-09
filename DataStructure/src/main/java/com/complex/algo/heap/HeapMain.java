package com.complex.algo.heap;

public class HeapMain {
    public static void main(String[] args){
        MinHeapImpl mHeap=new MinHeapImpl(10);
        mHeap.addToHeap(2);
        mHeap.addToHeap(4);
        mHeap.addToHeap(6);
        mHeap.addToHeap(8);
        mHeap.addToHeap(7);
        mHeap.addToHeap(3);
        mHeap.addToHeap(9);
        mHeap.displayHeap();
        mHeap.deleteAllFromHeap();
        System.out.println("After Sorting");
        mHeap.displayArr();
        mHeap.deleteAllFromHeap();

//        System.out.println("Heap After Delete");
//        mHeap.displayHeap();
//        System.out.println("Array After Delete");
//        mHeap.displayArr();
        //mHeap.deleteFromHeap();
       // mHeap.deleteFromHeap();

    }
}
