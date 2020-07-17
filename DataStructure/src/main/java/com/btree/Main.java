package com.btree;

public class Main {
    public static void main(String args[]){
        BTree btree=new BTree(new Node(5));
        btree.insertIntoTree(6);
        btree.insertIntoTree(7);
        btree.insertIntoTree(2);
        btree.insertIntoTree(12);
        btree.insertIntoTree(22);
        btree.insertIntoTree(34);
        btree.insertIntoTree(36);
        btree.traversal(1);
        btree.traversal(0);
        btree.searchInBinaryTree(12);
        System.out.println(btree.getHeight());
        System.out.println("lavel order traversal");
        btree.lavelOrderTraversalBase();

        System.out.println("smallest" +btree.smallestInTree());
        System.out.println("highest "+btree.highestInTree());
    }
}
