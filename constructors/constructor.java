package demo;

public class constructor {
	int empid;
	String name;
	void display()
	{
		System.out.println(empid+" "+name);
	}
	public static void main(String[] args) {

		constructor emp1=new constructor();
		constructor emp2=new constructor();

		emp1.display();
		emp2.display();
		}

}

