package PracticePurpose;
import java.util.*;
import java.math.*;
import java.io.*;
public class Codechef {
	
		public static void main (String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			double bankBalance=sc.nextDouble();
			double withdrawalAmount= sc.nextDouble();
			if((withdrawalAmount + 0.5)<=bankBalance && (withdrawalAmount % 5==0))
			bankBalance = bankBalance - withdrawalAmount - 0.5;
			System.out.println(bankBalance);
			sc.close();
		}
}
