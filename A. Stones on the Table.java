 
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
		String str=sc.next();
		int count=0;
		char c[]=str.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if((c[i]=='R' && c[i+1]=='R') || (c[i]=='B' && c[i+1]=='B') || (c[i]=='G' && c[i+1]=='G'))
			count++;
		}
		System.out.println(count);
	}
}
