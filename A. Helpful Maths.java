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
	    char[] ch=str.toCharArray();
	    int count=0,r=0,s=0;
	    for(int i=0;i<ch.length;i++)
	    {
	    	if(ch[i]=='1')
	    	count++;
	        if(ch[i]=='2')
	    	r++;
	    	if(ch[i]=='3')
	    	s++;
	    }
	    int total = count+r+s;
	    int current = 0;
	    
	    for(int i=0;i<count;i++)
	    {
	    	System.out.print("1");
	    	current++;
	    	if(current!=total)
	    		System.out.print('+');
	    }
	       for(int i=0;i<r;i++)
	    {
	    	System.out.print("2");
	    	current++;
	    	if(current!=total)
	    		System.out.print('+');
	    }
	       for(int i=0;i<s;i++)
	    {
	    	System.out.print("3");
	    	current++;
	    	if(current!=total)
	    		System.out.print('+');
	    }
	}
}
