package FirstOne1;

public class TimeComplexity1 {
	public static void main(String[] arg) {
		
		double initial=System.currentTimeMillis();
		//TimeComplexityDemo demo=new TimeComplexityDemo();
		
		System.out.println(FindSum2(99999999));
		double final1 =System.currentTimeMillis();
		System.out.println("Time Taken= "+(final1-initial));
		
	}
	public static int FindSum(int x) {
		return x*(x+1)/2;
	}
	public static int FindSum2(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
}
