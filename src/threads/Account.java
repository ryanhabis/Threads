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
public class Account {
   

    private int balance;
    private int total;

    public Account()
    {
        this.balance = 0;
    }

    public Account(int balance)
    {
        this.balance = balance;
        this.total = balance;
    }

  //  public synchronized void deposit(int amount)
            public  void deposit(int amount)
    {
        int temp;
//        synchronized (this)
//        {
            total = total+amount;
            temp = this.balance;
            System.out.println(Thread.currentThread().getName() + "Before sleep balance " + balance + " temp " + temp);

            try
            {
                Thread.sleep(500);//throws the checked InterruptedException
               
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
           
            temp += amount;
            this.balance = temp;
            System.out.println("total " + Thread.currentThread().getName()+ " " + total);
             System.out.println(Thread.currentThread().getName() + " balance after amount added " + balance);
        //}
    }

    public void withdraw(int amount)
    {
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        this.balance -= amount;
    }

    public int getBalance()
    {
        return this.balance;
    }
}


