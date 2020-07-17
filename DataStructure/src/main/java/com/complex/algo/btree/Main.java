package com.complex.algo.btree;

public class Main {
    public static void main(String[] args){
        bTreeImpl bTree=new bTreeImpl();
        bTree.addNode(10);
        bTree.addNode(11);
        bTree.addNode(9);
        bTree.addNode(14);
        bTree.addNode(1);
        bTree.addNode(5);
        bTree.addNode(6);
        bTree.addNode(11);
        bTree.addNode(7);
        bTree.addNode(8);
        bTree.addNode(6);
        System.out.println("root "+bTree.getRoot().getData());
        System.out.println("In order Traversal");
        bTree.inOrderTraversal(bTree.getRoot());
        System.out.println("Pre order Traversal");
        bTree.preOrderTraversal(bTree.getRoot());
        System.out.println("Post order Traversal");
        bTree.postOrderTraversal(bTree.getRoot());
        System.out.println("Level order traversal");
        bTree.levelorderTraversal();
        System.out.println("Left View");
        bTree.printLeftView();
        System.out.println("Right View");
        bTree.printRightView();
        System.out.println("All Leaf nodes");
        bTree.printAllLeafNodes();
        System.out.println("Horizontal Traversal");
        bTree.horizontalTraversal();
        bTree.getTopNBottomView();
    }
}
