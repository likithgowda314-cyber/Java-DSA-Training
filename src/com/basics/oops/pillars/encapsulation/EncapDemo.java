package com.basics.oops.pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(57);
        e1.setEmail("rx100@gmail.com");
        System.out.println(e1.getId());
        System.out.println(e1.getEmail());

    }
}
