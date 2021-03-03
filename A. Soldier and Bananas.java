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
		int n=sc.nextInt();
		int w=sc.nextInt();
		int sum=0;
		for(int i=1;i<=w;i++)
		{
				sum=sum+k*i;		
		}
		int bor=sum-n;
		if(bor>0)
		{
		System.out.println(bor);
		}
		else
		{
		System.out.println("0");
		}
		
	}
}
