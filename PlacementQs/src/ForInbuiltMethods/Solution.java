package ForInbuiltMethods;

import java.util.Arrays;
import java.util.Comparator;
public class Solution  {
    public static void main(String args[]){
        Solution s = new Solution();
        Integer arr[] = {2,8,7,5,6,7,2,7,6,3,0,1};
        String str[] = {"a","h","u","i","l","o"};
        
        
      
        Arrays.sort(arr, new IntegerCompare());
        System.out.print(Arrays.toString(arr));
        
         
    }
    private static class IntegerCompare  implements Comparator<Integer> {
    	@Override
    	public int compare(Integer a, Integer b) {
    		return b.compareTo(a);
    	}
    
    }

}
