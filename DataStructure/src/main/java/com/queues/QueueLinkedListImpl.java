package com.queues;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class QueueLinkedListImpl<E> {
    Node<E> front;
    Node<E> rear;
    int size;
    QueueLinkedListImpl(){
        front=rear;
    }

    public void enQueue(E data){
        if(front==null){
            front=new Node(data);
            rear=front;
        }else{
            Node n=new Node(data);
            rear.setLink(n);
            rear=n;
        }
        size++;
    }

    public E peek(){
        return front.getData();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public E deQueue(){
        if(size==0){
            return null;
        }else {
            E e=front.getData();
            front=front.getLink();
            size--;
            return e;
        }
    }


}

@Data
@RequiredArgsConstructor
class Node<E>{
    private Node link;
    final private E data;
}
