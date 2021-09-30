import java.util.Scanner;
class practiceset_2
{
	public static void main(String [] args)
	{
		System.out.println("Practice set Question number 2");
		System.out.println("Program to print nutural even number using while loop ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of Even natural number ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(2*i);
			i++;
		}
		System.out.println("End of loop");
		
	}
}
