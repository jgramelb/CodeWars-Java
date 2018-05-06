/*Write a method that has a parameter of type int with the name kiloBytes
The method should not return anything and it needs to calculate megabytes and remaining kilobytes. 

If the kilobytes given < 0, print "invalid Value".
Otherwise, it needs to print a message in the format XX KB = YY MB and ZZ MB.


*/


public class Main {
  public static void printMegaBytesAndKiloBytes(int kiloBytes){
    //Calculate megabytes and remaining kilobytes
      
    //if parameter is <0 print "invalid value"
    if (kiloBytes<0){
        
      System.out.println("Invalid Value");
        
    }
    
    else{ 
    
      //Calculate how many megabytes in kiloBytes
      int YY = (int)(kiloBytes / 1024);
        
      //Calculate how many kbRemaining in kiloBytes given
      int ZZ = kiloBytes % 1024;
      
      //Just call kiloBytes XX instead
      int XX = kiloBytes;
        
      String printMBKB = XX + " KB = " + YY + " MB and " + ZZ + " KB";
      
      //print "XX KB = YY MB AND ZZ KB"
      System.out.println(printMBKB);
    }   
  }
  public static void main(String[] args){
    printMegaBytesAndKiloBytes(-55);
    printMegaBytesAndKiloBytes(0);
    printMegaBytesAndKiloBytes(394298);
  }
  
}