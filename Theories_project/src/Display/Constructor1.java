
package Display;

public class Constructor1 
{
    public static void main(String[] args) 
    {
        abc object=new abc(5,4.9);
        
    }
    
}
class abc
{
    public abc()
    {
        System.out.println("Default constructor");
    }
    public abc(int a)
    {
        System.out.println(a+ " Constructor overloading.");
    }
    public abc(int a, double b)
    {
        System.out.println(a+" and "+b);
    }
    
}
