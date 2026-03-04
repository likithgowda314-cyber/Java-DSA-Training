package com.basics.threads;

public class ThreadWithPriority extends Thread{
    public void run(){
    for(int i=1 ;i<=3;i++) {
        System.out.println(Thread.currentThread().getName() + "| priority:"
                + Thread.currentThread().getPriority());
    }
    }

    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("low priority Thread");
        t2.setName("Medium priority Thread");
        t3.setName("high priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(1);// IllegalArgumentsException
        t2.setPriority(5);// IllegalArgumentsException
        t3.setPriority(10);// IllegalArgumentsException
        t1.start();
        t2.start();
        t3.start();
    }
}
/* ℹ️ Points to remember
⭐Thread priority is only a suggestion to the JVM or Scheduler
⭐Higher priority doesnot gaurantee earlier order of execution
⭐higher priority Threads may get more cpu time by the scheduler
⭐The actual behaviour depends on JVM & Operating system
 */
