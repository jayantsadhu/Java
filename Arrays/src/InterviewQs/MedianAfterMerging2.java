package InterviewQs;

public class MedianAfterMerging2 {
	public static void main(String args[]) {
		Sol s = new Sol();
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {3,4};
		double m = s.findMedianSortedArrays(arr1, arr2);
		System.out.println(m);
	}
}

class Sol {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
    	if(n1>n2)
    		return findMedianSortedArrays(nums2,nums1);
    	
    	int lo = 1;
    	int hi = n1;
    	while(lo<=hi) {
    		int p1 = (lo+hi)>>1;
    		int p2 = (n1+n2+1)/2-p1;
    		
    		int leftMax1 = p1>=1? nums1[p1-1]:Integer.MIN_VALUE;
    		int leftMax2 = p2>=1? nums2[p2-1]:Integer.MIN_VALUE;
    		int rightMin1 = p1<n1? nums1[p1]:Integer.MAX_VALUE;
    		int rightMin2 = p2<n2? nums2[p2]:Integer.MAX_VALUE;
    		
    		if(leftMax1<=rightMin2 && leftMax2<=rightMin1) {
    			if((n1+n2)%2!=0) {
    				return (double)Math.max(leftMax1, leftMax2);
    			}
    			else {
    				double res = ((double)Math.max(leftMax1, leftMax2)+(double)Math.min(rightMin1, rightMin2))/2;
    				return res;
    			}
    		}
    		else {
    			if(leftMax1>rightMin2)
    				hi = p1-1;
    			else 
    				lo = p1+1;
    		}
    	}
    	return -1;
        
    }
}
