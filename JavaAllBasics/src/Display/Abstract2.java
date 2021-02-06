
package Display;

public class Abstract2 
{
    public static void main(String[] args) 
    {
        Jayantphone obj= new Pavelphone();
        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
        
    }
}
abstract class Jayantphone
{
    public void call()
    {
        System.out.println("Calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}
abstract class akashphone extends Jayantphone
{
    public void move()
    {
        System.out.println("Moving...");
    }
}
class Pavelphone extends akashphone    //concrete class
{
    public void dance()
    {
        System.out.println("Dancing...");
    }
    public void cook()
    {
        System.out.println("Cooking...");
    }
}