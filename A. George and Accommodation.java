//1st Method 
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
	        int count=0;
	        for(int i=0;i<t;i++)
	        {
	        	 int p=sc.nextInt();
	        	 int c=sc.nextInt();
	        	 int x=c-p;
	        	 int r=-1;
	        	 while(x>0)
	        	 {
	        	 	r=x-2;
	        	 	break;
	        	 }
	        	 if(r>=0)
	        	 {
	        	 	count++;
	        	 }
	        }
	        System.out.println(count);
	}
}

//2nd Method
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
	        int count=0;
	        for(int i=0;i<t;i++)
	        {
	        	 int p=sc.nextInt();
	        	 int c=sc.nextInt();
	        	 int x=c-p;
	        	 if((x-2) >=0) 
	        		count++;
	        }
	        System.out.println(count);
	}
}
