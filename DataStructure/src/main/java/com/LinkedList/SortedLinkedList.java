package com.LinkedList;

public class SortedLinkedList {
    NodeC start=null;

    public void add(int data){
        if(start==null){
            start=new NodeC(data);
        }else {
            NodeC p1 =start;
            NodeC p2 =p1.getLink();
            NodeC n=new NodeC(data);
            if(p2==null){

                start.setLink(n);
                p2=n;
            }else{
                while(p2!=null || p2.getData()>=data){
                    p1=p2;
                    p2=p2.getLink();
                }

                if(p2!=null){
                    p1.setLink(n);
                    n.setLink(p2);
                }else {
                    p1.setLink(n);
                }

            }

        }
    }

    public void printall(){
        NodeC p=start;
        System.out.println(p.data);
        while(p.getLink()!=null){
            p=p.getLink();
            System.out.println(p.data);

        }
    }
}
