import java.util.Scanner;
class practiceSet3_6
{
	static int Pattern(int n)
	{
		if(n<0)
		{
			return 1;
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(Pattern(n-1));
				System.out.print(" * ");
			}
		
		}
		return " 0 ";
		 
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to recursion programming");
		System.out.println("Pattern printing using recursion");
		System.out.println("Enter number of rows in Pattern ");
		int n= sc.nextInt();
		System.out.println(Pattern(n));
		//Pattern(n);
	}

}
