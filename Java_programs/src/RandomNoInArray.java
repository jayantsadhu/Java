import java.util.Random;



public class RandomNoInArray 
{
  
    public static void main(String[] args) 
    {
        int a[]=new int[10];
        Random r= new Random();
        for(int i=0;i<a.length;i++)
        {
        a[i]=r.nextInt(15);
        }
        for(int i : a)
        {
            System.out.println(i);
           // Arrays property--> a.length will give the array's length'
        }
        
    }
    
}

    

