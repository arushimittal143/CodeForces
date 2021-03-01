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
		String s=sc.next();
		s=s.toLowerCase();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='y' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='o')
			{
				c++;
			}
			else
			{
				System.out.print("."+s.charAt(i));
			}
			
		}
	}
}
