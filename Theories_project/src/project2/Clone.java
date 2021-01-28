
package project2;

public class Clone 
{
    public static void main(String[] args)  throws CloneNotSupportedException
    {
        A obj=new A();
        obj.i=5;
        obj.j=6;
        A obj1=(A)obj.clone();
        obj1.i=7;
        System.out.println(obj);
        System.out.println(obj1);
    }
    
}
class A implements Cloneable 
{
    int i;
    int j;
    public String toString()
    {
        return i+","+j;
    }
    public Object clone()   throws CloneNotSupportedException
    {
        return super.clone();
    }
}
