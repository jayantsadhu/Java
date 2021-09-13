package arrays;

public class ArrayRotation {					//Complexity=O(n); Auxiliary Space=O(d)
	public static void main(String[] args) {
		int array[]= {2, 5, 7, 9, 6, 3, 4, 8};
		arrayRotation(array,2,false);
		for(int ele:array)
			System.out.print(ele+" ");
	}
	static void arrayRotation(int arr[],int d,boolean b) {	//right rotation
		d=d % arr.length;
		int temp[]=new int[d];
		if(b==true) {
			for(int i=0;i<d;i++)
				temp[i]=arr[arr.length-d+i];
			
			for(int j=arr.length-1;j>=d;j--) 
				arr[j]=arr[j-d];
			
			for(int k=0;k<d;k++)
				arr[k]=temp[k];
		}
		else {
			for(int i=0;i<d;i++)
				temp[i]=arr[i];
			
			for(int j=0;j<=arr.length-1-d;j++) 
				arr[j]=arr[j+d];
			
			for(int k=0;k<d;k++)
				arr[arr.length-d+k]=temp[k];
		}
	}
}
