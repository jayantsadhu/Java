
package Multithreading;

public class LamdaExpression 
{
    public static void main(String[] args) 
    {
        Runnable obj1=new Runnable()
        {
             public void run() 
             {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Hii");
                    try {Thread.sleep(1000);} catch(Exception e){}
                }   
             }
       };
        
        Runnable obj2=()->          //Lamda Expression as its a Functional interface
        
            {
                for(int i=1;i<=5;i++)
                {
                    System.out.println("Hello");       
                    try {Thread.sleep(1000);} catch(Exception e){}
                }
            };
        
        
        Thread t1=new Thread(obj1);
        t1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        Thread t2=new Thread(obj2);
        t2.start();
        
    }
    
}
