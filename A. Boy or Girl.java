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
		int count=0;
		char c[]=str.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length-1;i++)
		{
		//	System.out.printc[i]);
		if(c[i]==c[i+1])
		{
			count++;
		}
		}
	int sum=c.length-count;
     if(sum%2==0)
     {
     	System.out.println("CHAT WITH HER!");
     }
     else
     {
     	System.out.println("IGNORE HIM!");
     }
	}	
}
