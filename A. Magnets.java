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
		int m=sc.nextInt();
		String s1="";
		int c=0;
		for(int i=0;i<m;i++)
		{
			String s=sc.next();
			if((s.equals("10")) && (!(s.equals(s1))))
			{
				s1="10";
				c++;
			}
			else if((s.equals("01")) && (!(s.equals(s1))))
			{
				s1="01";
				c++;
			}
		}
		System.out.println(c);
	}
}
