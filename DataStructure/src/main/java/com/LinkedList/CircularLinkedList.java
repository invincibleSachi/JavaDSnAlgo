package com.LinkedList;

import lombok.Data;

public class CircularLinkedList {
    NodeC start=null;
    NodeC end=null;

    CircularLinkedList(){

    }

    public void add(int data){
        NodeC n=new NodeC(data);
        if(start==null){
            start=n;
            end=start;
        }else{
            n.setLink(start);
            end.setLink(n);
            end=n;
        }
    }

    public void printLl(){
        NodeC pointer=start;
        System.out.println(pointer.data);
        while(pointer!=end){
            pointer=pointer.getLink();
            System.out.println(pointer.data);

        }
    }


}
@Data
class NodeC{
    NodeC(int data){
        this.data=data;
    }
    int data;
    NodeC link;

        }