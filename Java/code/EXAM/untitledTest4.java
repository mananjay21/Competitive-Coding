/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws IOException{
	
	byte[] intialArray={'X','Y','Z','A','B','C'};
	String ans=pullBytes(new ByteArrayInputStream(intialArray),3);
	System.out.println(ans);
	
}
public static String pullBytes(InputStream in,int count) throws IOException
{
	in.mark(count);
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<count;i++)
			sb.append((char) in.read());
		
	in.reset();
	in.skip(1);
	sb.append((char)in.read());
	return sb.toString();
	
}
}
