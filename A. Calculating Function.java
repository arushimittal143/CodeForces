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
		long n=sc.nextLong();
		long s=0;
		if(n%2==0)
	    s=n/2;
		else
		s=-(n+1)/2;
		System.out.println(s);
	}
}
