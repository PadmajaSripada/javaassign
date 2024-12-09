package FirstPackage;
//import java.util.*;

public class ArrayClass {
	
	static void average(int sum , int no)
	{
		double avg = sum/no ; 
		System.out.println("Average of numbers :" + avg);
	}
	
	public static void main(String arg[])	{
	
		int a[] = {5,8,16,20,5};
		int sum = 0 ;
		
		
		
	    for ( int i=0 ; i < a.length-1 ; i++)
	    {
	    	 sum = sum + a[i] ;
	    	 
	    }
	    System.out.println(sum + " " + a.length);
	 average (sum ,a.length);
	 
	
}

}
