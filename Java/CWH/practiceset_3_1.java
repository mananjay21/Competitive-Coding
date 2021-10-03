import java.util.Scanner;
class practiceset_3_1
{
	static int fact(int n)
	{
		int fact;
		if(n==0|| n==1)
		return 0;
		else
		{
			fact=fact*fact(n-1);
		}
		return fact;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Factorial program by  using recursioin");
		System.out.println("Enter the value for which you have to calculate factorial ");
		int n= sc. nextInt();
		System.out.println("Factorial of number = \t"+fact(n));
		
		
		
	}
	
	
}
