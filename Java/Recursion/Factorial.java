/*
Test Case :
int t = sc.nextInt();
for(int i=0;i<t;i++) { }
*/

/*
Arraylist Operations :
list.add()
list.get(index)
list.set(index,ValuetoChange)
list.remove(index)
list.size()
list.contains(value)
Collections.sort(list)
More : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
*/

/*
Initialise New ArrayList : 
ArrayList<Integer> num = new ArrayList<Integer>(); //Change Type 
*/
import java.util.*;
import java.io.*;
public class Factorial {
	
	static int recursion(int n)
	{
		int ans;
		if(n<=1)
			return n;
		ans = n*recursion(n-1);
		//System.out.print(ans);
		return ans;
	}
	
	public static void main (String[] args) {
		System.out.println("welcome");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Factorial of number " + recursion(n));
		
	}
}

