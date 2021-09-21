
import java.util.Scanner;
public class input

{
    
    public  static void main (String [] args)
    {
        System.out.println("program to take input ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of two  value ="+(a+b));
        System.out.println("Two check next value is integer or not ");
        boolean c=sc.hasNextInt();
        System.out.println(c);
        System.out.println("To take a single string value ");
        String man =sc.next();
        System.out.println(man);
        System.out.println("To take all string length");
        String pan =sc.nextLine();
        System.out.println(pan);

        



    }
}
