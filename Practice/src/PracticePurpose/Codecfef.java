package PracticePurpose;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Codecfef {
	
		public static void main (String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			double withdrawalAmount= sc.nextDouble();
			double bankBalance=sc.nextDouble();
			if((withdrawalAmount + 0.5)<=bankBalance) {
			if(withdrawalAmount % 5==0) {
			bankBalance = bankBalance - withdrawalAmount - 0.5;
			}
			}System.out.println(bankBalance);
		}
	}

