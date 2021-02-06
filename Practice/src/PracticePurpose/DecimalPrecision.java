package PracticePurpose;
  
class DecimalPrecision { 
  public static void main(String[] args) { 
  
    double a = 0.9564; 
  
    // Setting the precision to 20 places 
    String amount1=String.format("%.2f", a);
    System.out.println(amount1);
   // double amount=Double.parseDouble(amount1);
    //System.out.println(amount);
  
    double b = 1; 
  
    // Setting the precision to 5 places 
    System.out.println(String.format("%.5f", b)); 
  } 
}
