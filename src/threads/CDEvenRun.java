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
public class CDEvenRun{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new CDEven();
        t1.start();
        System.out.println("t1 started - ready to run but main still has control of the processor");
        System.out.println("main still running");
    }
    
    
}
