import java.util.Scanner;

class practiceset_varargs
{
	static int sum(int ...arr){
		int result=0;
		for(int a:arr)
		{
			result+=a;
		}
		return result;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to var args Programming ");
		System.out.println("Sum of numbers = "+ sum(4, 5));
		System.out.println("Sum of numbers = "+ sum(4, 5,6,7));
		
		
	}
}
