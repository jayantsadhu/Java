package Basics;

public class LabeledBreak 
{
    public static void main(String[] args) 
    {
        //Break switch loop
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(i==3)
                    break;
                System.out.println("*");
            }
            System.out.println("");
        }
        
    }
    
}
