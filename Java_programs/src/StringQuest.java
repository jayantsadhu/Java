
import java.util.Scanner;


public class StringQuest 
{
    public static void main(String[] args) 
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter both the strings.");
        s1=sc.nextLine();
        s2=sc.nextLine();
        
        System.out.println("s1's length is " +s1.length()+ " and s2's length is "+ s2.length());
        
        String s3=s1.concat(s2);
        String s4=s1+s2;
        System.out.println(s3+ " and "+s4);
        
        s1=s1.toUpperCase();
        System.out.println("s1 In uppercase "+s1);
    }
    
}
