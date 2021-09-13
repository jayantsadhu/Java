package InterviewQs;

public class MedianAfterMerging {
	public static void main(String args[]) {
		Solution s = new Solution();
		int arr1[] = {1,2};
		int arr2[] = {3,4};
		double m = s.findMedianSortedArrays(arr1, arr2);
		System.out.println(m);
	}
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i=0,j=0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] newArr = new int[n1+n2];
        for(int k=0;k<n1+n2;k++){
            int a1 = i<n1? nums1[i]:Integer.MAX_VALUE;
            int a2 = j<n2? nums2[j]:Integer.MAX_VALUE;
            
            if(a1<=a2){
                newArr[k] = a1;
                i++;
            }
            else 
            {
                newArr[k] = a2;
                j++;
            }
        }
        double median = (n1+n2) %2!=0? newArr[(n1+n2)/2]:(newArr[(n1+n2)/2-1]+newArr[(n1+n2)/2])/2.0;
        return median;
    }
}
