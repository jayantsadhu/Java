package PracticePurpose;
import java.io.*;
import java.time.LocalDate;

public class CalenderDateTime {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("DATA_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}

class Result {

  /*Scanner sc =new Scanner(System.in);
  int month=sc.nextInt();
  int day=sc.nextInt();
  int year=sc.nextInt();*/

    public static String findDay(int month, int day, int year) {
        LocalDate date=LocalDate.of(month,day,year);
        return date.getDayOfWeek().toString();
    }

}

