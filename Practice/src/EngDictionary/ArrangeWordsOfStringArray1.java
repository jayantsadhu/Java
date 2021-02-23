package EngDictionary;
import java.util.*;
public class ArrangeWordsOfStringArray1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		String strLetter[]=s.split("");
        String str[]=new String[s.length()+1-k];
        
        for(int i=0; i<=s.length()-k; i++){
            str[i]="";
            
            for(int j=i; j<i+k; j++)
                str[i]=str[i]+strLetter[j];
        }
        //for(String st:str)
        //System.out.print(st+" ");
        
        int n1=0,n2=0;
        
        for(int i=1; i<=s.length()-k; i++){
        	
        	for(int j=0;j<k;j++) {
	        	char c1=str[n1].charAt(j);
	        	char c2=str[i].charAt(j);
	        	
	        	if(c1==c2) continue;
	        	else if((int)c1<(int)c2) break;
	        	else {
	        		n1=i; break;
	        	}	
        	}
        	
        	for(int j=0;j<k;j++) {
	        	char c1=str[n2].charAt(j);
	        	char c2=str[i].charAt(j);
	        	
	        	if(c1==c2) continue;
	        	else if((int)c1>(int)c2) break;
	        	else {
	        		n2=i; break;
	        	}
        	}
        	
        		
        /*char ch1[]=str[n1].toCharArray();
        char ch2[]=str[n2].toCharArray();
        char ch[]=str[i].toCharArray();
        
        for(int l=0;l<k;k++){
            if((int)ch[l]<(int)ch1[l]){
                n1=i;       //smallest
                break;
            }
            else if((int)ch1[l]<(int)ch[l])
            	break;
            else continue;
        }
        for(int l=0;l<k;k++){
            if((int)ch[l]>(int)ch2[l]){
                n2=i;       //largest
                break;
            }
            else if((int)ch2[l]>(int)ch[l])
            	break;
            else continue;
        }
        System.out.print(i+" ");*/
        	
        	
        }
        System.out.println(str[n1]+"\n"+str[n2]);
	}
	
}
