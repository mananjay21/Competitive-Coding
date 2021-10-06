import java.util.Scanner;
class practiceSet3_5
{
	static void Pattern(int n)
	{
		while(n>0)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print("  * ");
			}
	}
	
	public static void main(String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Welcome to recursion programming");
		System.out.println("Pattern printing using recursion");
		Ssytem.out.println("Enter number of rows in Pattern ");
		int n= sc.nextInt();
		Pattern(n);
		
	}

}
