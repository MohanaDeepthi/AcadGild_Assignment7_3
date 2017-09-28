//package name
package assignment7_3;
import java.util.Scanner;

//class name
public class AcadGild_Assignment7_3 {
	//main method
	public static void main(String args[]) {
		//Instantiating String builder object
		  StringBuilder s1=new StringBuilder();
		  StringBuffer sb=new StringBuffer();
		  //Calculating initial capacity of the StringBuilder
		  int iniCap=s1.capacity();
		  //Calculating initial capacity of the StringBuffer
		  int iniCapSb=sb.capacity();
		  //Printing capacity before appending String
		  System.out.println("Intial Capacity of String Builder & String Buffer :"+iniCap+" "+iniCapSb);
		
		  //Instantiating Scanner object
		  Scanner scanInp=new Scanner(System.in);
		  System.out.println("Please enter the input String");
		  String str1= scanInp.nextLine();  // taking input from user
		  //Appending string to StringBuilder and StringBuffer
		  s1.append(str1);
		  sb.append(str1);
		  System.out.println(str1);
 		  //Calculating final capacity
		  int finalCap=s1.capacity();
		  int finalCapSb=sb.capacity();
		  //Printing final capacity
		  System.out.println("Capacity after increment StringBuilder & String Buffer :"+finalCap+" "+finalCapSb);
	
		  //Verifying the new capacity with the formula
		  if(s1.length()>iniCap){
			  int newCap=(iniCap*2)+2;
			  int newCapSb=(iniCapSb*2)+2;
			  System.out.println("Expected capacity according to formula String Builder & StringBuffer :"+newCap+" "+newCapSb);
						  
		  }
		  
		  //closing the scanner object
		  scanInp.close();
	  }
	  
}
