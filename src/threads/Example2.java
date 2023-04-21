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
public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        System.out.println("This is " + Thread.currentThread().getName() + " thread");
        for (int i = 3; i >= 1; i--) {
            System.out.println("I need to leave in " + i + " seconds");
            Thread.sleep(10000); //for at least 1 second
        }
        System.out.println("Goodbye");
    }
}

