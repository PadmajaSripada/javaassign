package FirstPackage;
import java.util.*;
public class Logical{
	
	 static double p = Math.PI;
	 
	 static void areaCircle(int a)
		{
			double area =p*a*a; 
			System.out.println("Area of circle:" + area);
		}
	 static void areaRect(int l , int b)
		{
			int area = l*b; 
			System.out.println("Area of Rectangle :" + area);
		}
	 static void areaSquare(int a)
		{
			int area = a*a; 
			System.out.println("Area of square:" + area);
		}
	 static void circumCircle(int r)
		{
			double c = 2*p*r; 
			System.out.println("circumference of circle:" + c);
		}
	 static void circumTri(int a,int b, int c)
		{
			int s = a+b+c; 
			System.out.println("circumference of Triangle:" + s);
		}
	 static void circumRect(int a,int b)
		{
			int c = 2*(a+b); 
			System.out.println("circumference of Rectangle:" + c);
		}

	public static void main(String arg[])
	{
	       ScannerOper so = new ScannerOper();
					
		   System.out.println("Enter  the 2  sides :");	
		   Scanner s =new Scanner(System.in);
			       
			int a1 = s.nextInt();
			int b1 = s.nextInt();
			//int c1 = s.nextInt();
			
			//areaSquare(a1);
			//circumCircle(a1);
			//circumTri(a1,b1,c1);
			
			circumRect(a1,b1);
				
	/*	for(int i=1;i <=10 ;i++)
		{
			int j= i%2;
			if(j==0)		
			{
				System.out.println(i );
			}
		} */
		
	}
}
