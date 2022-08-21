/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static Map<String, String> map= new HashMap<>();
    static List<String> keys= new ArrayList(List.of("S","p","Q","R"));
    static String[] values={"senate","people","of","rome"};
    
    static{
        for(var i=0;i<keys.size();i++)
        {
            map.put(keys.get(i), values[i]);
        }
    }
    
	public static void main (String[] args) {
	keys.clear();
	values= new String[0];
	System.out.println("Keys: "+keys.size()+"Values: "+values.length+"Map "+map.size());
	
	
	}
}
