package com.strategy;

public class Dog extends Animal {
    Dog(){
        super();
        flyType=new CanFly();
    }

}
