package FileHandling;

import java.io.*;
import java.util.Scanner;

public class DemoFileHandling {
	public static void main(String arg[]) {
		File createFile= new File("C:\\Users\\JAYANT\\Desktop\\OkFile.txt");
		PrintWriter toWriteIntoFile = null;
		try{
			toWriteIntoFile=new PrintWriter(createFile);
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
