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
		int k=sc.nextInt();
		int l=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int d=sc.nextInt();
		int c=0;
		for(int i=1;i<=d;i++)
		{
			if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
