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
		int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	String str=sc.next();
	    	int s=str.length();
	    	//System.out.println(s);
	    	if(s>10)
	    	{
	    		System.out.print(str.charAt(0));
	    		System.out.print(s-2);
	    		System.out.println(str.charAt(s-1));
	    	}
	    	else
	    	{
	    		System.out.println(str);
	    	}
	    }
	}
}
