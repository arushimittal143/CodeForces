 
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
		int count=0;
		for(int i=0;i<n;i++)
		{
				int A=sc.nextInt();
				int B=sc.nextInt();
				int C=sc.nextInt();
				int total = A+B+C;
				if(total>=2) count++;
		}
	    System.out.println(count);
	}
}
