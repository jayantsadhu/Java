
package Multithreading;

public class IsAliveJoin 
{
    
    public static void main(String[] args) throws Exception
    {
        Hii obj1=new Hii();
        Hello obj2=new Hello();
        obj1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        obj2.start();
        System.out.println(obj1.isAlive());   //isAlive function can detect whether the obj is still running or not. 
        obj1.join();   //It will make main thread to wait till the obj1&2 are not executing completely
        obj2.join();
        System.out.println(obj2.isAlive());
        System.out.println("Bye");
        
    }
    
}

class Hii1 extends Thread
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

class Hello1 extends Thread
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

