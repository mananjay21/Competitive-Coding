import java.util.*;
public class Practice1
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("welcome to percentage calculator");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the marks :-");
			float arr[]=new float[5];
			float  s=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print("enter the marks of "+ (i+1) +" subject :- ");
				arr[i]=sc.nextInt();
				s=s+arr[i];
			}
			System.out.println("now average of all subject:- "+(s/arr.length)+"%");
		}
		catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      finally{
		  System.out.println("Type your name here");
		  Scanner sc= new Scanner(System.in);
		  String name= sc.nextLine();
		  System.out.println("hello gentelmen, we are very happy to hav e u Mr. "+name);
		  
		  
		 System.out.println("conver KM to mile ");
		 float km=sc.nextFloat();
		 System.out.println("Miles ="+(km*0.62));
		 
		 System.out.println("we need to check Entered number is integer or not ");
		 System.out.println(sc.hasNextInt());
		 
		  
	  }
     
		
	}
}
