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
	for(int i=1;i<=n;i++)
	{
    if(i%2==1)
    {
	System.out.print("I hate ");
    }
    else
    {
    	System.out.print("I love ");	
    }
	if(i==n){
	System.out.print("it");
	}
	else
	{
		System.out.print("that ");
	}
	}
	}
}
