package com.basics.threads;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("printing numbers 1 to 5");
        for (int i =1;i<=5;i++){
            System.out.println("Printing Number:"+i);
            Thread.sleep(10000);
        }
        System.out.println("Sucessfullly Printed 1 to 5");
    }
}
/*
ℹ️CODE EXPLINATION
⭐Here,  the thread is paused for a fixed duration using sleep()
⭐the thread doesnot release any lock and it resumes automatically
after the given time.
⭐it will just interrupt the execution of the thread for that time
 */
