package Multithreading;


class Q 
{
    boolean valueSet=false;
    int num;
    public synchronized void put(int i)  //synchronized is necessary if we use wait
    {
        while(valueSet)
        {
            try{wait();} catch(Exception e){}
        }
        System.out.println("put : "+i);
        num=i;
        valueSet=true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueSet)
        {
            try{wait();} catch(Exception e){}
        }
        System.out.println("get : "+num);
        valueSet=false;
        notify();
    }
}

class producer implements Runnable
{
    Q q;
    public producer(Q q)
    {
        this.q=q;
    }
    public void run()
    {
        
        int i=0;
        while(true)
        {
            q.put(i++);
            try {Thread.sleep(1000);} catch(Exception e){}
            
        }
    }
}

class consumer implements Runnable
{
    Q q;
    public consumer(Q q)
    {
        this.q=q;
    }
    public void run()
    {
        
        while(true)
        {
            q.get();
            try {Thread.sleep(1000);} catch(Exception e){}
        }
    }
}




public class InnerCommunication 
{
    public static void main(String[] args) 
    {
        Q q=new Q();
        producer p=new producer(q);
        consumer c=new consumer(q);
        
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        
        t1.start();
       
        t2.start();
        
    }
    
}
