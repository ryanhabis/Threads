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
public class AppCount {
    public static void main(String[] args) {
        Counter c1 = new Counter(2);
        Counter c2 = new Counter(4);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.run();
        t2.run();
        System.out.println(Counter.count);
    }
}
