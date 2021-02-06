
package Display;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
        
public class Exception2  
{
    public static void main(String[] args)  throws Exception
    { 
        BufferedReader br=null;
        try
        {
            Aw str=new Aw();
            br=new BufferedReader(new InputStreamReader (System.in));
            str.Name=br.readLine();
            System.out.println(str.toString()+ " Sadhu");
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }
        finally
        {
            br.close();
        }       
   }
}

class Aw
{
    String Name;
    public String toString()
        {
            return Name;
        }
}