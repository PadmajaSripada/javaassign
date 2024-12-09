package FirstPackage;
import java.util.*;

public class Assign_70 {

	public static void main(String arg[])
	{
		
		String str = "RADAR" ;
		
		String rev ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any word :");
		str=sc.next();
		
		//System.out.println(str.length());
		
		for(int i=str.length()-1 ; i>= 0;i--)
		{
			//System.out.println(str.charAt(i));
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reversed String:" +rev);
		
		if(rev.equals(str))
		 {
			System.out.println("String is palindrome ");	
		 }
		else
		{
			System.out.println("String is not palindrome ");	
		}
	}
	
}
