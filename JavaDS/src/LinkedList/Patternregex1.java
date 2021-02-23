package LinkedList;

import java.util.Scanner;
import java.util.regex.*;

public class Patternregex1
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for(int i=1;i<=testCases;i++){
			String pattern = in.nextLine();
          	try{ 
                Pattern p=Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                  System.out.println("Invalid");
            }
		}
	}
}