//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import java.util.Scanner;
public class Array1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter number of elements:- ");
        int n= sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
            //System.out.print(i);
        //System.out.print("hello");
        System.out.println("\nNumbers in  normal form");
        for(int i=0;i<arr.length;i++)
        {
            //System.out.println(arr.length);
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nNumber after reversing \n");
        for(int i=arr.length-1;i>=0;i--)
        {
            //System.out.print(arr[i]);
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
    
}

/*
Mananjay
Deepprabha
tuhin
kajal
aditya
*/
    
