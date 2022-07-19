package demo;
class defaultAS{
	void display()
	{
		System.out.println("In Default Access specifier");
	}
}

public class AccessModifier {
public static void main(String args[])
{
	defaultAS obj= new defaultAS();
	System.out.println("Default Access specifier");

	obj.display();
}
}
