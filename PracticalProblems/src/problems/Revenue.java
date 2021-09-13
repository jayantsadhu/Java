package problems;

import java.util.*;
import java.io.*;

public class Revenue 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		
		int T = Integer.parseInt(in.readLine());
		int n=T;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		while(T-- > 0)
		{
			list.add(Integer.parseInt(in.readLine()));
		}
		Collections.sort(list);
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<list.get(i)*(n-i))
				max = list.get(i)*(n-i);	
		}
		System.out.println(max);
	}
}
