
package Display;

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        
        Ab obj=new Ac();    //dynamic method dispatch run time polymorphism
        obj.show();
        obj.show(6);
        obj.show(5.7);
    }
    
}
class Ab
{
    public void show()
    {
        System.out.println("Without any parameter.");
    }
    public void show(int i)              //overloading
    {
        System.out.println("With a parameter "+i);
    }
    public void show(double d)
    {
        System.out.println("With a double type parameter "+d);
    }
}
class Ac extends Ab
{
    public void show()       //overriding
    {
        System.out.println("In class Ac");
    }
}