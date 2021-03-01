package ThirtyDays;
import java.util.*;
import java.util.regex.*;

public class TagsExtractor{
	public static void main(String[] args){
		String regex="<([^<>]+)>([^<>]+)</\\1>";
		
		//"<([^<>]+)>(<([^<>]+)>)*([^<>]+)(</\\3>)*</\\1>"
		Pattern p=Pattern.compile(regex);
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while(testCases-->0){
			String line = in.nextLine();
			Matcher m=p.matcher(line);
			while(m.find()) {
				//System.out.println(m.group(0));
				System.out.println(m.group(2));
				/*System.out.println(m.group(2));
				System.out.println(m.group(3));
				System.out.println(m.group(4));
				System.out.println(m.group(5));
				//System.out.println(m.group(6));
				//System.out.println(m.group(7));
				//System.out.println(m.group(8));*/
			}
		}
		in.close();
	}
}



