package IOStream;

import java.io.*;

public class FileInputStream1 {
	public static void main(String[] arguments) throws IOException {
		FileInputStream1 readFile=new FileInputStream1();
		readFile.FileReader("D:\\Data Science\\message.txt");
	}
	private void FileReader(String file_location) throws IOException {
		FileInputStream fileInput=new FileInputStream(file_location);
		
		int integerReadFromFile=fileInput.read();
		while(integerReadFromFile!=-1) {
			System.out.print((char)integerReadFromFile);
			integerReadFromFile=fileInput.read();
		}
		fileInput.close();
		
	}

}
