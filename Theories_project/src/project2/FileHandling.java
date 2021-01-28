
package project2;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.File;

public class FileHandling 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("D:\\Programming\\jayant.txt");
        FileOutputStream fos= new FileOutputStream(f);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Hey bro how are u?");
        
    }
    
    
}
