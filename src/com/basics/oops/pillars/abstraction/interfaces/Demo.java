package com.basics.oops.pillars.abstraction.interfaces;

public interface Demo {
    void display();
}
class Main{
    public static void main(String[] args) {
        // can we create and object of an interface
        Demo obj = new Demo() {
            @Override
            public void display() {
                System.out.println("normal code - boiler plate Code");
            }
        };
        obj.display();
        Demo obj1=()-> System.out.println("Scala code");
        obj1.display();
    }
}