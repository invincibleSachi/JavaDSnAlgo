package com.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
    Node root;
    Queue<Node> q=new LinkedList<Node>();
    public BTree(Node n){
        this.root=n;
    }

    public int getHeight(){
        int height=0;
        if(root==null){
            return 0;
        }else{
            return findHeight(root,0);
        }
    }

    int findHeight(Node n, int height){
        if(n==null){
            return height;
        }
        int rHeight=findHeight(n.getRight(),height);
        int lHeight=findHeight(n.getLeft(),height);
        if(lHeight>rHeight){
            return ++lHeight;
        }else return ++rHeight;
    }

    void insertIntoTree(int data){

        insertIntoData(data,root);
    }

    private void insertIntoData(int data, Node n){
        if(n==null){
            return;
        }
        else if(n.getData()>=data){
            insertIntoData(data,n.getLeft());
            if(n.getLeft()==null){
                n.setLeft(new Node(data));
            }
        }else if(n.getData()<data){
            insertIntoData(data,n.getRight());
            if(n.getRight()==null){
                n.setRight(new Node(data));
            }

        }
    }

    void traversal(int type){
        if(type==0){
            inOrderTraversal(root);
        }else if(type==1){
            preOrderTraversal(root);
        }else if(type==2){
            postOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node n){
        if(n==null){
            return;
        }
        inOrderTraversal(n.getLeft());
        System.out.println(n.getData());
        inOrderTraversal(n.getRight());
    }

    public void lavelOrderTraversalBase(){
        levelOrderTraversal(root);
        while(!q.isEmpty()){
            System.out.println(q.remove().getData());
        }

    }

    private void levelOrderTraversal(Node n){

        if(n==null){
            return;
        }else {
            q.add(n);
        }
        Node node=q.remove();
        System.out.println(node.getData());
        levelOrderTraversal(node.getLeft());
        levelOrderTraversal(node.getRight());

    }

    private void preOrderTraversal(Node n){
        if(n==null){
            return;
        }
        System.out.println(n.getData());
        inOrderTraversal(n.getLeft());
        inOrderTraversal(n.getRight());
    }

    private void postOrderTraversal(Node n){
        if(n==null){
            return;
        }
        inOrderTraversal(n.getLeft());
        inOrderTraversal(n.getRight());
        System.out.println(n.getData());
    }

    public Node searchInBinaryTree(int data){
        Node n=searchInBinaryTree(data,root);
        if(n==null){
            System.out.println("data not found");
            return null;
        }else{
            return n;
        }
    }

    public Node searchInBinaryTree(int data, Node n){
        if(n==null){
            return null;
        }
        if(n.getData()==data){
            System.out.println("data found");
            return n;
        }
        if(n.getData()>data){
            return searchInBinaryTree(data,n.getLeft());
        }else {
            return searchInBinaryTree(data,n.getRight());
        }
    }

    public int smallestInTree(){
        if(root==null){
            return 0;
        }
        if(root.getLeft()==null){
            return root.getData();
        }
        Node n=root;
        Node next=root.getLeft();
        while(next!=null){
            n=next;
            next=n.getLeft();
        }
        return n.getData();
    }

    public void deleteNode(int data){

    }

    private void deleteNode(int data, Node n, Node parent){
        if(n==null){
            System.out.println("no data found");
            return;
        }
        if (n.getData()==data){
            if(n.getLeft()==null && n.getRight()==null){
                if(parent.getLeft()==n){
                    parent.setLeft(null);
                }else if(parent.getRight()==n){
                    parent.setRight(null);
                }
                return;
            }
            if(n.getLeft()==null || n.getRight()==null){
                if(parent.getLeft()==n){
                    
                }
            }
        }
    }

    public int highestInTree(){
        if(root==null){
            return 0;
        }
        if(root.getRight()==null){
            return root.getData();
        }
        Node n=root;
        Node next=root.getRight();
        while(next!=null){
            n=next;
            next=n.getRight();
        }
        return n.getData();
    }
}
