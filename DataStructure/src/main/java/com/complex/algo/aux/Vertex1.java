package com.complex.algo.aux;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vertex1 {
    String name;
    int state;
    String predecessor;
    int distance;
    public Vertex1(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
