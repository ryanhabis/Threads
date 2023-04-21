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
public class CDEvenRunJoin {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new CDEven();
        t1.start();
        System.out.println("t1 started - main will wait for it to finish before progressing ");
        t1.join();
        System.out.println("back in main to continue");
    }
}
