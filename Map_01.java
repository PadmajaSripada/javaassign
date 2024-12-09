package FirstPackage;
//import java.util.HashMap;
import java.util.*;
//import java.util.Map.*;

public class Map_01 {

	public static void main(String arg[])
	{
		Map m1 =new HashMap();
		// Using the put method
		Map<String,Character> m = new HashMap <String,Character>();
		m.put("Anaya",'F');     // adds object in to the map
		m.put("Gayathri",'F');
		m.put("Adi",'M');
		m.put("Svadha",'F');
		m.put("Preena",'F');
		
		System.out.println(m);
		
		//Using get() method
		System.out.println("Values of key  :" + m.get("Preena"));
		
		// Assignment test
		
		/*for()
		{
			
		}*/
		Iterator it1 = m.keySet().iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next() );
			
		}
		Map m2 = new HashMap();
		
		// USING THE putAll method 
		m2.putAll(m);             // copies all the data of m to m2  
		System.out.println(m2);
		
		// using the equals method
		boolean b1 = m.equals(m2);
		System.out.println(b1);
		
		// Using the keySet() , values() entrySet() mehtods for iterating through map
		
		System.out.println(m.keySet()); //returns set of keys 
		System.out.println(m.values()); // returns set of values
		
		Set s1 = m.keySet();
		
		// using enhanced for loop for getting all the values
		for(String k:m.keySet())
		{
			System.out.println("Inside for"+k + "   " + m.get(k));
		}
		// using entryset to get all the values
		
		Iterator it =  m.entrySet().iterator();
		//Iterator it = m.keySet().iterator();
		while(it.hasNext())
		{
			System.out.println("Inside while " + it.next()); // prints both key value pair
		}
		
		// Using remove() method
		
		System.out.println("Before removing :" + m);
		m.remove("Svadha");
		System.out.println("After removing :" + m);
		
		// using the containsKey() method
		
		boolean b2 = m.containsKey("Svadha");
		System.out.println("Contains key svadha :"+ b2);
		
		// using the containsValue() method
		boolean b3 = m.containsValue('M');
		System.out.println("Contains value 'M' :"+b3);
		
		//using clear() method
		
		m.clear();
		System.out.println("After clear map m :" + m);
		
		boolean b4 = m.isEmpty();
		System.out.println("map m is empty :"+ b4);
	}
	
	
}
