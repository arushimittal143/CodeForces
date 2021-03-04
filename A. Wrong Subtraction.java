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
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			int l=n%10;
			if(l==0)
			{
				n=n/10;
			}
			else
			{
				n=n-1;
			}
		}
		System.out.println(n);
	}
}
