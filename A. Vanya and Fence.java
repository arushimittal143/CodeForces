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
		int h=sc.nextInt();
		int a[]=new int[n];
		int total=0;
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>h)
			{
				total=total+2;
			}
			else
				{
			total=total+1;
			}
		}
		System.out.println(total);
	}
}
