/*
 * IN THIS WE ARE GOINT TO GENERATE A RANDOM NUMBER AND WE ARE GOING TO ASK TO USER TO GUESS THIS NUMBER
 * 
 * */
import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		System.out.println("..............welcome to RANDOM NUMBER GUESSING PROGRAMMING........... ");
		//MINI PROJECT
		int number=(int)(Math.random()*100);
		//System.out.println(number);
		int usernum=0;
		do{
			System.out.println();
			System.out.println("Guess the nummber (0-100) :");
			Scanner sc= new Scanner(System.in);
			usernum = sc.nextInt();

			if(number==usernum)
			{
				System.out.println("WOO.....HOO ENTERED NUMBER IS SAME AS RANDOM NUMBER ");
				break;
			}
			if(number>usernum)
			{
				System.out.println("Entered number is small" + " Enter a larger number to get Random number");
			}
			else if(number<usernum)
			{
				System.out.println("Entered number is large " + " Enter a smaller number to get Random number");
			}
			

		}while(usernum>0);
		System.out.println(".............THE END..........");
		System.out.println("Random number was: "+number);
		//System.out.println(number);
		
		
	}
}
