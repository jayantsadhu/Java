
package Multithreading;

public class Prioritythread 
{

    public static void main(String[] args) 
    {
        Thread t1=new Thread(()->
             {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Hii");
                    try {Thread.sleep(1000);} catch(Exception e){}
                }   
             });
        
        Thread t2=new Thread(()->          
        
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Hello");       
                    try {Thread.sleep(1000);} catch(Exception e){}
                }
            });
        t1.setName("Hii thread");
        t2.setName("Hello thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        
        t1.setPriority(Thread.MIN_PRIORITY);   //t1.setPriority(6);  we can set any within 10
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        
        t1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        t2.start();
        
    }
    
}

