import java.util.Scanner;
class practiceSet3_5
{
	public static int Pattern(int n)
	{
		if(n<0)
		{
			return "*";
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				return ("  * "+Pattern(n-1));
			}
	}
	public static void main(Strings args[])
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Welcome to recursion programming");
		System.out.println("Pattern printing using recursion");
		Ssytem.out.println("Enter number of rows in Pattern ");
		int n= sc.nextInt();		
		System.out.println(Pattern(n));
		

	}

}
