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
public class ReverseArray {
	
	public static void NormalReverse(int arr[])
	{
		System.out.println("normal method to reverse a array using loop:-");
		for(int i=arr.length;i>0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main (String[] args) {
	
	System.out.println("welcome to Reverse Array program")	;
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	//printting normal array  ....
	System.out.println("Normal Array input:-");
	
	//System.out.print(arr);
	System.out.println(Arrays.toString(arr));
	//now  for reversing an array ...
	ReverseArray.NormalReverse(arr);
	
	//System.out.print(Arrays.toString(arr));
	
	
	
		
	}
}

