package com.complex.algo.avltree;

import com.complex.algo.aux.ANode;

public class AvlTreeImpl {
    public ANode root;
    public void insertNode(int data){
        if(this.root==null){
            this.root=new ANode(data);
        }

    }

    public ANode insertNode(ANode node, int data){
        if(node==null){
            return node;
        }
        if(node.getData()>=data){
            if(insertNode(node.getLeftNode(),data)==null){
                node.setLeftNode(new ANode(data));
            }
        }else {
            if(insertNode(node.getRightNode(),data)==null){
                node.setRightNode(new ANode(data));
            }
        }
        node.setHeight(Math.max(getHeight(node.getLeftNode()),getHeight(node.getRightNode()))+1);
        int balance=getBalance(node);

        return node;
    }

    public int getHeight(ANode node){
       if(node==null){
           return 0;
       }
       return node.getHeight();
    }

    public int getBalance(ANode node){
        if(node==null){
            return 0;
        }
        return Math.max(getHeight(node.getLeftNode()),getHeight(node.getRightNode()));
    }


}
