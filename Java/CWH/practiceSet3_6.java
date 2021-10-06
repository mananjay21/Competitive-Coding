import java.util.Scanner;
class practiceSet3_6
{
	static void Pattern(int n)
	{
		if(n>0)
		{
			
			
			
			for(int i=0;i<n;i++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			Pattern(n-1);
			for(int i=0;i<n;i++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		 
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to recursion programming");
		System.out.println("Pattern printing using recursion");
		System.out.println("Enter number of rows in Pattern ");
		int n= sc.nextInt();
		//System.out.println(Pattern(n));
		Pattern(n);
	}

}
