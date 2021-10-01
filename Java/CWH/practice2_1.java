import java.util.*;
class practice2_1
{
		public static void main(String[] args)
	{
		//System.out.println("Practice problem number 2_1");
		System.out.println("Addition of float number ");
		Scanner sc= new Scanner(System.in);
		int n=5;
		float sum=0;
		float arr[]= new float[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();	
		}
		//for calculating sum of numbers....
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all float number "+sum);
	}
}
