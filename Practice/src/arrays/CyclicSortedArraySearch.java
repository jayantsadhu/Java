package arrays;
//Search in sorted and rotated array
public class CyclicSortedArraySearch {
	public static void main(String[] args) {
		int array[]= {8,9,10,4,5,6,7};
		System.out.println(search(array,0,array.length-1,4));
		
	}
	
	static int search(int[] arr,int l,int h, int key) {
		if(l>h)
			return -1;
		int mid=(l+h)/2;
		if(arr[mid]==key)
			return mid;
		if(arr[l]<=arr[mid]) {
			if(key>=arr[l] && key<arr[mid])
				return search(arr,l,mid-1,key);
			return search(arr, mid+1,h,key);
		}
		else {
			if(key>arr[mid] && key<=arr[h])
				return search(arr,mid+1,h,key);
			return search(arr,l,mid-1,key);
		}
			
		}
	
	
	
	
	
	
	
	
	static int pivotPoint(int[] arr, int start, int end ) {
		if(end<start)
			return -1;
		if(start==end)
			return start;
		
		int mid=(start+end)/2;
		if (arr[mid]>arr[mid+1])
			return mid;
		if(arr[mid-1]>arr[mid])
			return mid-1;
		if(arr[start]>=arr[mid])
			return pivotPoint(arr,start,mid-1);
		return pivotPoint(arr,mid+1,arr.length-1);
	}
	/*static int binarySearch(int[] arr) {
		int pivot=pivotPoint(arr, 0,arr.length-1);
		if(pivot==-1)
			
			return -1;
		if(arr[0])
	}*/
}
