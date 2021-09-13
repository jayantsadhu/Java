package ForInbuiltMethods;
import java.math.BigInteger;
public class BinaryConcate {

    public static void main(String []args){
        
        int concated = binaryConcate(60);
        System.out.println(concated);
       
    }
    
    static int binaryConcate(int n){
        if(n<2)
           return n;
       
       String s = "";
       for(int i=1;i<=n;i++){
           String bits = Integer.toBinaryString(i);
           s += bits;
       }
       
       BigInteger res = new BigInteger(s,2).mod(BigInteger.valueOf((int)Math.pow(10,9)+7));
       return res.intValue();
        
    }
}     