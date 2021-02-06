package IOStream;

import java.io.*;

public class FileInputStreamDemo {
	public static void main(String[] arguments) throws IOException {
		FileInputStreamDemo readFile=new FileInputStreamDemo();
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
