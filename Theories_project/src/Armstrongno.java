
public class Armstrongno 
{
    public static void main(String[] args) 
    {
        int n=153,r,s=0;
        int a=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+r*r*r;
        }
        if(s==a)
            System.out.println("A Armstrong number.");
        else
            System.out.println("Not a Armstrong number.");
        
    }
  
}
