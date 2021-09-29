import java.util.*;
class Main {
  public static void main(String[] args) {
    
    System.out.println("Welcome to programming world!!");
    Scanner sc = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    Scanner sa = new Scanner(System.in);
    
    System.out.println("Press 1 for Converting String to lower case");
    System.out.println("Press 2 for Converting String to Uppercase");
    System.out.println("Press 3 to change spce to underscore");
    System.out.println("Press 4 to check wether multiple number of underscore are present or not");
    //System.out.println("Press 99 to exit");
    
        int n = sc.nextInt();
    switch(n)
    {
        
                
        case 1:
            System.out.println("welcome to string conversion \nEnter your value");
             String name1 = sc.next();
            // now for converting all string to upper case.....
            System.out.println("Normal text before operation "+name1);
            System.out.println("text after operation "+name1.toUpperCase());
        break;
        case 2:
            System.out.println("welcome to string conversion \nEnter your value");
        	String name2 = sc.next();
            // now for converting all string to upper case.....
            System.out.println("Normal text before operation "+name2);
            System.out.println("text after operation "+name2.toLowerCase());
        break;
        case 3:
            System.out.println("welcome to string conversion from \"space\" to \"underscore\" \nEnter your value");
        	String name3 = ss.nextLine();
        	System.out.println("Normal text before operation:\t "+name3);
        	System.out.println("Text after operation:\t"+name3.replaceAll(" ","_"));
            break;
        case 4:
            System.out.println("To check wether multiple number of underscore are present or not");
            String name4=sa.nextLine();
            System.out.println("Normal text before operation:\t "+name4);
        	System.out.println("State after operation:\t"+name4.indexOf("  "));
        	System.out.println("State after operation:\t"+name4.indexOf("   "));
        	
            
            break;
            
        default:
        System.out.println("Wrong input");
        
        
    }
        
    
    
    
    
    
    
  }
}
