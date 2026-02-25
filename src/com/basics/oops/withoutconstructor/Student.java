package com.basics.oops.withoutconstructor;

public class Student {
    //Instance variables
    int USN;
    String name;
    int marks;
    void evaluatemarks(){
        if(marks<45){
            System.out.println(name + " has failed ");
        }else{
            System.out.println(name + " has PASSES");
        }
    }
    public static void main(String[] args) {
        // object creation syntax: classname obj =  new classname();
        Student s1 = new Student();
        s1.USN=70;
        s1.name="Naveen pandu ";
        s1.marks=34;
        Student s2 =new Student();
        s2.USN=57;
        s2.name="akash";
        s2.marks=100;
        Student s3 =new Student();
        s3.USN=57;
        s3.name="liki";
        s3.marks=100;
        s1.evaluatemarks();
        s2.evaluatemarks();
        s3.evaluatemarks();
    }
}
