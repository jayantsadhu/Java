
package project2;


import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.io.ByteArrayOutputStream;
        
public class QRcode 
{
    

    public static void main(String[] args) throws Exception
    {
        String details="Hello It's Jayant : Learning Java";
        ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();
        File f=new File("D:\\Programming\\jayanQR.jpg");
        FileOutputStream fos= new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
        
    }
    
    
}


