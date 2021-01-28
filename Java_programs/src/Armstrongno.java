
public class Armstrongno 
{
    public static void main(String[] args) 
    {
        int n=153,r,s=0;
        int a=n;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            s=s+r*r*r;
        }
        if(s==n)
            System.out.println(s+" A Armstrong number.");
        else
            System.out.println("Not a Armstrong number.");
        
    }
  
}
