package com.LinkedList;

public class MainFunc {

    public static void main(String[] args){
        MyLinkedList<String> ll=new MyLinkedList<String>();
        ll.add("Duggu");
        ll.add("Is");
        ll.add("A");ll.add("Good");
        ll.add("Boy");

        ll.printList();
        ll.insertAt(3,"Bad");
        System.out.println("-------------After insert -------------------");
        ll.printList();
        System.out.println("-------------After delete -------------------");
        ll.deleteNode(3);
        ll.printList();
        ll.reverseLinkedList();
        System.out.println("-------------After reverse -------------------");
        ll.printList();

    }
}
