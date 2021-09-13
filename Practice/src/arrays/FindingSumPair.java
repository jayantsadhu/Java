package arrays;

//finding sum pair of rotated sorted array
//Time complexity=O(n);
public class FindingSumPair {
	public static void main(String[] args) {
		int array[]= {2, 5, 7, 9, 6, 3, 4, 8};
		SumSearch(array,7);
		
	}
	
	static void SumSearch(int[] arr,int sum) {
		int n=arr.length, count=0;
		String[] str= {"True", "","",""};
		for(int j=0;j<n-1;j++) {
			for(int i=j+1;i<n;i++) {
				if((arr[i]+arr[j])==sum) {
					System.out.println(str[count]+"\nThe pair is ("+arr[j]+", "+arr[i]+").");
					count++;
				}
			}
		}if(count==0)
			System.out.println("False, There is no pair with sum "+sum);
		
	}
}
