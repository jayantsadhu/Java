
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int a=0,b=0,c=1;
        for(int i=1;i<=20;i++)
        {           
            System.out.println(c); 
            a=b;
            b=c;
            c=b+a;
            
        }
        
    }
    
}
