package DP;
public class Knapsack {
	
    int val[];
    int wt[];
    int cache[][];
    
    public static void main(String []args) {
        
        Knapsack s = new Knapsack();
        s.val = new int[]{4, 17, 15, 7, 96, 112, 100};
        s.wt =  new int[]{4, 2,  3,  3,  6,  12,  10};
        int C = 20;
        s.cache = new int[s.val.length+1][C+1];
        
        int max1 = s.maxV(s.val.length-1, C);
        int max2 = s.maxV2(s.val.length, C);
        int max3 = s.maxV3(s.val.length, C);
        
        System.out.println(max1+" "+max2+" "+max3);
    }
    public int maxV(int i, int C){
        
        if(i < 0 || C <= 0)
            return 0;
            
        if(C < wt[i])
            return maxV( i-1, C);
        
        
        int selected = val[i] + maxV( i-1, C-wt[i] );
        int notSelected = maxV( i-1, C );
        
        return Math.max(selected, notSelected);
        
    }
    
    public int maxV2(int i, int C){
        
        if(i == 0 || C <= 0)
            return 0;
            
        if(C < wt[i-1])
            return cache[i][C] = maxV2( i-1, C);
        
        
        int selected = val[i-1] + maxV2( i-1, C-wt[i-1] );
        int notSelected = maxV2( i-1, C );
        
        return cache[i][C] = Math.max(selected, notSelected);
        
    }
    
    public int maxV3(int n, int C){
        
        if(n <= 0 || C <= 0)
            return 0;
        
        int[][] cache = new int[n+1][C+1];
        
        for(int i = 1; i <=n; i++){
            for(int c = 1; c <= C; c++){
                
                if(c < wt[i-1])
                    cache[i][c] = cache[i-1][c];
                else{
                    cache[i][c] = Math.max( val[i-1]+cache[i-1][c-wt[i-1]], cache[i-1][c] );
                }
            }
        }
        return cache[n][C];
        
        
    }
    
}
