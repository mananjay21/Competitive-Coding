import java.util.Scanner;

class practiceset_4
{
	
	public static void main(String[] args)
	{
		System.out.println("Practice problem number 4");
		System.out.println("Program to calculate factorial of a number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fcatorial of number \t"+fact);
		
	}
}
