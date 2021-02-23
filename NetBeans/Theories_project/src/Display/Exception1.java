
package Display;
import java.lang.Exception;

public class Exception1 
{
    public static void main(String[] args)  throws Exception
    {
        int i,j,k=0;
        i=8;
        j=0;
        try
        {
            k=i/j;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       finally             //it will print anyhow
        {
            System.out.println("Bye finaly");
        }
    }
    
}
