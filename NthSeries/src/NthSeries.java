/*
Task:
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments.

Examples:
SeriesSum(1) => 1 = "1.00"
SeriesSum(2) => 1 + 1/4 = "1.25"
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
*/


import java.text.DecimalFormat;

public class NthSeries {
  
	
	public static String seriesSum(int n) {
	  
    double sum = 0; 
    int i = 0; 
    double fraci;
    
    //If the given value is 0 then it should return 0.00
    if (n <= 0){
      //Algorithm of the series, when n <= 0
      sum = 0;
      
      //Format the sum to return 0.00
      DecimalFormat df = new DecimalFormat("#0.00");
      String sumAsString = df.format(sum);
      
    
      return sumAsString;
    }
    
    n = n - 2;
    //String s = "Series: 1";

		for (i = 0; i<=n; i++){
      
      /*
      If you want to show the series:
      fraci = ((2*(i+2))+i);
      sum = sum + fraci;
      s = s + " + " + "1/" + fraci;
      */
      
      //Algorithm of the series
      fraci = ((2*(i+2))+i);
      fraci = 1/fraci;
      sum = sum + fraci;
      
    }
    /*Alogrith of series (continued):
    The actual sum (finalSum) should add the first term, 0. 
    */
    double finalSum = 1 + sum;
    
    
    //Format the finalSum such that you show two numbers after decimal point.
    DecimalFormat df = new DecimalFormat("##.00");
    String sumAsString = df.format(finalSum);
    
    
    return sumAsString;
    /*If you want to show the series:
    return s;
    */
	}
  public static void main(String[] args){
    System.out.println(seriesSum(0));
    System.out.println(seriesSum(-1));
    System.out.println(seriesSum(59));
  }
  
  
}