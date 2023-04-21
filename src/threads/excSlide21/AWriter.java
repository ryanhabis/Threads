package threads.excSlide21;

public class AWriter implements Runnable
{

    //2 instance variables one of type Sarray and the other sValue, of type int which will contain the first value that it
    // will insert into the array
    private SArray a1;
    private int sValue;


    //A fully parameterised constructor
    public AWriter (SArray s ,int v)
    {
        this.a1 = s;
        sValue = v;
    }

    //The run method should call the add method in Sarray to insert 3 consecutive values into the array starting at svalue
    @Override
    public void run()
    {
        System.out.println("I have control of the processor [" + Thread.currentThread().getId() + "]");
        for (int i = 0; i < 3; i++) {
            a1.add(sValue+i);
        }
    }
}
