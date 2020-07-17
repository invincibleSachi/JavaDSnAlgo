package com.LinkedList;

public class MainFunc {

    public static void main(String[] args){
        MyLinkedList<String> ll=new MyLinkedList<String>();
        ll.add("Duggu");
        ll.add("Is");
        ll.add("A");ll.add("Good");
        ll.add("Boy");

        ll.printList();
        ll.insertAt(3,"Bad");
        System.out.println("-------------After insert -------------------");
        ll.printList();
        System.out.println("-------------After delete -------------------");
        ll.deleteNode(3);
        ll.printList();
        ll.reverseLinkedList();
        System.out.println("-------------After reverse -------------------");
        ll.printList();
        ll.sortLinedList();
        System.out.println("-------------After sorting -------------------");
        ll.printList();

        MyLinkedList<Integer> l1=new MyLinkedList<Integer>();
        MyLinkedList<Integer> l2=new MyLinkedList<Integer>();
        l1.add(4);
        l1.add(6);
        l1.add(2);
        l1.add(1);
        l1.add(9);
        l1.add(11);
        l1.add(33);
        System.out.println("-------------l1 After sorting -------------------");
        l1.sortLinedList();
        l1.printList();
        l2.add(9);
        l2.add(6);
        l2.add(13);
        l2.add(18);
        l2.add(20);
        l2.add(23);
        l2.sortLinedList();
        System.out.println("-------------l2 After sorting -------------------");
        l2.printList();

        System.out.println("------------- Merged -------------------");
        MyLinkedList merged=merge2SortedLinkedLists(l1,l2);
        merged.printList();
    }

    public static MyLinkedList merge2SortedLinkedLists(MyLinkedList ml1,MyLinkedList ml2){
        MyLinkedList mergedLinekedList=new MyLinkedList();
        Node list1=ml1.head;
        Node list2=ml2.head;
        while (list1!=null || list2!=null){
            if(list1==null){
                mergedLinekedList.add(list2.getData());
                list2=list2.getLink();
                continue;
            }
            if(list2==null){
                mergedLinekedList.add(list1.getData());
                list1=list1.getLink();
                continue;
            }
            if(ml1.compare(list1.getData(),list2.getData())<0){
                mergedLinekedList.add(list1.getData());
                list1=list1.getLink();
            }else if(ml1.compare(list1.getData(),list2.getData())>0) {
                mergedLinekedList.add(list2.getData());
                list2 = list2.getLink();
            }else{
                mergedLinekedList.add(list1.getData());
                mergedLinekedList.add((list2.getData()));
                list1=list1.getLink();
                list2=list2.getLink();
            }
        }
        return mergedLinekedList;
    }
}
