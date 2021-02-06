
package Display;

public class StringSplit 
{
    public static void main(String[] args) 
    {
        String str ="Jayant, Akash B, Nilanjan, Akash S, Niladri";
        String names[]= str.split(",");
        System.out.println(names.length);
        for(String s: names)
        System.out.println(s);
        
    }
    
}
