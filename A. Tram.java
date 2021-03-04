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
		int x=0,mx=0;
		for(int i=0;i<n;i++)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
			x=x-a+b;
			if(x>mx)
			{
				mx=x;
			}
		}
	System.out.println(mx);
	}
}
