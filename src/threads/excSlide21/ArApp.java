package threads.excSlide21;

public class ArApp
{
    public static void main(String[] args) throws InterruptedException {
        //Create an SArray object, passing a value 6 to the constructor.
        SArray s =new SArray(6);
        //Create 2 threads to use this object
        Thread t1 = new Thread(new AWriter(s,5));
        Thread t2 = new Thread(new AWriter(s,2));
        //Start the threads
        t1.start();
        t2.start();


        //Wait until both threads have finished executing and then display the array values.
        t1.join();
        t2.join();

        System.out.println(s);

        //Make your program thread safe.
    }
}
