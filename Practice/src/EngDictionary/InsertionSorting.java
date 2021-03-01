package EngDictionary;
import java.util.*;
public class InsertionSorting {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the string: ");
		int len=sc.nextInt();
		sc.skip("\n");
        String str[]=new String[len];
        
        for(int i=0; i<len; i++){
           str[i]=sc.nextLine();
        }
        
        for(int k=1;k<len-1;k++){
        	int i=k-1;
        	String temp=str[k];
        	boolean b=true;
	        while(i>=0 && b){
	        	int flag=0;
	        	for(int j=0;true;j++) {
	                char c1;
			    	try{c1=str[k].charAt(j);}
			        catch(StringIndexOutOfBoundsException e){
			        	str[i+1]=str[i];
			        	break;
			        	}
			    	
			    	char c2;
	                try{ c2=str[i].charAt(j);}
	                catch(StringIndexOutOfBoundsException e){
	                	b=false;
	                	break;
	                	}
	                
		        	if(c1==c2) continue;
		        	else if((int)c2>(int)c1) {flag=1; break;}
		        	else break;
	        	}
	        	
	        	if (flag==1) {
	        		str[i+1]=str[i];
	        		i--;
	        		continue;
	        	}
	        	else {
	        		i--;
	        		break;
	        	}
	        }
	        str[i+1]=temp;
        }
        System.out.println("");
        for(String st:str)
        	System.out.println(st);
	}
}
