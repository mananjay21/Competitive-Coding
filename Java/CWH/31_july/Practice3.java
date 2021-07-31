import java.util.*;
public class Practice3 {
	
	public static void main (String[] args) {
		int a =5;
		float b= 5.6696f;
		System.out.printf("The value os a is %d and the value of b is %f \n",a,b);
		
		System.out.printf("The value os a is %d and the value of b is %.2f",a,b);
		
		System.out.printf("\nThe value os a is %d and the value of b is %8.4f",a,b);
		
		//for taking string input 
		Scanner sc = new Scanner(System.in);
		//String val= sc.next();
		String val= sc.nextLine();
		System.out.println("The value of strring :- "+ val);
		
		
		//System.out.println("The value of strring :- "+ val1);
		
	}
}

