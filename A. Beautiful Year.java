 
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
	        int t=sc.nextInt();
	        t++;
	        while(true)
	        {
	           int a=0,b=0,c=0,d=0;
	           int n=t;
			    a=n%10;  n=n/10;
			    b=n%10;  n=n/10;
			    c=n%10;  n=n/10;
			    d=n%10;  n=n/10;
	        if(a==b || b==c || c==d || a==d || b==d || a==c) 
	        {
	        	t++;
	        }
	        else
	        {
	        	break;
	        }
        	}
        	System.out.println(t);
	}
}
