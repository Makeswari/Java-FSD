package demo;

public class TypeConversion {
	public static void main(String args[])
	{
		System.out.print("Implicit Type conversion  : \n");
		char c='a';
		int v=c;
		System.out.println("char to int : "+v);
		float a=c;
		System.out.println("char to float : "+a);
		double b=c;
		System.out.println("char to double : "+b);
		long d=c;
		System.out.println("char to long : "+d+"\n");
		
		System.out.println("Explicit Type Conversion: ");
		double f=45.00;
		int e=(int)f;
		System.out.println("Value of f : "+f);
		System.out.println("double to int : "+e);

		



	
	}

}
