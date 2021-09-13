package CodnationLabs;
import java.util.*;
public class NoOfFriends {
	//array A has trust value of ith person
	//If A[i]%A[j]==0 or A[j]%A[i]==0 then they can make friendship,
	//Calculate max no. of friends can be made by a every person
	
	//Its not an efficient Solution
	
	public static int[] friends1(int[]A) {
		int res[] = new int[A.length];
		for(int i=0 ; i<A.length ; i++) {
			for(int j=i+1 ; j<A.length ; j++) {
				if(A[i]%A[j]==0 || A[j]%A[i]==0) {
					res[i] += 1;
					res[j] += 1;
				}
			}
		}
		return res;
	}
	
	
	public static int[] friends(int[]A) {
		
		int res[] = new int[A.length];
		Map<Integer, Vector<Integer>> map = new HashMap<>();
		for(int i=0 ; i<A.length; i++) {
			if(!map.containsKey(A[i]))
				map.put(A[i], new Vector<Integer>());
			map.get(A[i]).add(i);
		}
		for(int i=0;i<A.length;i++) {
			
			Vector<Integer> v = divisors(A[i]);
			for(int j=0 ; j<v.size() ; j++) {
				if(map.containsKey(v.get(j)) && v.get(j)!=A[i]) {
					res[i] += 1;
					for(int k=0 ; k<map.get(v.get(j)).size() ; k++) {
						res[map.get(v.get(j)).get(k)] += 1;
					}
				}
			}
		}
		return res;
	}
	
	public static Vector<Integer> divisors(int n){
		Vector<Integer> v = new Vector<>();
		for(int i=1 ; i*i<=n ; i++) {
			if(n%i==0) {
				v.add(i);
				if(i!=n/i)
					v.add(n/i);
			}
		}
		return v;
	}
	
	
	
	
	public static void main(String args[]) {
		int arr[] = {5,7,6,8,9,12,4,5,7,7,2,8,7,9,65,14,25};
		long initial = System.currentTimeMillis();
		int fr[] = friends1(arr);
		long final1 = System.currentTimeMillis();
		System.out.println(Arrays.toString(fr)+"\n"+(final1-initial));
	}
	
}
