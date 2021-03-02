import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	    char st[]=str.toCharArray();
	    char s=Character.toUpperCase(st[0]);
	    System.out.print(s);
	    for(int i=1;i<st.length;i++)
	    {
	    	System.out.print(st[i]);
	    }
	}
}
