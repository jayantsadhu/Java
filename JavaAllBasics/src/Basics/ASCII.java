package Basics;

public class ASCII 
{
    public static void main(String[] args) 
    {
        //American Standard Code for Information Interchange
        // 7 bits = 2^7 = 128
        //0-127
        for(int i=0;i<128;i++)
        {
            System.out.printf("%d = %c \n",i,i);
        }
        
    }
    
}
