import java.util.Scanner;
class practiceset_7
{
	public static void main(String[] args)
	{
		System.out.println("Practice problem number 7");
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate multiplication of sum of digit ");
		System.out.println("Enter the element to calculate multiplication");
		int n= sc.nextInt();
		int mult=0;
		for(int i=1;i<=10;i++)
		{
			mult=mult+i*n;
		}
		System.out.println("Total sum of number \t"+mult);
		
	}
}
