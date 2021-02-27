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
		int l=sc.nextInt();
		int b=sc.nextInt();
		int a=sc.nextInt();
		long r;
	    if(l%a==0)
	    {
	      r=l/a;
	    }
	    else
	    {
	    	r=l/a+1;
	    }
	    long s;
	    if(b%a==0)
	    {
	      s=b/a;
	    }
	    else
	    {
	    	s=b/a+1;
	    }
	    long c=r*s;
	    
	   System.out.println(c);
	}
}
