package FirstPackage;

import java.util.*;

public class Collection_demo {
	
	public static void main(String arg[])
	{
		 
		 
		 Vector v = new Vector();
		 v.add("hello");
		 v.add(123);
		 v.add(null);
		 
		 
		 System.out.println(v);
		 
		 PriorityQueue pq = new PriorityQueue();
		 pq.add("hello");
		 pq.add("true");
		 pq.add("true");
		 pq.add("123");
		 System.out.println(pq);
	}

}
