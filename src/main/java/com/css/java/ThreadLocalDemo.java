package com.css.java;

/**
 * @author Kishore Routhu on 13/7/17 1:39 PM.
 */
public class ThreadLocalDemo extends Thread {

    public static void main(String[] args) {
        Thread thread1 = new ThreadLocalDemo();
        thread1.start();

        Thread thread2 = new ThreadLocalDemo();
        thread2.start();
    }

    public void run() {
        //Create context with transaction ID for running thread and set to ThreadLocale
        Context context = new Context();
        context.setTransactionId(getName());

        MyThreadLocal.set(context);
        new BusinessService().businessMethod();
        MyThreadLocal.unset();
    }
}
