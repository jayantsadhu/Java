package ThirtyDays;

import java.util.*;  
import java.util.regex.Pattern;  
public class ScannerSkip {    
   public static void main(String args[]) throws NoSuchElementException {   
        //Initialize Scanner object  
        Scanner scan = new Scanner("dsavgfdrr125kjh Hello World! SSSIT 102 Hindi100 150 123");  
        //Skip the word that matches the specified pattern  
        //scan.skip(Pattern.compile("...lo"));
        
        //skips in the first word before a space and first occurrence of the pattern 
        scan.skip("[a-z A-Z]*");
        System.out.println("Left String: " +scan.nextLine());  
        scan.close();  
          }  
}