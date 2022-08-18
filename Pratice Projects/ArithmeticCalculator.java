package demo1;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args)
	   {
	      double num1, num2, res=0;
	      int choice;
	      Scanner scan = new Scanner(System.in);
	      System.out.print("\nEnter FIRST Number: ");
	      num1 = scan.nextDouble();
	      System.out.print("\nEnter SECOND Number: ");
          num2= scan.nextDouble();
	      
	        System.out.println("1. Addition");
	         System.out.println("2. Subtraction");
	         System.out.println("3. Multiplication");
	         System.out.println("4. Division");
	         System.out.println("5. Exit");
	         System.out.print("Enter Your Choice (1-5): ");
	         choice = scan.nextInt();
	         
	         switch(choice)
	         {
	            case 1:
	               
	               res = num1+num2;
	               System.out.println(num1+ " + " +num2 +" = " +res+ "\n");
	               break;
	            case 2:
	               
	               res = num1-num2;
	               System.out.println(num1+ " - " +num2 +" = " +res+ "\n");
	               break;
	            case 3:
	               
	               res = num1*num2;
	               System.out.println(num1+ " * " +num2 +" = " +res+ "\n");
	               break;
	            case 4:
	               
	               res = num1/num2;
	               System.out.println(num1+ " / " +num2 +" = " +res+ "\n");	               break;
	            
	            default:
	               System.out.println("\nInvalid choice!");
	               break;
	         }
	         
	      
	   } 

}
