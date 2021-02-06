package PracticePurpose;

	import java.text.SimpleDateFormat;
	import java.util.Locale;
	public class Java_Locale_List {
	 
	    public static void main(String[] args) {
			
	    	long initialTime=System.currentTimeMillis();
			//returns array of all locales
	        Locale locales[] = SimpleDateFormat.getAvailableLocales();
			
			//iterate through each locale and print 
			// locale code, display name and country
	        for (int i = 0; i < locales.length; i++) {
	            System.out.printf("%10s - %s, %s \n" , locales[i].toString(), 
					locales[i].getDisplayName(), locales[i].getDisplayCountry());
	        }
	        long finalTime=System.currentTimeMillis();
	        System.out.println("Time taken for this program: "+ (finalTime-initialTime)+"\n"+initialTime);
	        /*for(int i = 0; i < locales.length; i++) {
	        	if(locales[i].getDisplayCountry()=="France")
	        		System.out.println(locales[i].toString()+" -- "+locales[i].getDisplayName()+",  "+locales[i].getDisplayCountry());
			}*/
	    }
	}
