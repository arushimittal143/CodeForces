import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    if(n%2==0 && n!=2)
	    {
	    	System.out.println("YES");
	    }
	    else
	    {
	    	System.out.println("NO");
	    }
	}
}
