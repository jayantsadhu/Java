package InterviewQs;
import java.util.ArrayList;
public class MergeTwoSortedArrays {
	
	public static void main(String ags[]) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=1;i<6;i++)
			list1.add(i*3);
		for(int i=2;i<10;i++)
			list2.add(i*2);
		ArrayList<Integer> arrlist = mergeSortedArrays(list1,list2);
		System.out.println(list1+"\n"+list2+"\n"+arrlist);
	}

	static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		
		int n1 = arr1.size();
		int n2 = arr2.size();
		
		ArrayList<Integer> maxArr=arr1, minArr=arr2;
		if(n1<n2) {
			maxArr = arr2;
			minArr = arr1;
		}
		
		
		ArrayList<Integer> mergedList = new ArrayList<>();
		int i=0,j=0;
		while(i<maxArr.size()) {
			int a = maxArr.get(i);
			int b = j<minArr.size()? minArr.get(j):Integer.MAX_VALUE;
			if(a == b) {
				mergedList.add(a);
				mergedList.add(b);
				i++;j++;
			}
			else if(a>b) {
				mergedList.add(b);
				j++;
			}
			else {
				mergedList.add(a);
				i++;
			}
		}
		return mergedList;
	}

}