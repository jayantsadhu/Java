package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileHandling2 {

	public static void main(String[] args) throws IOException {
		FileWriter fileEditor=new FileWriter("D:\\Data Science\\abcd2.txt");
		fileEditor.write("Okay I cahnged this file's content 2");
		fileEditor.close();

	}

}
