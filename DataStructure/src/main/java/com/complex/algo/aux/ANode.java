package com.complex.algo.aux;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ANode {
    ANode leftNode;
    ANode rightNode;
    int height;
    int data;

    public ANode(int data){
        this.data=data;
        this.height=1;

    }
}
