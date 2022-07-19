package demo;

public class callmethod {
	int val=150;
	int operation(int val)
	{
		val=val*10/100;
		return val;
	}
	public static void main(String a[]) {
		callmethod obj=new callmethod();
		System.out.println("Before Passing the Value "+obj.val);
		obj.operation(100);
		System.out.println("After Passing the Value "+obj.val);

	}

}
