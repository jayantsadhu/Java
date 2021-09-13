package FTEMockTest;
import java.util.Scanner;

public class MinCandies {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ratings[] = new int[n];
		
		for(int i=0;i<n;i++)
			ratings[i] = sc.nextInt();
		
		int candies[] = new int[n];
		candies[0] = 1;
		
		for(int i=0;i<n-1;i++) {
			if(ratings[i]<=ratings[i+1])
				candies[i+1] = candies[i] + 1;
			else
			{
				if(candies[i] !=1) {
					candies[i+1] = (i+1) != (n-1)? (candies[i] - 1) : 1;
				}
				else
				{
					candies[i+1] = 1;
					int k=i;
					while(k>=0 && ratings[k]>=ratings[k+1]) {
						candies[k]++;
						k--;
					}
				}
			}	
		}
		System.out.println(arraySum(candies,n)+"\n");
		for(int ele : candies)
			System.out.print(ele+" ");
	}
	static int arraySum(int[] candy, int length) {
		int sum = 0;
		for(int l=0;l<length;l++)
			sum += candy[l];
		return sum;
	}
}
