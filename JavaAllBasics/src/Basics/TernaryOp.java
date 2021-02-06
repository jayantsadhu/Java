package Basics;

public class TernaryOp 
{
    public static void main(String[] args) 
    {
       /* int i=2;
        int j=5;
        if(i==1)
            j=8;
        else
            j=10;  
        j==2?8:10;
        System.out.println(j);
        */
        Object obj1;
        Object obj2;
        if(true)
            obj1=new Integer(10);
        else
            obj1=new Double(15.5);
        System.out.println(obj1);
        
        obj2=true?new Integer(10):new Double(15.5);
        System.out.println(obj2);
        
        
    }
    
}
