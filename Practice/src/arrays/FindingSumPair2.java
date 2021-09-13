package arrays;

//Finding sum pair of rotated sorted array using recursion
//Complexity=O(log(n))

public class FindingSumPair2 {
	public static void main(String args[]) {
		int array[]= {4, 5, 7, 8, 6, 2, 3, 4};
		sumPair(array,15);
	}
	
	
	static int[] sumPair(int[] arr, int key) {
		int pivote=pivotePoint(arr);
		int n=key/2;
		int val=arr[pivote], j=1;
		
		if(key==0 && val==0 && arr[pivote+1]==0)
			return new int[] {0, 0};
		
		if(key!=0 && val>=key)
			return new int[] {-1};
		int l=pivote;
		while(true) {
			val=arr[pivote];
			for(int k=pivote+1;k!=pivote && k<=arr.length-1;k++) {
				if(arr[k]==key-val)
					return new int[] {val, key-val};
				if(k==arr.length-1) {
					
				}
					
			}
			
		}
	}
	
	static int pivotePoint(int[] arr) {
		int i=0;
		while(i++ <arr.length-1) {
			if(arr[i]>arr[i+1])
				break;
		}
		int pivotePoint;
		if(i!=arr.length-1)
			pivotePoint=i+1;
		else 
			pivotePoint=0;
		return pivotePoint;
	}
	
	 /*static int findingPair(int[] arr,int start, int end, int key) {
		if(start>end)
			return -1;
		
	}*/
}















