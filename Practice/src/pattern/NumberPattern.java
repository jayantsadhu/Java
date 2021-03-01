package pattern;

public class NumberPattern {

	public static void main(String[] arg) {
		NumberPattern np=new NumberPattern();
		np.Pattern(24, 6);
		
	}
	
	void Pattern(int input, int length) {
		int k=1,flag=0;
		while(true) {
			int n=k;
			for(int j=1;j<=length;j++) {
				System.out.print(n+" ");
				if(j==length) break;
				if (flag==0) {
					n=n+3;
					flag=1;
				}
				else {
					n=n+1;
					flag=0;
				}	
			}
			if(n==input) break;
			if(flag==0) k=k+3;
			else k=k+1;
			
			System.out.println("");
		}
	}
}
