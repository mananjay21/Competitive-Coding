import java.util.Scanner;
class practiceset_6
{
	public static void main(String[] args)
	{
		System.out.println("Practice Problem number 6");
		System.out.println("Fcatorial using Do while loop");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		int n=sc.nextInt();
		int fact=1;
		do
		{
			fact=fact*n;
			n--;
		}while(n>0);
		System.out.println("Fcatorial of number \t"+fact);
		
	}
}
