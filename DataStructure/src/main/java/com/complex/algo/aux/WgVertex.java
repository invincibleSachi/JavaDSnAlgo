package com.complex.algo.aux;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WgVertex {
    String name;
    int state;
    String predecessor;
    int distance;
    public WgVertex(String name){
        this.name=name;
        this.distance=Integer.MAX_VALUE;
        this.predecessor="NONE";
    }
    public String toString(){
        return name;
    }
}