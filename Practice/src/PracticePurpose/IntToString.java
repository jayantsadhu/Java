package PracticePurpose;
import java.util.*;
import java.security.*;
public class IntToString {

	 public static void main(String[] args) {

	 // DoNotTerminate.forbidExit();

	  //try {
	   Scanner in = new Scanner(System.in);
	   int n = in .nextInt();
	   in.close();
	   //String s=???; Complete this line below
	    String s= Integer.toString(n);
	   

	   
	   if (n == Integer.parseInt(s)) {
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	 // } catch (DoNotTerminate.ExitTrappedException e) {
	   //System.out.println("Unsuccessful Termination!!");
	  }
	 //}
	}
