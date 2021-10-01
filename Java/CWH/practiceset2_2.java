import java.util.*;
class practiceset2_2
{
	public static void main(String[] args)
	{
		System.out.println("Practice problem number 2_2");
		System.out.println("A Program to check number is present innarray or not  ");
		Scanner sc = new Scanner(System.in);
		int n=5;
		int c=0;
		int arr[]=new int[n];
		System.out.println("Enter the element in array");
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//for checking number is present in  it or not...
		System.out.println("Enter the number to check it available or not ");
		int num= sc.nextInt();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			c++;
			
		}
		if(c>0)
			System.out.println("The nuber is present");
		else
			System.out.println("The number is not present");
		
	}
}
