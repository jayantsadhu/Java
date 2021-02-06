package PracticePurpose;
import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.*;
public class RoundingOffBigDecimal {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		float floatNumber=sc.nextFloat();
		BigDecimal bigDecimal=new BigDecimal(floatNumber);
		int scale=sc.nextInt();
		sc.close();
		//MathContext mathContext=new MathContext(scale);
		//BigDecimal roundedOffNumber=bigDecimal.round(mathContext);
		
		BigDecimal roundedOffNumber=bigDecimal.setScale(scale,RoundingMode.HALF_UP);
		
		System.out.println(roundedOffNumber);
		
		
		
		//Another less accurate rounding off method
		/*int places=sc.nextInt();
		double scale= Math.pow(10, places);
		double roundedOffNumber=Math.round(floatNumber * scale)/scale;
		System.out.println(roundedOffNumber);*/
	}

}
