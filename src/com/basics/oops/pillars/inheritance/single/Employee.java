package com.basics.oops.pillars.inheritance.single;

public class Employee {
    int id;
    String name;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class lecture extends Employee{
    String subject;
    lecture(int id, String name,String subject){
    super(name , id );
    this.subject = subject;
    }
    void details(){
        System.out.println(id + " "+ name+ " "+ subject+" " );
    }

    public static void main(String[] args) {
        lecture lecture = new lecture(109,"naveen","math");
        lecture.details();
    }
}