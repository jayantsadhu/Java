package FileHandling;

import java.io.*;
import java.util.Scanner;

public class DemoFileHandling {
	public static void main(String arg[]) {
		File createFile= new File("D:\\Data Science\\abcd.txt");
		PrintWriter toWriteIntoFile = null;
		try{
			toWriteIntoFile=new PrintWriter("D:\\Data Science\\abcd3.txt"); 
			toWriteIntoFile.println("Hey! I started learnig Data Science.");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
		finally {
			toWriteIntoFile.close();
		}
		
		Scanner input=null;
		try{
			input= new Scanner(createFile);
			while(input.hasNext()) {
				System.out.print(" "+input.next());
			}
		}catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		finally{
			input.close();
		}
		
	}

}
