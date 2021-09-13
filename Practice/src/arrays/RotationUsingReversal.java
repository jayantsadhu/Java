package arrays;

public class RotationUsingReversal {				//Complexity=O(n)
	public static void main(String[] args) {
		int array[]= {2, 5, 7, 9, 6, 3, 4, 8};
		RotationUsingReversal rur=new RotationUsingReversal();
		int d=3;
		int n=array.length;
		//for left rotation
		/*rur.reverse(array, 0, d-1);	
		rur.reverse(array, 3, n-1);
		rur.reverse(array, 0, n-1);*/
		//for right rotation
		rur.reverse(array, 0, n-1-d);	//d=3
		rur.reverse(array, n-d, n-1);
		rur.reverse(array, 0, n-1);
		for(int ele:array)
			System.out.print(ele+" ");
	}
	
	void reverse(int[] arr, int start, int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
