
package project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialization 
{
    public static void main(String[] args)  throws Exception
    {
        B obj=new B();
        obj.i=7;
        obj.j="Jayant";
        File f=new File("D:\\Programming\\JAVA\\Java Created Files\\Object.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        FileInputStream fis= new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        B obj1=(B)ois.readObject();
        System.out.println(obj1);
        
    }
    
}
class B  implements Serializable
{
    int i;
    String j;
    
    public String toString() {
        return "B{" + "i=" + i + ", j=" + j + '}';
    }
    
}
