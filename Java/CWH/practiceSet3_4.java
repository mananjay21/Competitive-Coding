import java.util.Scanner;
class practiceSet3_4
{
	static int avg(double a,double b)
	{
	
	double m =(a+b)/2f;	
	System.out.println(m);
	return m;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Program to  pass value in argument and calculate average ");
		System.out.println("Print the value of A");
		double a= sc.nextFloat();
		System.out.println("Print the value of B");
		double b= sc.nextFloat();
		//System.out.println("Average of number are :" +avg(a,b));
		avg(a,b);
		
		
	}


}
