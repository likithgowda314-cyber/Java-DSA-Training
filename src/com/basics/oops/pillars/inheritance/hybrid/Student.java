package com.basics.oops.pillars.inheritance.hybrid;
// In Hybrid we use implements and extends
interface Sports{
    void play();
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
public class Student extends Person implements Sports {
    Student(String name){
        super(name); // here we call the parent class constructor
    }

    @Override
    public void play(){
        System.out.println(name+ " Play football");
        System.out.println(name+ " Plays cricket");
    }

    public static void main(String[] args) {
        Student student= new Student("Naveen");
        student.play();
    }
}
