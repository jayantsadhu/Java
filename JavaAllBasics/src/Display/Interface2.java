
//package Display;
//
//public class Interface2 
//{
//    public static void main(String[] args) 
//    {
//         Al obj=()  -> System.out.println("show fuction without any class."); 
//         obj.show();
//    }
//}
//
//interface Al
//{
//    public void show();
//}
package Display;

public class Interface2 
{
    public static void main(String[] args) 
    {
        new Am().show();
    }
}

interface Al
{
	//to define a method within interface we have to use default/static instead public 
     default void show()  //if we use static instead of we can access the method directly from interface
    {
        System.out.println("Java 13.0.2 supports method defining by using the keyboard default and static.");
    }
}
class Am implements Al
{
    
}