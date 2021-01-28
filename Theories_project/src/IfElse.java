
public class IfElse 
{
    public static void main(String[] args) 
    {
        int num1=100;
        
        if(num1%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        int a,b,c;
        a=4;
        b=6;
        c=3;
        if(a>b && a>c)
            System.out.println("A");
        //For OR operation use ||
        else if(b>c)
            System.out.println("B");
        else
            System.out.println("C");
        
    }
    
}
