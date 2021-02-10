
public class Shorthandoperators 
{
    public static void main(String[] args) 
    {
        int i=4;
        i+=2;
        //i=i+2;
        i-=2;
        //i=i-2
        //i*=2;
        //i=i*2;
        
        int j;
        j=i++;   //post increament
        //j=++i;   //pre increament
        
        byte b=8;
        /*b=b*2.5;     Error messagge coz 20.0 is a double value and
        we have to change its data type i.e b=(byte)b*2.5 */
        b*=2.5;
        //no error coz for E1 op E2 it will give the E1 data type
        System.out.println(i+ " and " +j);
        
    }
    
}
