package com.complex.algo.aux;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edge {
    WgVertex from;
    WgVertex to;
    boolean visited=false;
    int distance;
}
