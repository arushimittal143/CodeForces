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
		String str=sc.next();
		char c[]=str.toCharArray();
		int up=0,lc=0;
		for(int i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
			{
				up++;
			}
			else
			{
				lc++;
			}
		}
		if(up>lc)
		{
			System.out.println(str.toUpperCase());
		}
		else
		{
			System.out.println(str.toLowerCase());
		}
	}
}
