
package Display;
//wrapper classes;-
//0.01%--> int ,float ,double ,char ,

import java.util.ArrayList;

//Integer,Float, Double, Character

public class WrapperClasses 
{
    public static void main(String[] args) 
    {
        int i=5;
        Integer ii=new Integer(5);    //Boxing
        Integer jj=i;                 //Auto Boxing
        int j=jj.intValue();          //Unboxing
        int k=jj;                     //Auto Unboxing
        System.out.println(ii);
        ArrayList<Integer> values= new ArrayList<Integer>();
        values.add(5);
        values.add(8);
       // values.add("Jayant");
    }
    
}
