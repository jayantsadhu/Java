
package project2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesOfFiles 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("D:\\Programming\\JAVA\\Java Created Files\\Config.properties");
//        FileOutputStream fos=new FileOutputStream(f);
        Properties p=new Properties();
//        p.setProperty("Username", "Joydeepsadhu123@gmail.com");
//        p.setProperty("URL", "http://www.nptel.com");
//        p.setProperty("Pass", "Dhinkachika");
//        p.store(fos, "okay");
        FileInputStream fis=new FileInputStream(f);
        p.load(fis);
        System.out.println(p.getProperty("URL"));
        System.out.println(p.getProperty("Username"));
        System.out.println(p.getProperty("Pass"));
        
    }
    
}
