package FirstPackage;

import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionClass {
	
	public static void main(String arg[])
	{
		
		
		
		Collection c1 = new ArrayList();//collection 1
		c1.add("Volvo");
		c1.add("rose");
		c1.add("abd");
		c1.add("fgd");
		c1.add("nissan");
		
	
				
		System.out.println(c1);

		Boolean b = c1.contains("Volvo");
                if ( b==true)
                System.out.println("Volvo is present in Collection ") ;
                else
                System.out.println("Volvo not present in  collection");
		
         }



}
