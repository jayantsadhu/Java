
package Display;

public class FinallKeyboard 
{
    public static void main(String[] args) 
    {
        final int i;            //Final variable
        i=9;
       // i=8;                 //showing error, can't change i value as it's already assigned by final keyboard 
        Ag obj=new Ag();
        obj.abc();
        System.out.println(i);
    }
    
}
/*final*/ class Af       //class final key cannot extends by other class
{
/*final*/ public void abc()             //method final key , cannot be overridden
    {
        System.out.println("In class Af.");
    }
}
class Ag extends Af
{
    public void abc()
    {
        System.out.println("In class Ag");
    }
}