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

    public class AccountThread implements Runnable
{
    private Account account;

    public AccountThread(Account account)
    {
        this.account = account;
    }
    public AccountThread()
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        for(int i=0; i < 10; i++)
        {
            //long start = System.currentTimeMillis();
            account.deposit(100);
        //    System.out.println("Current thread is " + Thread.currentThread().getName());
//            long end = System.currentTimeMillis();
//            System.out.println("Deposit took " + (end - start) + " milliseconds");
        }
    }
}
