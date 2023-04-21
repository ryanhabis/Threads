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
public class Counter extends Thread{
    public static int count;
    public int value;
    public Counter(int v){
        value = v;
    }
    @Override
    public void run(){
        count = count + value;
    }
    

   
}
