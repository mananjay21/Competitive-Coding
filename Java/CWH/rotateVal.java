import java.util.Scanner;
import java.util.Arrays;
class rotateVal
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter total  number of clock wise rotation ");
		
		int k  =sc.nextInt();
		System.out.println("Normal array");
		System.out.println(Arrays.toString(arr));
		/*for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		 */
		 
		//for rotation of array in cloack wise ..........
		while(k>0)
		{
			int temp=0;
			for(int i=0;i<arr.size;i++)
			{
			temp=arr[i];
			arr[i]=arr[arr.size];
			arr[arr.size]=temp;
				
			}
		}
		
		
	
	}
}
