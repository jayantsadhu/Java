package Sorting;

public class QuickSort 
{
	public static void main(String[] args)
	{
		int array[] = {1,5,9,7,3,2,5,4,0,8,9};
		quickSort(array,0,array.length-1);
		for(int ele : array)
			System.out.print(ele+" ");
	}
	
	static void quickSort(int[] arr, int start, int end)
	{
		if(start>=end)
			return;
		int j = start-1;
		int pivot = arr[end];
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				j++;
				swap(arr,i,j);
			}
		}
		swap(arr,j+1,end);
		quickSort(arr,start,j);
		quickSort(arr,j+2,end);
	}
	final static void swap(int[] arr,int first, int next)
	{
		int temp = arr[first];
		arr[first] = arr[next];
		arr[next] = temp;
	}
}
