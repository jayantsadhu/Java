
package Display;

public class AnonymousObject 
{
    public static void main(String[] args) 
    {
        int i;                //i is a premitive variable
        //Ai obj=new Ai();    //obj is a reference variable
        new Ai().show();      //Anonymous object in heap memory only but it can be used when we call a obj once not multiple tyms
        
    }
    
}
class Ai
{
    public void show()
    {
        System.out.println("Class for checking anonymous object as it jst dont use any stack memory but only heap memory.");
    }
}