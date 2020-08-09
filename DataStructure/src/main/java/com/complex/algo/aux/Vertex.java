package com.complex.algo.aux;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vertex {
    String name;
    int state;
    public Vertex(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
