package com.basics.oops.pillars.abstraction.interfaces;

public interface Animal {
    void run();
    void loves_to_eat();
        // ℹ️ Interface abstract cannot have body
    // ❌Interface don't have normal methods
    // so they exhibit 100% abstraction
    // the methods are defined int the child class
}
class Rat implements Animal{
    @Override
    public void run() {
        System.out.println("Rats run fast.");
    }

    @Override
    public void loves_to_eat(){

        System.out.println("Rats love to eat cheese.");
    }
}
class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("Cats run fast.");
    }
    @Override
    public void loves_to_eat(){

        System.out.println("Cats love to eat rat.");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat = new Cat();
        cat.run();
        cat.loves_to_eat();
    }
}
