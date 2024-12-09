package FirstPackage;
import java.util.*;
public class Assign78 {
	
	public static void main(String arg[])
	{
		
		int age[] =new int [5]; 
				
		Scanner sc = new Scanner(System.in);
		for (int j=0 ; j <= 4 ; j++)
		{
			System.out.println("Enter the number:");
			age[j]= sc.nextInt();
		}
		System.out.println("Enter number to be checked in Array");
		int num = sc.nextInt();
		
		
		for ( int i=0 ; i<= 4;i++)
		{
			if (age[i]== num)
			{
				System.out.println("Number is part of Array");
			}
			
		}
		
		
	}

}
