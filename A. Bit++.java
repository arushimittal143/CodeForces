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
		int t=sc.nextInt();
		int x=0;
		for(int i=0;i<t;i++)
		{
		String str=sc.next();
		if(str.equals("++X") || str.equals("X++"))
		{
			x=x+1;
		}
		else
		{
			x=x-1;
		}
		}
			System.out.println(x);
	}
}
