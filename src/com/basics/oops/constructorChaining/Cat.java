package com.basics.oops.constructorChaining;

public interface Cat {
    default void sound(){
        System.out.println("Mewo!");
    }
}
interface Dog{
    default void sound (){
        System.out.println("woof!");
    }
}
class Cog implements Cat,Dog{
    public void sound(){
        Dog.super.sound();
    }

}
class Demo{
    public static void main(String[] args) {
        Cog cog = new Cog();
        cog.sound();
    }
}