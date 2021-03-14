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
		int p=sc.nextInt();
		Set<Integer> hs=new LinkedHashSet<>();
		while(p-->=1)
		{
			hs.add(sc.nextInt());
		}
		int q=sc.nextInt();
		while(q-->=1)
		{
			hs.add(sc.nextInt());
		}
		if(hs.size()==n){
		System.out.println("I become the guy.");
		}
		else
		System.out.println("Oh, my keyboard!");
	}
}
