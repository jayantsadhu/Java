package Basics;

public class Perfectno 
{
    public static void main(String[] args) 
    {
        int s=0,n=28;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        if(s==n)
            System.out.println("It's a perfect number");
        else
            System.out.println("Not a perfect number");
    }
    
}
