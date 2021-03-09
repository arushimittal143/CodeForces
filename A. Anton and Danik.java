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
	        String s=sc.next();
	        char ch[]=s.toCharArray();
	        int a=0,d=0;
	       for(int i=0;i<ch.length;i++)
	       {
	       	if(ch[i]=='A')
	       	{
	       		a++;
	       	}
	       	if(ch[i]=='D')
	       	{
	       		d++;
	       	}
	       }
	       if(a>d)
	       {
	       	System.out.println("Anton");
	       }
	       else if(d>a)
	       {
	       	System.out.println("Danik");
	       }
	       else
	       {
	       	System.out.println("Friendship");
	       }
	}
}
