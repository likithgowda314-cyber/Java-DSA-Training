package com.basics.threads;

import com.basics.oops.pillars.inheritance.multiple.A;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("processing ATM Transaction!");
    }

    public static void main(String[] args) {
        ATMTransaction tx = new ATMTransaction();
        System.out.println("Thread state before start:" +tx.getState());  // NEW -> Object Created
        tx.start();
        System.out.println("Thread state after start:"+tx.getState()); //RUNNABLE
    }
}
/*
Code Explination
initially the thread is in the NEW state
after calling start(),it moves to RUNNABLE state , and it execute the run() methods
the exact timing of the state change will depend on the JVM machine
points to remember
thread cannot be star
 */