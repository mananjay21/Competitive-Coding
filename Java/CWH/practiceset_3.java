import java.util.Scanner;
class practiceset_3
{
	public static void main(String[] args)
	{
		System.out.println("Practice set Question number 3");
		System.out.println("Program for multiplication of n number ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get multiplaication table");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
		
	}
}
