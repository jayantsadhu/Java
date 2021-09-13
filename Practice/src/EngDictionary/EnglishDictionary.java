package EngDictionary;
import java.util.Scanner;
public class EnglishDictionary {
	

	    static boolean isAnagram(String a, String b) {
	    	a=a.toLowerCase();
	    	b=b.toLowerCase();
	        char[] chrA=a.toCharArray();
	        char[] chrB=b.toCharArray();
	        if(a.length()!=b.length())
	            return false;
	        
	        for(int i=0;i<chrA.length;i++) {
	                int n1=noOfChar(chrA,chrA[i]);
	                int n2=noOfChar(chrB,chrA[i]);
	                if(n1!=n2) {
	                    return false;
	                }
	            }return true;
	        }
	    static int noOfChar(char[] chr, char c) {
	        int count=0;
	        for(int i=0;i<chr.length;i++) {
	            if(chr[i]==c)
	                count++;
	        }
	        return count;
	    }
	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

