package demo;

public class Methods {
	public void add(int a,int b)
	{
		System.out.println("Addition of two number "+(a+b));
	}
public static void main(String args[])
{
	Methods obj=new Methods();
	obj.add(4, 5);
}
}
