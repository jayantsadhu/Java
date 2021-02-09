package ThirtyDays;
import java.util.*;
public class StringArray {
	public static void main (String[] arg) {
	Scanner sc1=new Scanner(System.in);
	//String[] arr= sc.nextLine().split(" ");
	String str="Okay It's taking some time to be good in java";
	String[] arr=str.split(" ");
	//sc1.skip("");
	for(int i=0;i<arr.length;i++) {
	System.out.println((i+1)+" "+arr[i]);
	}
	}

}
