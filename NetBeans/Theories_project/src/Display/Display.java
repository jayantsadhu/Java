
package Display;

public class Display 
{
    public static void main(String[] args) 
    {
        display1 obj =new display1();
        obj.show(54,5,8);
         
    }
    
}
class display1
{
    /*public void show(int a)
    {
        System.out.println(a);
    }*/
   public void show(int ...a)    //varargs   variable arguments   Arrays.as
   {
       for(int i : a)
       {
           System.out.println(i);
       }
   }
}
//main method 
// static public void main(String ... args)