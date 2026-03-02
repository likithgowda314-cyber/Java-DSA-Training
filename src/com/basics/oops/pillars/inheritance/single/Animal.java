package com.basics.oops.pillars.inheritance.single;

public class Animal {  // Parent Class // Super Class
    void eat(){
        System.out.println("Animal eats some food");
    }

}
class Cat extends Animal{ // Child CLass // Sub Class //
    // we use extend to use the upper class
    void run(){
        System.out.println("cats run very fast");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}