
package Display;

public class StringOperation 
{
    public static void main(String[] args) 
    {
        student s1=new student(30,"Jayant");
        System.out.println(s1.toString());
    }                      //by 
    
}
class student extends Object   //by default
{
    int Rollno;
    String Sname;
    public student(int a,String b)
    {
        Rollno=a;
        Sname=b;
    }
    public String toString()
    {
        return Sname+" : "+Rollno;
    }
}
