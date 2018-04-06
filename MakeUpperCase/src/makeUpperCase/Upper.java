//Write function to capitalize all letters in a string. Call this function makeUpperCase.

package makeUpperCase;
import java.util.Scanner;

class Upper{
	  public static String MakeUpperCase(String str){
	  str = str.toUpperCase();
	  return str;
	  }
	  public static void main(String[] args){
		  Scanner reader = new Scanner(System.in);
		  System.out.println("Please enter a string: ");
		  String str_input = reader.nextLine();
		  reader.close();
		  System.out.println(MakeUpperCase(str_input));
		  
	  }
	}