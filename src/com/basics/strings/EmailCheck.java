package com.basics.strings;

import java.lang.classfile.instruction.DiscontinuedInstruction;

public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gmail.com";
        String email2 = "worker1_edu";
        if (email1.contains("@")&& email1.endsWith(".com")){
            System.out.println("vaild email");
        }else{
            System.out.println("invaild email");
        }
        if (email2.contains("@")&& email2.endsWith(".com")){
            System.out.println("vaild email");
        }else{
            System.out.println("invaild email");
        }
        String USN= "1SG23EC057";
        System.out.println(USN.startsWith("1SG")); // True
        System.out.println(USN.startsWith("SG")); // False
    }
}
