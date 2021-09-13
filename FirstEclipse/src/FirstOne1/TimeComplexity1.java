package FirstOne1;

public class TimeComplexity1 {
	public static void main(String[] arg) {
		
		double initial=System.currentTimeMillis();
		//TimeComplexityDemo demo=new TimeComplexityDemo();
		
		System.out.println(FindSum2(999999999));
		double final1 =System.currentTimeMillis();
		System.out.println("Time Taken= "+(final1-initial));
		
	}
	public static int FindSum(int x) {
		return x*(x+1)/2;
	}
	public static long FindSum2(int n) {
		long sum=0;
		int mod = (int)Math.pow(10, 9)+7;
		for(int i=1;i<=n;i++)
			sum=(sum+i);
		return sum%mod;
	}
}
