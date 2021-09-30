import java.util.Scanner;
class practiceset_5
{
	public static void main(String[] args)
	{
		System.out.println("Practice Problem number 5");
		System.out.println("Fcatorial using while loop");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		int n=sc.nextInt();
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Fcatorial of number \t"+fact);
		
	}
}
