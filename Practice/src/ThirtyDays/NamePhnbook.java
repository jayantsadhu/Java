package ThirtyDays;
import java.util.*;
public class NamePhnbook {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Start...");
		int n=sc.nextInt();
		sc.skip("\n");
		String str[][]=new String[n][2];
		for(int i=0;i<n;i++) {
			String arr[]=sc.nextLine().split(" ");
			str[i][0]=arr[0];
			str[i][1]=arr[1];
		}
		while(sc.hasNextLine()) {
			String name=sc.nextLine();
			int j=0;
			if(name.equals("exit")) break;
			for(int i=0;i<n;i++) {
				if(name.equals(str[i][0])) {
					System.out.println(name+"="+str[i][1]);
					j++;
				}
			}
			if(j==0) System.out.println("Not Found");
		}
		sc.close();
	}

}
