package FirstPackage;
import java.util.*;

public class ArrayList_1 {
	
	public static void main(String arg[])
	{
		List <Integer> l1 = new ArrayList<Integer>();
		l1.add(236);
		l1.add(543);
		l1.add(36);
		l1.add(698);
		l1.add(79);
		
		System.out.println("Before Sorting : " + l1);
		
		//sorting the list l1
		Collections.sort(l1);
		
		System.out.println("After sorting : " +l1);
		
		List <String>l2 = new ArrayList<String>();
		l2.add("John");
		l2.add("michael");
		l2.add("richard");
		l2.add("peter");
		l2.add("tony");
		//sorting
		System.out.println("Before Sorting : " + l2);
		Collections.sort(l2);
		System.out.println("After sorting : " +l2);
		//remove method
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		//add method
		l1.add(4,13);
		System.out.println(l1);
		
//set mthod		
		l2.set(0, "hello");
		System.out.println(l2);
		
		// iterating in forward direction
		ListIterator lit = l1.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		
		System.out.println(l1.size());
		
		//Iterating in backward direction
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
	
	


