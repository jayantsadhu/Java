
package Display;
//StringBuffer and StringBuilder methods
public class StringBuffer 
{
    public static void main(String[] args)   
    {
        StringBuilder stb=new StringBuilder("Jayant");
        stb.append(" Sadhu");
        stb.replace(7, 12,"Kumar");
        System.out.println(stb);
        
    }  
}

