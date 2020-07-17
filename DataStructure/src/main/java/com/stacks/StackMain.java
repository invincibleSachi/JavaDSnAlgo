package com.stacks;

import com.exceptions.StackException;

public class StackMain {
    public static void main(String[] args){
        StackArrayImpl<String> s=new StackArrayImpl<String>(10,String.class);
        try{
            s.push("Sachchida");
            s.push("Nand");
            s.push("Singh");
            s.push("is");
            s.push("a");
            s.push("great");
            s.push("techie");
            while(s.isEmpty()!=true){
                System.out.println(s.pop());
            }
        }catch (StackException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Linked List implementation");
        StackLinkedListImpl<String> sl=new StackLinkedListImpl<>();
        sl.push("Sachchida");
        sl.push("Nand");
        sl.push("Singh");
        sl.push("is");
        sl.push("a");
        sl.push("great");
        sl.push("techie");
        while(sl.isEmpty()!=true){
            System.out.println(sl.pop());
        }

        StackLinkedListImpl<Integer> sli=new StackLinkedListImpl<Integer>();
        sli.push(10);
        sli.push(11);
        sli.push(12);
        sli.push(13);
        sli.push(14);
        sli.push(15);
        while(sli.isEmpty()!=true){
            System.out.println(sli.pop());
        }

    }
}
