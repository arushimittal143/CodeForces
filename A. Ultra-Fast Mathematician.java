 
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
		String r=sc.next();
	   char a[]=s.toCharArray();
	    char b[]=r.toCharArray();
	    for(int i=0;i<a.length;i++){
	    	if(a[i]==b[i])
	    	System.out.print(0);
	    	else
	    	System.out.print(1);
	    }
	}
}
