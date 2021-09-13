package EngDictionary;
import java.util.*;
public class DictionarySelectionSorting {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the string: ");
		int len=sc.nextInt();
		sc.skip("\n");
        String str[]=new String[len];
        
        for(int i=0; i<len; i++){
           str[i]=sc.nextLine();
        }
        sc.close();
        int k=0;
        while(k<len-1){
	        for(int i=k+1; i<len; i++){
	        	for(int j=0;true;j++) {
	                char c1;
			    	try{c1=str[k].charAt(j);}
			                catch(StringIndexOutOfBoundsException e){break;}
			    	char c2;
	                try{ c2=str[i].charAt(j);}
	                catch(StringIndexOutOfBoundsException e){
	                    String s=str[k];
	                    str[k]=str[i];
	                    str[i]=s;
	                    break;
	                }
		        	if(c1==c2) continue;
		        	else if((int)c1<(int)c2) break;
		        	else {
		        		String s=str[k];
		        		str[k]=str[i];
		        		str[i]=s;
		        		//k=i; 
		        		break;
		        	}
	        	}
	        }k++;
        }
        System.out.println("");
        for(String st:str)
        	System.out.println(st);
	}
	
}
