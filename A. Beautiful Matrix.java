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
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int x=0;
	    for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==1)
			x=Math.abs(i-2)	+Math.abs(j-2);
			}
		}
		System.out.println(x);
		
	}
}
