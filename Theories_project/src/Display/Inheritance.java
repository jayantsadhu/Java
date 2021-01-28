
package Display;

public class Inheritance 
{
    public static void main(String[] args) 
    {
        B obj=new B();
        obj.num1=7;
        obj.num2=3;
        obj.add();
        obj.sub();
        
    }
}
class A          //super ,parent ,
{
    int num1,num2;
    public void add()
    {
        System.out.println(num1+num2+ " in class A");
    }
    
}
class B extends A        //sub, child
{
    public void sub()
    {
        System.out.println(num1-num2+ " in class B");
    }
}