import java.util.*;
class practiceset2_4
{
	public static void main(String [] args)
	{
		System.out.println("Practice problem number 2_3");
		System.out.println("A Program to find maximum element in array ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int arr[]=new int[n]; 
		System.out.println("Enter the element in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*for reversing .............
		for(int i=arr.length+1;i>0;i--)
		{
			System.out.println(arr[i]);
		}
		*/
		int max=0;
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println("Maximum value \t"+max);
		
	}
}

