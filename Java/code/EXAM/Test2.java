import java.util.*;
import java.lang.*;
import java.io.*;

public class Test2 extends Thread 
{
	public void run()
	{
		System.out.println("Inside run");
	}

public static void main (String[] args)
	{
		ExecutorService exService = Executors.newSingleThreadExecutor();
		exService.execute(new Test2());
		exService.execute(new Test2());
		exService.shutdown();

	}
}
