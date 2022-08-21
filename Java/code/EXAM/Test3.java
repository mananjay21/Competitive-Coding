
public class Test3
{
	public static void main(String args[])
	{
		int i=10;
		int j=10;
		if(i++ <11 &++j<=10)
		{
			System.out.println(i+" : "+j);
		}
		else if (++i<=10 &j++<11)
		{
			System.out.println(i+" : "+j);
		}
		else 
		{
			System.out.println(i+" : "+j);
		}
			
	}
}
