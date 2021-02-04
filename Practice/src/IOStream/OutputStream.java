package IOStream;

import java.io.*;

public class OutputStream {

	public static void main(String[] args) throws IOException {
		OutputStream stream_output=new OutputStream();
		stream_output.WriteToFile("D:\\Data Science\\message.txt");
		

	}
	private void WriteToFile(String officeFile) throws IOException{
		FileOutputStream fileWriter=new FileOutputStream(officeFile);
		fileWriter.write("Now using fileoutputstream to write into the file 2".getBytes());
		fileWriter.close();
	}

}
