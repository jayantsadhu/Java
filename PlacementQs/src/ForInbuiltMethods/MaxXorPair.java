package ForInbuiltMethods;

class MaxXorPair {
    final static int SIZE = 32;
    
    
    public static void main(String args[]) {
    	int arr[] = {1,2,8,12};
    	
    	int max_xor = maxXor(arr.length, arr);
    	System.out.println(max_xor);
    }
    
    
    static int maxXor(int N, int arr[]){
        int xor_max = Integer.MIN_VALUE;
        
        TrieNode head = new TrieNode();
        
        for(int i=0;i<N;i++)
            insert(head, arr[i]);
        
        for(int i=0;i<N;i++){
            int val = arr[i];
            TrieNode cur = head;
            int max = 0;
            for(int j=SIZE-1;j>=0;j--){
                if( ((val>>j)&1) == 0){
                    if(cur.right != null){
                        max += (int)Math.pow(2,j);
                        cur = cur.right;
                    }
                    else 
                        cur = cur.left;
                }
                else{
                    if(cur.left != null){
                        max += (int)Math.pow(2,j);
                        cur = cur.left;
                    }
                    else 
                        cur = cur.right;
                }
            }
            xor_max = Math.max(xor_max, max);
        }
        return xor_max;
    }
    
    private static void insert(TrieNode head, int num){
        TrieNode cur = head;
        for(int i=SIZE-1; i>=0; i--){
            
            if(((num>>i)&1) ==0){
                if(cur.left == null)
                    cur.left = new TrieNode();
                cur = cur.left;
            }
            else{
                if(cur.right == null)
                    cur.right = new TrieNode();
                cur = cur.right;
            }
        }
    }
    
    private static class TrieNode {
        TrieNode left;
        TrieNode right;
        TrieNode(){
            this.left = null;
            this.right = null;
        }
    }
}