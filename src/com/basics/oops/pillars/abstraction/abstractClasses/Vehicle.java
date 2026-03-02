package com.basics.oops.pillars.abstraction.abstractClasses;
 abstract class Vehicle {
    // There are Two types of method :
     // 1. Normal or concrete
     void vehicle_type(){
         System.out.println("Two wheeler or four wheeler");
     }
     //2.Abstract method:
     abstract void start();
         // An abstract method cannot have a body
     // this method will be written in child body
     // if there are only abstract methods - 100% abstraction
     // if there is even 1 normal method - not 100% abstraction
}
class NinjaH2R extends Vehicle{

    @Override
    void start() {
        System.out.println("Pulsar starts with self and kick.");
    }
}
class Hilux  extends Vehicle{
    @Override
    void start() {
        System.out.println("Hilux starts with key.");
    }
}
class Demo{
    public static void main(String[] args) {
        NinjaH2R bike = new NinjaH2R();
        Hilux car = new Hilux();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}