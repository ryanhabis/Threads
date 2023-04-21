/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author brosnanb
 */
public class Deadlock {
     public static Object lockObjectA = new Object();
    public static Object lockObjectB = new Object();
    public static void main(String args[]) {
        MyThreadClassA threadObjectA = new MyThreadClassA();
        MyThreadClassB threadObjectB = new MyThreadClassB();

        threadObjectA.start();
        threadObjectB.start();
    }

    private static class MyThreadClassA extends Thread {
        public void run() {
            synchronized(lockObjectA) {
                System.out.println("Thread A: Acquired lock A");

                try {
                    Thread.sleep(100);
                } catch (Exception ex) {}
                System.out.println("Thread A: Waiting for lock B");
                synchronized(lockObjectB) {
                    System.out.println("Thread A: Acquired lock on A and B");
                }
            }
        }
    }
    private static class MyThreadClassB extends Thread {
        public void run() {
            synchronized(lockObjectB) {
                System.out.println("Thread B: Acquired lock B");

                try {
                    Thread.sleep(100);
                } catch (Exception ex) {}
                System.out.println("Thread B: Waiting for lock A");

                synchronized(lockObjectA) {
                    System.out.println("Thread B: Acquired lock on A and B");
                }
            }
        }
    }
//    private static class MyThreadClassB extends Thread {
//        public void run() {
//            System.out.println("ThreadB about to try for lock A ");
//            synchronized(lockObjectA) {
//                System.out.println("Thread B: Acquired lock A");
//
//                try {
//                    Thread.sleep(100);
//                } catch (Exception ex) {}
//                System.out.println("Thread B: Waiting for lock B");
//
//                synchronized(lockObjectB) {
//                    System.out.println("Thread B: Acquired lock on B");
//                }
//            }
//        }
    }


