package JUSLCodeClub;
import java.io.*;
public class VowelsInFirstHalfRot {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine().trim());
		
		while(testCases-- >0) {
			int n = Integer.parseInt(br.readLine().trim());
			String letters = br.readLine().trim();
			int totalVowels = 0;
			int vowels = 0;
			
			for(int i=0;i<n;i++) 
				if(isVowel(letters.charAt(i))) {
					totalVowels++;
					if(i<n/2)
						vowels++;
				}
			int count = 0;
			for(int i=0;i<n;i++) {
				int j = (i+n/2)%n;
				if(isVowel(letters.charAt(i)))
					vowels--;
				if(isVowel(letters.charAt(j)))
					vowels++;
				
				if(vowels>totalVowels/2)
					count++;
			}
			System.out.println(count);
		}
	}
	static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}
	
}
