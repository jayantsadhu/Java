package ForInbuiltMethods;

public class MinOfMaxPagesAllocation {
	
	public static void main(String[] args) {
	      
      int B[] = {12, 34, 67, 90};
      
      int minMax = maxPages(B.length,2,B);
        System.out.println(minMax);
	  } 
    public static int maxPages(int n, int m, int[] B){
        
        int max = 0;
        int min = 0;
        for(int i = 0; i < n; i++){
            min = Math.min(min,B[i]);
            max += B[i];
        }
        //max -= min;
        int res = 0;
        
        while(min<=max){
            
            int mid = (min + max)>>1;
            
            if(isPossible(n,m,mid,B)){
                res = mid;
                max = mid-1;
            }
            else {
                min = mid+1;
            }
                
        }
        return res;
        
    }
    public static boolean isPossible(int n, int m, int pages, int[]B){
        int students_needed = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            
            if(B[i]>pages)
                return false;
            
            if(sum+B[i] > pages){
                sum = B[i];
                students_needed++;
            }
            else{
                sum += B[i];
            }
            if(students_needed > m)
                return false;
        }
	        return true;
    }
}
