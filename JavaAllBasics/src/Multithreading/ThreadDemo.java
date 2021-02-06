
package Multithreading;

public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        Hii obj1=new Hii();
        Hello obj2=new Hello();
        obj1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        
    }
    
}
class Hii extends Thread
{
    public void run() 
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hii");
            try {Thread.sleep(1000);} catch(Exception e){}
        }   
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");       
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
