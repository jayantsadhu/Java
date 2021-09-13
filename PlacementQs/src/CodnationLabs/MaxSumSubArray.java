package CodnationLabs;

import java.util.Arrays;

public class MaxSumSubArray {
	//Here basically the main problem was to solve the max sum of subarray between an index range
	//but the sum was in alternative sign changing manner,
	//Ai-A(i+1)+A(i+2)-A(i-3)+A(i+4)-......
	
	public static int maxSubArraySum(int[] A, int start, int end) {
		//Kadane's Algorithm
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += A[i];
			if(max < sum)
				max = sum;
			if(sum<0)
				sum = 0;
		}
		return max;
	}
	public static int maxAlterSignSum(int[] A, int start, int end) { //WRONG
		//Kadane's Algorithm
		
		for(int i=start ; i<=end ; i=i+2)
			A[i] *= -1;
		
		int sum1 = maxSubArraySum(A,start,end);
		
		for(int i=start ; i<=end ; i++)
			A[i] *= -1;
		
		int sum2 = maxSubArraySum(A,start,end);
		
		for(int i=start+1 ; i<=end ; i=i+2)
			A[i] *= -1;
		
		return Math.max(sum1, sum2);
	}
	
	public static void main(String args[]) {
		int arr[] = {1,3,-4,10,2,-8,7,14};
		int mx = maxAlterSignSum(arr,0,arr.length-1);
		System.out.println(mx+" "+Arrays.toString(arr));
	}
}
