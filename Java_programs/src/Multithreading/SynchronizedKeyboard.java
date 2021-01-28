
package Multithreading;
class counter
{
    int count;
    public synchronized void increament()   //it prohibits both the thread to 
    {                                       // call the function at samen time
        count++;
    }
}

public class SynchronizedKeyboard 
{
    public static void main(String[] args) throws Exception
    {
        counter c=new counter();
        Thread t1=new Thread(()->
        {
            for (int i=1;i<=1000;i++)
            {
                c.increament();
            }
        });
         Thread t2=new Thread(()->
        {
            for (int i=1;i<=1000;i++)
            {
                c.increament();
            }
        });
        t1.start();      
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Count= "+c.count);
        
    }
    
}
