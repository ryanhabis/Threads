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
public class AccountApp {
     public static void main(String[] args) throws InterruptedException
    {
        Account account = new Account(500);
        AccountThread accountThread = new AccountThread(account);
        Thread t1 = new Thread(accountThread);
        Thread t2 = new Thread(accountThread);
       // Thread t3 = new Thread(accountThread);
        t1.start();
        t2.start();
       // t3.start();
        
        
            t1.join();
            t2.join();
        //    t3.join();
        
        
        System.out.println("Final balance is " + account.getBalance());
    }
}
