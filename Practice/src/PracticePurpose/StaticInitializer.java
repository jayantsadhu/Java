package PracticePurpose;
import java.util.*;
public class StaticInitializer {
	static boolean flag=false;
	static Scanner sc= new Scanner(System.in);
    static int B= sc.nextInt();
    static int H= sc.nextInt();
	static {
		    if((B > 0) && (H > 0))
		    flag =true;
		    else
		    System.out.print("java.lang.Exception: Breadth and height must be positive");
	    }

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
	}//end of main

}//end of class

