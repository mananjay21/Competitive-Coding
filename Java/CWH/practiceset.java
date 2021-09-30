import java.util.Scanner;
class practiceset
{
	public static void main(String args[])
	{
		System.out.println("Practice set Question number 1");
		System.out.println("Pattern printting");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in pattern");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
