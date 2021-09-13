package ForInbuiltMethods;


import java.util.*;
public class PrimePowers {

     public static void main(String []args){
         
         ArrayList<Integer> powers = primePowers(6);
         
         System.out.println(powers);
        
     }
     
     static ArrayList<Integer> primePowers(int n){
         int factorial = 1;
         for(int i=1;i<=n;i++){
             factorial *= i;
         }
         int N = factorial;
         
         ArrayList<Integer> arr = new ArrayList<>();
         int j = 0;
         int n1 = N;
         
         while(n1 % 2 == 0){
             n1 /= 2;
             j++;
         }
         if(j>0)
            arr.add(j);
            
         
         for(int i = 3; i < Math.sqrt(N); i += 2){
             j = 0;
            while(n1 % i == 0){
             n1 /= i;
             j++;
            }
            if(j>0)
            arr.add(j);
         }
         return arr;
     }
}