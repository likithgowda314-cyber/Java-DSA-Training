package com.basics.threads;

public class DeadlockDemo {
    static final Object accountA = new Object();
    static final Object accountB = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (accountA){
                System.out.println("Thread 1 locked Account A");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 1 locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (accountB){
                System.out.println("Thread 2 locked Account B");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountA){
                    System.out.println("Thread 2 locked Account A");
                }
            }

        });
        t1.start();
        t2.start();
    }

}
/*
ℹ️ Points to remember
Thread 1 accquires a lock on Account A and then sleeps ,giving
THread 2 time to accquire a lock on Account B .
Thread 1 waits for Account A & Thread 2 waits for Account B.
Since neither thread releases them lock , both keep waiting for
each other creating DEADLOCK❌🔒Siuation
Deadlock Explinantion : Deadlock occurs when each thread is holding
a resource and waiting for the other thread to release it
➡️ when deadlock occurs ,it will not destroy the app ,it will
freeze it permanently.
🟢 how to resolve Deadlock -> Write better code !
 */