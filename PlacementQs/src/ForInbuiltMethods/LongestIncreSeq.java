package ForInbuiltMethods;


import java.util.*;
public class LongestIncreSeq {

    public static void main(String []args){
        int[] arr = {1,8,5,3,4,9,2,4,3,6,1,9};
        Integer[] arr1 = {2,3,5,7,9,12,15,18,21};
        
        System.out.println(immediateNext(Arrays.asList(arr1),22,arr1.length-1));
        
        System.out.println(longestIncreasingSeq(arr));
        longestIncreSeq(arr);
        
        
	}
    //O(n^2)
    public static void longestIncreSeq(int arr[]) {
    	int lis[] = new int[arr.length];
        int index = 0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            lis[i] = 1;
            for(int j=0;j<i;j++){
               if(arr[j]<arr[i] && lis[j]>=lis[i])
                   lis[i] = 1 + lis[j];
           }
           if(lis[i]>max){
               max = lis[i];
               index = i;
           }
        }
        int subSeq[] = new int[max];
        int temp = max;
        for(int i=index; i >= 0; i--){
           if(lis[i] == temp){
               subSeq[temp-1] = arr[i];
               temp--;
           }
        }
           
        System.out.println(Arrays.toString(lis)+" "+max+" "+index+"\n"+Arrays.toString(subSeq));
    }
    //O(NlogN)
    public static int longestIncreasingSeq(int arr[]) {
    	ArrayList<Integer> lis = new ArrayList<>();
    	lis.add(arr[0]);
    	int j = 0;
    	for(int i=0 ; i<arr.length ; i++) {
    		if(arr[i]>lis.get(j)) {
    			lis.add(++j, arr[i]);
    		}
    		else {
    			int index = immediateNext(lis, arr[i],j);
    			lis.set(index, arr[i]);
    		}
    	}
    	System.out.println(lis);
    	return lis.size();
    }
    
    private static int immediateNext(List<Integer> arr, int val, int i) {
    	int lo = 0;
    	int hi = i;
    	while(lo<=hi) {
    		int mid = (lo+hi)>>1;
    		if(arr.get(mid)==val) {
    			return mid;
    		}
    		else if(arr.get(mid)>val) {
    			hi = mid-1;
    		}
    		else {
    			lo = mid+1;
    		}
    	}
    	return lo;
    }
}
