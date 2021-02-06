
package Display;
//StringBuffer and StringBuilder methods
public class StringBuffer 
{
    public static void main(String[] args)   
    {
        StringBuilder stb=new StringBuilder("Jayant");
        stb.append(" Sadhu");
        stb.replace(7, 12,"Kumar");     //start,end,String
        System.out.println(stb);
        
    }  
}

