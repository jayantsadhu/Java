package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileHandling2 {

	public static void main(String[] args) throws IOException {
		FileWriter fileEditor=new FileWriter("D:\\Data Science\\abcd4.txt");
		fileEditor.write("Okay I cahnged this file's content 4");
		fileEditor.close();

	}

}
