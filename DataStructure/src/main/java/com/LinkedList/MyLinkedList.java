package com.LinkedList;

public class MyLinkedList<T> {
    Node head;
    Node tail;
    int size=0;
    public void add(T data){
        if(head==null){
            head=new Node(data);
            head.setLink(null);
            tail=head;
            size=1;
        }else{
            Node n=new Node(data);
            tail.setLink(n);
            tail=n;
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void insertAt(int index,T data){
        Node n=new Node(data);
        Node nt=head;
        if(index>size-1){
            System.out.println("index is more than size");
            return;
        }
        while(index!=0){
            nt=nt.getLink();
            index--;
        }
        n.setLink(nt.getLink());
        nt.setLink(n);
    }

    public void deleteNode(int index){
        if(index>size-1){
            System.out.println("index is more than size");
            return;
        }
        if(index==0 && size==1){
            head=null;
        }else if(index==1){
            head=head.getLink();
        }else {
            Node nodeFound=head;
            Node previousNode=null;
            while(index-->0){
                previousNode=nodeFound;
                nodeFound=nodeFound.getLink();
            }

            previousNode.setLink(nodeFound.getLink());
        }

    }

    public void reverseLinkedList(){
        if(size>1){
            Node currentNode=head.getLink();
            Node nextNode=currentNode.getLink();
            currentNode.setLink(head);
            head.setLink(null);

            while(nextNode!=null){
                Node next=nextNode.getLink();
                nextNode.setLink(currentNode);
                currentNode=nextNode;
                nextNode=next;
            }
            head=currentNode;
        }

    }

    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.getData());
            n=n.getLink();
        }
    }
}

class Node<T>{
    Node(T data){
        this.data=data;
        this.link=null;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    private T data;
    private Node link;

}
