package PracticePurpose;
import java.io.*;
import java.time.LocalDate;

public class CalenderDateTime {
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split("[ /]");

	        
	        int day = Integer.parseInt(firstMultipleInput[0]);
	        
	        int month = Integer.parseInt(firstMultipleInput[1]);
	        
	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(year,month, day);

	        //bufferedWriter.write(res);
	        //bufferedWriter.newLine();
	        System.out.println(res);
	        bufferedReader.close();
	        //bufferedWriter.close();
	    }
}

class Result {

  /*Scanner sc =new Scanner(System.in);
  int month=sc.nextInt();
  int day=sc.nextInt();
  int year=sc.nextInt();*/

    public static String findDay(int year,int month, int day) {
        LocalDate date=LocalDate.of(year,month,day);
        return date.getDayOfWeek().toString();
    }

}

