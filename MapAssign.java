package FirstPackage;
import java.util.*;

public class MapAssign {
	
	public static void main(String arg[])
	{   
		
	   Map <String,Double>m1 = new HashMap<String ,Double>();
	      m1.put("Rahul",12000.3);
		  m1.put("Mehul",8293789.67);
		  m1.put("Akash",67899.00);
		  m1.put("Kushal", 1231232.00);
		  
		  System.out.println(m1);
		  
		// using the putAll() method to add the elements
		  
		Map m2 = new HashMap();
		m2.putAll(m1);
		System.out.println(m2);
	}

}
