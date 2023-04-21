/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brosnanb
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        Thread count1 = new CountDownEven();
                                        // instantiate the countdown threads
        Thread count2 = new CountDownOdd();
        count1.start();                       // start the countdown threads
        count2.start();
        count1.interrupt();
        System.out.println("in main");
    }
}

class CountDownEven extends Thread            // this class counts even numbers
{
    public void run(){
        boolean run = true;
        System.out.println("CountDownEven");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            run = false;
        }
            
    
    while(run){
       
        for (int i = 10; i > 0; i-= 2)
        {
            System.out.println(this.getName() + " Count " + i);
            Thread.yield(); 
           
            
        }
    }
    }
}
class CountDownOdd extends Thread             // this class counts odd numbers
{
    public void run()
    {
        for (int i = 9; i > 0; i-= 2)
        {
            System.out.println(this.getName() + " Count " + i);
            Thread.yield();                   // allow the other thread to run
        }
    }
}

    
    

