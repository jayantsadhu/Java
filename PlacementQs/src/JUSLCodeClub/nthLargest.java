package JUSLCodeClub;

import java.util.Scanner;

public class nthLargest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int  i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(nthLargestBat(arr,n,x));
	}
	
	static int nthLargestBat(int[] arr, int n, int x) {
		int max = 0;
		for(int i=1;i<=x;i++) {
			max = -10001;
			int index = -1;
			for(int j=0;j<n;j++) {
				if(arr[j]>max) {
					max = arr[j];
					index = j;
				}
			}
			arr[index] = -10001;
		}
		return max;
	}
}
