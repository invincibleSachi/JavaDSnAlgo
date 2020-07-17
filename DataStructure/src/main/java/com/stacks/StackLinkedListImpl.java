package com.stacks;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class StackLinkedListImpl<E> {
    Node<E> stack;
    Node<E> top;
    int size;
    public void push(E data){
        Node<E> n=new Node(data);
        if(top==null){
            stack=n;
            top=n;
        }else {
            n.setLink(top);
            top=n;

        }
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public E peek(){
        return top.getData();
    }

    public E pop(){
        E e= top.getData();
        top=top.getLink();
        size--;
        return e;
    }
}
@Data
@RequiredArgsConstructor
class Node<E>{
    private Node link;
    final private E data;
}
