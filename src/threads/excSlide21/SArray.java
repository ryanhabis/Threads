package threads.excSlide21;

import java.util.Arrays;
import java.util.Random;

public class SArray
{
    //2 instance variables; an array of integers, which will be shared by multiple threads, an int that will
    //  contain the index of the next element to be written
    private int[] ar;
    private int nIndex;

    //1 Static variable which will be a Random object
    private static Random rg;

    //A Constructor that creates an array – the number of elements is passed as a parameter.
    public SArray(int element)
    {
        ar = new int[element];
    }

    //An add method that accepts as a parameter the value to be added to the array.
    // The add method should be written so that issues will arise when multiple threads are populating the array.
    public synchronized void add(int value)
    {
        System.out.println(Thread.currentThread());
        ar[this.nIndex] = value;
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("The thread ran into some trouble.");
        }
        nIndex++;
    }


    @Override
    public String toString() {
        return "SArray{" +
                "ar=" + Arrays.toString(ar) +
                ", nIndex=" + nIndex +
                '}';
    }
}
