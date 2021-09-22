import java.util.Scanner;


public class percentage {
    public static void main(String[] args) {
        //program for calculating percentage of subjects
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of subject ");
        int n= sc.nextInt();
        //int arr[n];
        double p=0;
        for(int i=1;i<=n;i++)
        {
           System.out.print("Enter the subject "+i+" marks ") ;
           p=p+sc.nextFloat();


        }
        System.out.println((p/n)+"%");
    }
    
}
