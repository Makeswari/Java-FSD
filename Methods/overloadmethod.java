package demo;

public class overloadmethod {
	void area(int b,int h)
	{
		System.out.println("AREA OF TRIANGLE :"+(0.5*b*h));
	}
	void area(int r)
	{
		System.out.println("AREA OF Circle :"+(3.14*r*r));
	}
	public static void main(String a[])
	{
		overloadmethod o=new overloadmethod();
		o.area(10,15);
		o.area(5);
	}

}
