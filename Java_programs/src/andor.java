
public class andor 
{
    public static void main(String[] args) 
    {
        int a=25;                   //1 1 0 0 1
        int b=15;                   //0 1 1 1 1
 //Bitwise operator-->AND           //0 1 0 0 1  =9
 //                 -->OR           //1 1 1 1 1  =31
        int c=a & b;
        int d=a|b;
        System.out.println(c+" and "+d ); 
        
    }
    
}
