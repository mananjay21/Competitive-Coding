import java.util.Scanner;
class PracticeSet_8
{
	public static void main(String[] args)
	{
		System.out.println("Practice problem number 8");
		System.out.println("Array programming");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total numer of element in array");
		int n = sc.nextInt();
		int [] a=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//for printing an array...
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("for Each loop");
		for(int elem	:a)
		{
			System.out.println(elem);
		}
	}
}
