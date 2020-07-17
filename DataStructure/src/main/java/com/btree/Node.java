package com.btree;

import lombok.Data;

@Data
public class Node {
    Node(int data){
        this.data=data;
    }
    int data;
    Node left;
    Node right;
}
