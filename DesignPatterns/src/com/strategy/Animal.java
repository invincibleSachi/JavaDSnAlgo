package com.strategy;

@Getter
public class Animal {
    public String sound;
    public FlyType flyType;
    Animal(){

    }
    public void makeSound(){
        System.out.println("it "+this.sound);
    }
}
