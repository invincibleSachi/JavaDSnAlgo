package com.strategy;

public class Bird extends Animal{
    Bird(){
        flyType=new CanFly();
    }
}
