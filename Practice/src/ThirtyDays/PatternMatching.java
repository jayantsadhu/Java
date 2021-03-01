package ThirtyDays;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.Scanner;
public class PatternMatching {
	
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }in.close();

	    }
	}
	class MyRegex{
	    String pattern="((\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
	}

