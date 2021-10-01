import java.util.*;
class practiceset2_5
{
	public static void main(String [] args)
	{
		System.out.println("Practice problem number 2_5");
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
		int min=0;
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			min=arr[i];
		}
		System.out.println("Minimum value \t"+min);
		
	}
}

