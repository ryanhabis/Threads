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
public class CDApp {
     public static void main(String[] args)
    {
//        Thread count3 = new Thread(new CDEvenRun());
//        count3.start();
        Thread count1 = new CDEven();
                                       // instantiate the countdown threads
        Thread count2 = new CDOdd();
        count1.start();                       // start the countdown threads
        count2.start();
    }
}
