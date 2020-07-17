package com.queues;

import java.lang.reflect.Array;

public class QueueCircularLlistImpl<E> {
    int front=-1; int rear=-1;
    E[] e;
    public QueueCircularLlistImpl(int size,Class c){
        e= (E[]) Array.newInstance(c,size);
    }

    public void add(E element){
        rear=(rear+1)%e.length;
        e[rear]=element;

    }

    public E delete(){
        E el=e[front];
        front=(front+1)%e.length;
        return el;

    }

    public boolean isEmpty(){
        return (front==-1)||(front==rear+1)||((front==0)&&(rear==e.length-1));
    }
}
