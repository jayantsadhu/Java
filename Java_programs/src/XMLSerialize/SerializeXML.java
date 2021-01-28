
package XMLSerialize;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML 
{
    public static void main(String[] args)  throws Exception
    {
        Student st1=new Student();
        st1.setRollno(102);
        st1.setSname("Anindya");
        
        Student st2=new Student();
        st2.setRollno(76);
        st2.setSname("Prakhar");
        List<Student> s=new ArrayList<>();
        s.add(st1);
        s.add(st2);
        College c=new College();
        c.setStudents(s);
        
        File f=new File("D:\\Programming\\JAVA\\Java Created Files\\CollegeList.xml");
        XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(f)));
        x.writeObject(c);
        x.close();
        
    }
    
}
