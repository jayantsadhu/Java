package Sorting;

//O(n^2)
public class Insertion {
	
	public static void main(String args[])
	{
		int array[] = {1,5,9,0,8,24,14,27,65,32,10,12,27,20,13,10,9};
		insertionSort(array);
		for(int ele : array)
			System.out.print(ele+" ");
	}
	
	static void insertionSort(int[] arr)
	{
		int n = arr.length;
		for(int i=1;i<n;i++)
			for(int j=i;j>0 && arr[j]<arr[j-1];j--)
				swap(arr,j,j-1);
	}
	static void swap(int[] arr,int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
