 
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
		int sum=0;
		double ans;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		ans=(double)sum/n;
		System.out.println(String.format("%.12f",ans));
	}
}
