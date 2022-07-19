package demo;
import java.util.*;
public class Collection {
	public static void main(String a[])
	{
		System.out.println("ARRAYLIST");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Banglore");
		city.add("Chennai");
		System.out.println(city);
		
		System.out.println("\n");
		System.out.println("VECTOR");
		Vector<Integer> vec =new Vector<>();
		vec.addElement(11);
		vec.addElement(12);
		System.out.println(vec);
		
		System.out.println("\n");
		System.out.println("LINKEDLIST");
		LinkedList<String> name=new LinkedList<String>();
		name.add("Mahi");
		name.add("Raghav");
		System.out.println(name);
		
		System.out.println("\n");
		System.out.println("HASHSET");
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		System.out.println(set);
		
		System.out.println("\n");
		System.out.println("LINKEDHASHSET");
		LinkedHashSet<Integer> set1 =new LinkedHashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		System.out.println(set1);

}
}
