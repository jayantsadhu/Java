
package XMLSerialize; 

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.beans.XMLDecoder;
import java.util.List;

public class XMLDecoder  
{
    public static void main(String[] args)  throws Exception
    {
        XMLDecoder x1=new XMLDecoder(new BufferedInputStream(new FileInputStream
        (new File("D:\\Programming\\JAVA\\Java Created Files\\CollegeList.xml"))));
//        College c1= (College) x1.readObject();
//        List<Student> s1=c1.getStudents();
        List<Student> s2=(List<Student>) x1.readObject();
//        for(Student value: s1)
        System.out.println(s2);
        
    }
    
}
