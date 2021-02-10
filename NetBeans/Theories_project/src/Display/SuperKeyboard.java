
package Display;

public class SuperKeyboard 
{
    public static void main(String[] args) 
    {
        Ae obj =new Ae();
        obj.show();
    }
    
}
class Ad
{
//    int i=3;
   public void show()
   {
       System.out.println("In class Ad");
   }
}
class Ae extends Ad
{
//    int i=9;
//     public void show()
//    {
//        System.out.println(super.i);
//    }
    public void show() 
    {
        super.show();
        System.out.println("In class Ae");
    }
}
