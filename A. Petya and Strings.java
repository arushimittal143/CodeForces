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
		String s1=sc.next();
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int a=s1.compareTo(s2);
	    if(a==0)
	    {
	    	System.out.println("0");
	    }
	    else if(a<0)
	    {
	    		System.out.println("-1");
	    }
	    else
	    {
	    		System.out.println("1");
	    }
	}
}
