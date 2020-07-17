package com.LinkedList;

public class DetectACycleInLinkedList {
    public static void main(String[] args){
        MyLinkedList<Integer> ll=new MyLinkedList<Integer>();
        ll.add(34);
        ll.add(44);
        Node n=new Node(12);
        Node n1=new Node(13);
        n1.setLink(n);
        ll.add(n);
        ll.add(55);
        ll.add((35));
        ll.add((67));
        ll.add(n1);
        //ll.printList();
        //above line goes in infinite loop
        Node head=ll.getHead();
        Node hare=head;
        Node tortoise=head;
        while(head.getLink()!=null){
            if(hare.getLink()==null || hare.getLink().getLink()==null){
                System.out.println("Linked List has no cycle");
                break;
            }
            hare=hare.getLink().getLink();
            tortoise=tortoise.getLink();
            if(hare==tortoise){
                System.out.println("linked list has cycle");
                System.out.println("hare and tortoise met at "+hare.getData());
                break;
            }
        }

        //find the length of the cycle
        //fix the toirtoise and move here
        hare=hare.getLink();
        int lengthOfCycle=1;
        while(hare!=tortoise){
            hare=hare.getLink();
            lengthOfCycle++;
        }

        System.out.println("length of cycle in linkedList is "+lengthOfCycle);

        //move tortoise at a distance lengthOfClean
        hare=head;
        tortoise=head;
        for(int i=0;i<lengthOfCycle;i++){
            tortoise=tortoise.getLink();
        }
        int straightChainLen=0;
        while(hare!=tortoise){
            hare=hare.getLink();
            tortoise=tortoise.getLink();
            straightChainLen++;
        }

        System.out.println("length of straight Chain ="+straightChainLen);

        System.out.println("total length "+(straightChainLen+lengthOfCycle));



    }
}
