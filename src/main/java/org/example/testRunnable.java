package org.example;

/**
 * Author: Avery Daniels
 * Stud no.: 216286182
 *
 */
public class testRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread stared....");
    }

    public static void main(String[] args) {
        testRunnable obj = new testRunnable();
        Thread t1 = new Thread(new testRunnable());
        t1.start();
    }
}
