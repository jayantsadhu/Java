
package Display;

public class ThisKey 
{
    public static void main(String[] args) 
    {
        Ah obj=new Ah(5);
        obj.display();
        
    }
    
}
class Ah
{
    private int x;         //x is a instance variable here
    public Ah(int x)       //here x is a local variable
    {
        this.x=x;           //used to indicate a instance variable
    }
    public void display()
    {
        System.out.println(x);
    }
}
