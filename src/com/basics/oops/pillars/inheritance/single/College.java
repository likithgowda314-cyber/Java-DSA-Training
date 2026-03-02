package com.basics.oops.pillars.inheritance.single;

public class College {
    static String College="SNPSU";
    String name;
    String address;
    int pincode;
    College(String name , String address, int pincode){
        this.name=name;
        this.address=address;
        this.pincode=pincode;
    }
}
class Department extends College{
    String block;
    int lecturercount;
    Department(String name ,String address,String block, int pincode){
        super(name,address,pincode);
        this.block=block;
    }
    void details(){
        System.out.println(name+" "+address+" "+block+" "+pincode+" "+lecturercount+"");

    }

    public static void main(String[] args) {
        Department Details = new Department("liki","nagarbahvi","a",50);
        Details.details();
    }

}
