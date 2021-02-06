
package Display;

public class Abstract 
{
    public static void main(String[] args) 
    {
        phone obj1=new Iphone();
        phone obj2=new samsung();
        show(obj2,"S7");
        
    }
    public static void show(phone p,String b)
    {
        p.showconfig(b);
    }
}
abstract class phone
{
    public abstract void showconfig(String b);
}
 class samsung extends phone
{
    public void showconfig(String a)
    {
        if(a=="S7")
            System.out.println("2gb RAM,16gb ROM, 16mp Camera");
        if(a=="Edge")
            System.out.println("3gb RAM, 32gb ROM, 21mp Camwra");
    }
 }
class Iphone extends phone
{
    public void showconfig(String a)
    {
        if(a=="X")
        System.out.println("1.5gb RAM,16gb ROM, 12mp Camera");
    }
}