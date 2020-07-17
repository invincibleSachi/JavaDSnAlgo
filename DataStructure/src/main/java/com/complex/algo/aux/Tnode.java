package com.complex.algo.aux;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tnode {
    public Tnode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        hd=0;
    }
    Tnode left;
    Tnode right;
    int data;
    int hd;

}
