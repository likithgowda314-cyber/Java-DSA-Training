package com.basics.arrays;
// Arrays of objects {students}{interns}{books}{bikes}
class Student{
    String name;
    int usn;
}
class Intern{
    String name;
    int id;
    Intern(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class E8 {
    public static void main(String[] args) {
       // int[]arr = {1,2,3,4};
        Student[] students= new Student[3];
        // {student[0]{},student[1]{},student[2]{}};
        students[0] = new Student();
        students[0].name= "likith";
        students[0].usn=95;
        System.out.println(students[0].name+" , "+students[0].usn);
        Intern[] interns = new Intern[]{
                new Intern("likit",100),
                new Intern("nischitha",101),
                new Intern("akash",103)
        };
        for (Intern i :interns){
            System.out.println(i.name + " ," + i.id);
        }
    }
}