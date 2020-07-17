package com.complex.algo.btree;

import com.complex.algo.aux.Tnode;

import java.util.*;

public class bTreeImpl {
    private Tnode root;
    public bTreeImpl (){

    }

    public Tnode getRoot(){
        return root;
    }

    public void addNode(int data){
        if(root==null){
            root=new Tnode(data);
            return;
        }
        insertNode(root,data);
    }

    public Tnode insertNode(Tnode temp, int data){
        if (temp==null){
            return null;
        }

        if(temp.getData()<data) {
            if(insertNode(temp.getRight(), data)==null){
                Tnode newNode=new Tnode(data);
                newNode.setHd(temp.getHd()+1);
                temp.setRight(newNode);
            }

        }else if(temp.getData()>=data){
            if(insertNode(temp.getLeft(),data)==null){
                Tnode newNode=new Tnode(data);
                newNode.setHd(temp.getHd()-1);
                temp.setLeft(newNode);
            }

        }
        return temp;
    }

    public void inOrderTraversal(Tnode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.println(node.getData() + "::hd = "+node.getHd());
        inOrderTraversal(node.getRight());
    }

    public void preOrderTraversal(Tnode node){
        if(node==null){
            return;
        }
        System.out.println(node.getData() + "::hd = "+node.getHd());
        inOrderTraversal(node.getLeft());
        inOrderTraversal(node.getRight());
    }

    public void postOrderTraversal(Tnode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.getLeft());
        inOrderTraversal(node.getRight());
        System.out.println(node.getData() + "::hd = "+node.getHd());
    }

    public void levelorderTraversal(){
        Queue<Tnode> q=new LinkedList<Tnode>();
        Tnode temp=root;
        q.add(root);
        while(!q.isEmpty()){
            System.out.println(q.peek().getData());
            temp=q.remove();
            if(temp.getLeft()!=null){
                q.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                q.add(temp.getRight());
            }

        }

    }
    public void printLeftView(){
        Queue<Tnode> q=new LinkedList<Tnode>();
        q.add(root);

        leftViewUtil(q);
    }

    public void printRightView(){
        Queue<Tnode> q=new LinkedList<Tnode>();
        q.add(root);

        rightViewUtil(q);
    }

    public void leftViewUtil(Queue<Tnode> q){
        if(q.isEmpty()){
           return ;
        }
        Tnode firstEl=q.remove();
        System.out.println(firstEl.getData());
        Queue<Tnode> nextLevelQ=new LinkedList<Tnode>();
        Tnode temp;
        if(firstEl.getLeft()!=null){
            nextLevelQ.add(firstEl.getLeft());
        }
        if(firstEl.getRight()!=null){
            nextLevelQ.add(firstEl.getRight());
        }

        while(!q.isEmpty()){
            temp=q.remove();
            if(temp.getLeft()!=null){
                nextLevelQ.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                nextLevelQ.add(temp.getRight());
            }
        }
        leftViewUtil (nextLevelQ);
    }

    public void rightViewUtil(Queue<Tnode> q){
        if(q.isEmpty()){
            return;
        }
        Queue<Tnode> nextLevelQ=new LinkedList<Tnode>();
        Tnode temp=null;
        while (!q.isEmpty()){
            temp=q.remove();
            if(temp.getLeft()!=null){
                nextLevelQ.add(temp.getLeft());
            }
            if(temp.getRight()!=null){
                nextLevelQ.add((temp.getRight()));
            }
        }
        System.out.println(temp.getData());
        rightViewUtil(nextLevelQ);
    }

    public void printAllLeafNodes(){
        printAllLeafs(root);
    }

    public void printAllLeafs(Tnode node){
        if(node==null){
            return;
        }
        if(node.getRight()==null && node.getLeft()==null){
            System.out.println(node.getData());
        }
        printAllLeafs(node.getLeft());
        printAllLeafs(node.getRight());
    }

    public HashMap<Integer, String> horizontalTraversal(){
        Queue<Tnode> q=new LinkedList<Tnode>();
        HashMap<Integer,String>hdMap=new HashMap<Integer,String>();
        q.add(root);
        int hd=0;
        Tnode temp;
        while(!q.isEmpty()){
            temp=q.remove();
            hd=temp.getHd();
            if(hdMap.containsKey(hd)){
                hdMap.put(hd,hdMap.get(hd)+"::"+Integer.toString(temp.getData()));
            }else {
                hdMap.put(hd,Integer.toString(temp.getData()));
            }

            if(temp.getLeft()!=null){
                Tnode leftNode=temp.getLeft();
                q.add(leftNode);
                //hdMap.put(leftNode.getHd(),Integer.toString(leftNode.getData())+"::"+hdMap.get(hd));
            }
            if(temp.getRight()!=null){
                Tnode rightNode=temp.getRight();
                rightNode.setHd(hd+1);
                q.add(rightNode);
                //hdMap.put(rightNode.getHd(),Integer.toString(rightNode.getData())+"::"+hdMap.get(hd));
            }
        }

        for(Map.Entry<Integer,String> entry: hdMap.entrySet()){
            System.out.println("Key-->"+entry.getKey());
            System.out.println("Value-->"+entry.getValue());
        }

        return hdMap;
    }

    public void getTopNBottomView(){
        System.out.println("Top View");
        HashMap<Integer,String> hdMap=horizontalTraversal();
        for(Map.Entry<Integer,String> entry: hdMap.entrySet()){
            String value=entry.getValue();
            String[] valArr=value.split("::");
            System.out.println(valArr[0]);
        }
        System.out.println(" Bottom View");
        for(Map.Entry<Integer,String> entry: hdMap.entrySet()){
            String value=entry.getValue();
            String[] valArr=value.split("::");
            System.out.println(valArr[valArr.length-1]);
        }
    }

}
