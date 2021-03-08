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
		long t=sc.nextLong();
		long a,b;
		long c=0,r=0,x=0,h=0;
		while(t>0)
		{
		a=t%10;
		r++;
	    if(a==7 || a==4)
	    {
		c++;
	    }
		t=t/10;
		}
		while(c>0)
		{
			b=c%10;
			x++;
			 if(b==7 || b==4)
		    {
			h++;
		    }
		    c=c/10;
		}
		 if(x==h && x!=0)
		{
			System.out.println("YES");
		}
		else
		{
		    System.out.println("NO");
		}
	}
}
