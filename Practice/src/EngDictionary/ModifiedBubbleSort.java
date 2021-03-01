package EngDictionary;
import java.util.*;
public class ModifiedBubbleSort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the string: ");
		int len=sc.nextInt();
		sc.skip("\n");
        String str[]=new String[len];
        
        for(int i=0; i<len; i++){
           str[i]=sc.nextLine();
        }

        for(int k=len;k>=2;k--){
        	int flag=0;
	        for(int i=0; i<=k-2; i++){
	  
	        	for(int j=0;true;j++) {
	                char c1;
			    	try{c1=str[i].charAt(j);}
			                catch(StringIndexOutOfBoundsException e){break;}
			    	char c2;
	                try{ c2=str[i+1].charAt(j);}
	                catch(StringIndexOutOfBoundsException e){
	                    String s=str[i];
	                    str[i]=str[i+1];
	                    str[i+1]=s;
	                    break;
	                }
		        	if(c1==c2) continue;
		        	else if((int)c1<(int)c2) break;
		        	else {
		        		String s=str[i];
		        		str[i]=str[i+1];
		        		str[i+1]=s;
		        		flag=1;
		        		break;
		        	}
	        	}
	        }
	        if(flag==0) break;
        }
        System.out.println("");
        for(String st:str)
        	System.out.println(st);
	}
}
