import java.util.Scanner;
class practiceSet3_3
{
	static int sum(int n)
	{
		//int sum1=0;
		if(n>0)
		{
		return n+sum(n-1);	
		}
		else
		{
			return 0;
		}
		
	}
	public static void main(String [] agrs)
	{
		System.out.println("Sum of n natural number using recursion");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the last vlaur upto  wjhich you have to  calculate sum of nuamber ");
		int n=sc.nextInt();
		System.out.println("sum of natural number "+n+"\t: "+sum(n));
		
		
	}

}
