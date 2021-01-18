package org.example;

/**
 * Author: Avery Daniels
 * Stud no.: 216286182
 *
 */
public class testExtendThread extends Thread
{
    public void run() {
        System.out.println("Thread started...");
    }
    public static void main( String[] args )
    {
        Thread t1 = new testExtendThread();
        Thread t2 = new testExtendThread();

        t1.start();
        t2.start();
    }


}
