/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import static threads.Threads2.count2;



/**
 *
 * @author brosnanb
 */
public class Threads2 {
public static Thread count1 = new CountDownEven1();
public static Thread count2 = new CountDownOdd1();
            
    public static void main(String[] args) {
//       
        count1.start();                       // start the countdown threads
        count2.start();
        System.out.println("in main");
    }
}

class CountDownEven1 extends Thread // this class counts even numbers
{

    public void run() {
        
        System.out.println("CountDownEven");
        try {
            count2.join();
        } catch (InterruptedException ex) {
           ex.getMessage();
        }
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(this.getName() + " Count " + i);
            

        }
    }
}

class CountDownOdd1 extends Thread // this class counts odd numbers
{

    public void run() {
        for (int i = 9; i > 0; i -= 2) {
            System.out.println(this.getName() + " Count " + i);
                             // allow the other thread to run
        }
    }
}
