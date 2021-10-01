import java.util.Scanner;
class practiceSet_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Practice problem number 90");
		System.out.println("Multidimentional array");
		System.out.println("Enter the value of rows");
		int row=sc.nextInt();
		System.out.println("Enter the vlaue of column");
		int col = sc.nextInt();
		
		int [][] arr= new int[row][col];
		//for taking input in Multidientional array 
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//for printing multidimentional array......
		System.out.println("Multidimentional Array ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
}
