package com.basics.oops.withconstructor;

public class Student {
    //Instance variables
    int USN;
    String name;
    int marks;
    static String college = "SNPSU";
    Student(int USN, String name,int marks){
        this.USN=USN;
        this.name=name;
        this.marks=marks;
    }
    void evaluatemarks(){
        if(marks<45){
            System.out.println(name + " has failed ");
        }else{
            System.out.println(name + " has PASSES");
        }
    }
    void studentdetails(){
        System.out.println(name+ "-" +USN+ "-" +marks+ "-" +college);
    }
    public static void main(String[] args) {
        // object creation syntax: classname obj =  new classname();
        Student s1 = new Student(70,"Naveen",98);
        Student s2 =new Student(57,"liki",100);
        // It reduces code duplication ->Constructor
        Student s3 =new Student(60,"akash",99);
        // it reduces code duplication
        s1.evaluatemarks();
        s2.evaluatemarks();
        s3.evaluatemarks();
        s1.studentdetails();
        s2.studentdetails();
    }
}
