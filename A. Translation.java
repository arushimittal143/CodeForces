 
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
	        String t=sc.next();
	        String str="";
	        char ch[]=s.toCharArray();
	        for(int i=ch.length-1;i>=0;i--)
	        {
	        	str=str+ch[i];
	        }
	        if(t.equals(str))
	        {
	        	System.out.println("YES");
	        }
	        else
	        {
	        	System.out.println("NO");
	        }
	}
}
