package FirstPackage;

import java.util.Scanner;

public class ScannerOper {
	static double p = Math.PI;
    int a=  20 ;
    int b = 30 ;
	
	
   static void areaCircle(double r)
	{  
	    double a =p*r*r ;
		System.out.println("Area of circle:" + a);
	}
	
	static void areaSquare(int a)
	{
		int area = a*a; 
		System.out.println("Area of square:" + area);
	}
	
	static void areaRectangle(int a, int b)
	{
		int area = a*b;
		System.out.println("Area of rectangle:" + area);
	}
	static void areaTriangle(int a, int b)
	{
		double area = (a*b)/2;
		
		System.out.println("Area of Triangle:" + area);
	}
	public static void main(String arg[])
	{
		
		System.out.println();
		ScannerOper so = new ScannerOper();
	
		System.out.println("Select 1 : (Area of Square) 2: (Area of circle ) 3: (Area of Rectangle) 4: (Area of Triangle)  ");
		
		Scanner s =new Scanner(System.in);
		int i = s.nextInt();
		
		switch(i)
		{
	    case 1:
	      System.out.println("Enter the value of side :");	
	      int a1 = s.nextInt();
		  areaSquare(a1);
		break;
		case 2 :
			System.out.println("Enter the value of radius :");	
			double r1 = s.nextDouble();
		   areaCircle(r1);
		 break ;
		case 3 :
			System.out.println("Enter the value of length:");	
			int l1 =s.nextInt();
			System.out.println("Enter the value of breadth :")	;
			int b1 =s.nextInt();
		  areaRectangle(l1,b1);
		  break;
		case 4 :
			System.out.println("Enter the value of base:");
			int b = s.nextInt();
			System.out.println("Enter the value of height :")	;
			int h = s.nextInt();
		  areaTriangle(b,h);
		  break;
	   }
	}
}
