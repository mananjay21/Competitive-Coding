import java.util.*;
import java.lang.*;
import java.io.*;

public class Test {

public static void main (String[] args)
	{
	Console console=System.console();
	if(console != null){
	    String userInput=console.readLine();
	    console.writer().println("You entered: "+userInput);
	}
	else 
	{
	    System.err.println("console not avilable ");
	}

}
}
