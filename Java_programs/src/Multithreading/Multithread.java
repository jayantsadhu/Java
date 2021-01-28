
package Multithreading;

public class Multithread 
{
    public static void main(String[] args) 
    {
        Mythread obj=new Mythread();
        Thread t1=new Thread(obj);
        t1.start();
        
    }
    
}
class Mythread extends A implements Runnable
{
    int value[]={2,4,8,6,7,6,3,7,};
    public void run()
    {
        for(int i=0;i<8;i++)
        value[i]=value[i]*2;
        for(int i : value)
        {
            System.out.println(i);
        }
    }
}
class A
{
    
}