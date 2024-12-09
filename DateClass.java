package FirstPackage;

import java.util.*;

public class DateClass {
	
	public static void main(String arg[])
	{
		
		Date dt = new Date();
		
		System.out.println(dt.getTime());// epoch time /machine time
		
		Date d1 = new Date(dt.getTime()); // constructor converts epoch time to human time
		
		System.out.println(d1);
		
		String str = d1.toString();
		System.out.println(str.substring(4,7).concat(" ").concat(str.substring(8,10)).concat(" ").concat(str.substring(24,28)));
		
		System.out.println(new Date(d1.getTime() + 1000*60*60*24)); // future time next day 
		
		System.out.println(new Date(d1.getTime() - 1000*60*60*24)); // past time before day
		
	}
}
