
package Display;

public class Interface 
{
    public static void main(String[] args) 
    {
        Aj obj=new Ak();
        obj.show();
        //obj.ipl();   //coz we created the object Aj as the reference. 
        
             
    }
    
}
interface Aj
{
    public void show();
}
class Ak implements Aj
{
    public void show()
    {
        System.out.println("Show has been overidden.");
    }
    public void ipl()
    {
        System.out.println("Ipl 2020 has been cancelled due to COVID 19 spread.");
    }
}
