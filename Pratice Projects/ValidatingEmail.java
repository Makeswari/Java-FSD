package demo2;
import java.util.ArrayList;
import java.util.Scanner;
public class ValidatingEmail {
	public static void main(String[] args){
		
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("enter the number of data to be entered");
		  int n=0;
		  n=sc.nextInt();
		  
		  
	      ArrayList <String> list = new ArrayList<String>();
	      //Instantiating an ArrayList object
		  int i=0;
	      //Instantiating an ArrayList object
		  while (i<n) {
			  System.out.println("Enter Email Id: ");
	            String S=sc.next();
	            list.add(S);
	            i++;
		  }
	      
	      
		  System.out.println("Enter email id to found: ");
		  String x=sc.next();
		  
		  
	      for (String element : list){
	         if (element.contains(x)){
	               System.out.println("Email Id found "+element);
	         }
	      }
	 }
}


