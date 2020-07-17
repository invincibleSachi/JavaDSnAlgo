package com.queues;

public class QueueMain {
    public static void main(String[] args){
        QueueLinkedListImpl<String> q=new QueueLinkedListImpl<String>();
        q.enQueue("Sachchida");
        q.enQueue("is");
        q.enQueue("a");
        q.enQueue("Great");
        q.enQueue("Programmer");
        while(q.getSize()>0){
            System.out.println(q.deQueue());
        }
    }
}
