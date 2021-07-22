import java.util.*;


public class Flames1 
{
	public static void main(String[] args) 
	{
		int x = 0;
		
	System.out.println("Enter Name of Premi :");
	Scanner sc=new Scanner(System.in);
	String Male = sc.nextLine(); 
    Male=Male.toLowerCase();

    
    
	System.out.println("Enter Name of Premika :");
	String Female = sc.nextLine(); 
    Female=Female.toLowerCase();
 
    for(int i=0; i<Male.length();i++)
        {
            for(int j=0; j<Female.length();j++)
            {
                if(Male.charAt(i) == Female.charAt(j))
                {
                    Male.replace(i, i+1, "0"); // replacing matching characters into "0"
                    Female.replace(j,j+1,"0");
                }
            }
        }
    System.out.println(Male+" "+Female);
    
	sc.close();
	}
}