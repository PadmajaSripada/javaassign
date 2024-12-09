package FirstPackage;

public class Assign77 {

	public static void main(String []arg)
	{
		int arr1[] = new int[] {1,2,3,4,5};
		int arr2[] = new int[] {1,2,6,4,5};
		int count=0;
		
		boolean b = arr1.equals(arr2);
		System.out.println(b);
		
		for (int i=0 ; i <=4 ; i++)
		{
			 if (arr1[i]==arr2[i])
			 {
				 count++ ;
			 }
		}
		 if(count == 5)	
		 {
			 System.out.println("Arrays are equal : "+ count);
		 }else
		 {
			 System.out.println("Arrays are not equal :" + count);
		 }
	}
	
}
