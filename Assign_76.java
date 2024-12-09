package FirstPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_76 {
	
	public static void main(String arg[])
	{
       int age[] =new int [5]; 
		
		Scanner sc = new Scanner(System.in);
		for (int j=0 ; j <= 4 ; j++)
		{
			System.out.println("Enter the number:");
			age[j]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(age));
	}
}
