package com.basics.exceptions;

public class E3 {
    static  void checkAge(int age){
        if(age>=18){
            System.out.println("Access Granted - Eligeible.");
        }else{
            throw new RuntimeException("Acess Denied - NOT Eligible"); // if we use throw key word
        }
        System.out.println("User starts the app!");
    }
    public static void main(String[] args) {
        checkAge(20);

    }
}
