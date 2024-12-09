package FirstPackage;
import java.util.*;


public class ScannerClass {
	
	
	public static void main(String arg[])
	{
		System.out.print("Enter text"); 
		Scanner sc =new Scanner(System.in);
		String str= sc.next();
		System.out.println("you Entered");
		System.out.println(str);
		
		
		System.out.print("Enter first number");
		int a =sc.nextInt();
		System.out.print("Enter second number");
		int b = sc.nextInt();
		int s= a+b ;
		System.out.println("Sum=" + s);
		
	}

}
