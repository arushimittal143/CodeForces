import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes herezzz
		Scanner sc=new Scanner(System.in);
		long a[]=new long[4];
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long c=0;
		for(int i=0;i<3;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
