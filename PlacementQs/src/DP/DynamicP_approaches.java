package DP;
import java.util.*;
public class DynamicP_approaches {
	
	public static void main(String []args){
	        
        int money[] = {4,11,15,78, 10, 45, 96, 112,100,200};
        int cache[] = new int[money.length];
        
        Arrays.fill(cache, -1);
        
        int max = rob1(money.length-1 ,money, cache);
        int max2 = rob2(money);
        int max3 = rob3(money);
        
        
        System.out.println(max+" "+max2+" "+max3);
    }
	     
     static int rob1(int i, int money[], int cache[]){
         if(i<0)
            return 0;
        if(cache[i]!=-1)
            return cache[i];
        
        int ith_selected = money[i] + rob1(i-2, money, cache);
        int ith_not_selected = rob1(i-1, money, cache);
        
        return cache[i] = Math.max(ith_selected, ith_not_selected);
     }
	     
     static int rob2(int money[]){
        
        int cache[] = new int[money.length+1];
        cache[0] = 0;
        cache[1] = money[0];
        
        for(int i = 2; i <= money.length; i++){
            cache[i] = Math.max(cache[i-1], money[i-1] + cache[i-2]);
        }
        return cache[money.length];
     }
     
     static int rob3(int money[]){
        if(money.length<1)
            return 0;
            
        int prev1 = 0;
        int prev2 = 0;
        int count = 0;
        
        for(int i = 0; i < money.length; i++){
            
            count = Math.max(prev1, prev2 + money[i]);
            prev2 = prev1;
            prev1 = count;
            
        }
        return count;
     }
}
